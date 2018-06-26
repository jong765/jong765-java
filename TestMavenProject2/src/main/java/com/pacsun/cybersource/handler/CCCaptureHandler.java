package com.pacsun.cybersource.handler;

import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.httpclient.ConnectTimeoutException;
import org.apache.log4j.Logger;
import org.xml.sax.SAXParseException;

import com.cybersource.ws.client.Client;
import com.cybersource.ws.client.ClientException;
import com.pacsun.cybersource.constants.PacsunConstants;
import com.pacsun.cybersource.dao.SettlementDao;
import com.pacsun.cybersource.dto.SettlementDto;
import com.pacsun.util.MapUtil;
import com.pacsun.util.StackTrace;

public class CCCaptureHandler implements Handler, PacsunConstants {

	boolean reauthRequired;
	String errorMessage;

	private static final Logger log = Logger.getLogger(CCCaptureHandler.class);

	public CCCaptureHandler(boolean reauthRequired) {
		this.reauthRequired = reauthRequired;
	}

	@Override
	public Map<String, String> callAPI(SettlementDao settlementDao, SettlementDto settlementDto, Properties cybsProperties,
			List<Integer> errorList) throws Exception {
		try {
			HashMap<String, String> request = this.buildRequest(settlementDto);
			log.info(MapUtil.displayMap("CCCapture Request:", request));

			Map<String, String> reply = null;

			// run transaction now - Retry only for Capture in case of connection timeout.
			if (settlementDto.getAction().equalsIgnoreCase(CC_CAPTURE)) {
				reply = callAPIWithRetry(request, cybsProperties);
			} else {
				reply = callAPIWithoutRetry(request, cybsProperties);
			}

			log.info(MapUtil.displayMap("CCCapture Reply:", reply));
			return reply;
		} catch (Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	private Map<String, String> callAPIWithoutRetry(HashMap<String, String> request, Properties cybsProperties) throws Exception {
		Map<String, String> reply = new HashMap<String, String>();
		try {
			reply = Client.runTransaction(request, cybsProperties);
			return reply;
		} catch (ClientException e) {
			if (e.getInnerException() instanceof SAXParseException) {
				reply.put("reasonCode", "PAC02");
				String errorMessage = this.getClass().getName() + " : " + e.getMessage() + "\n" + StackTrace.getStackTrace(e);
				log.error(errorMessage);
				return reply;
			} else {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("unchecked")
	private Map<String, String> callAPIWithRetry(HashMap<String, String> request, Properties cybsProperties) throws Exception {

		Map<String, String> reply = null;
		boolean connectionTimedout = false;
		boolean retry = true;
		int counter = 0;

		while (retry) {
			connectionTimedout = false;

			try {
				reply = Client.runTransaction(request, cybsProperties);
			} catch (ClientException e) {
				if (e.getInnerException() instanceof ConnectTimeoutException || e.getInnerException() instanceof SocketTimeoutException
						|| e.getInnerException() instanceof SocketException) {
					connectionTimedout = true;
					Thread.sleep(5000);
				} else if (e.getInnerException() instanceof SAXParseException) {
					reply.put("reasonCode", "PAC02");
					errorMessage = this.getClass().getName() + " : " + e.getMessage() + "\n" + StackTrace.getStackTrace(e);
					log.error(errorMessage);
					return reply;
				} else {
					throw e;
				}
			} catch (Exception e) {
				throw e;
			}
			counter++;
			if (connectionTimedout) {
				if (counter < Integer.parseInt(cybsProperties.getProperty(API_REQUEST_RETRIAL_ATTEMPT)))
					retry = true;
				else
					throw new ConnectTimeoutException("Connection timed out");
			} else {
				retry = false;
			}
		}
		return reply;

	}

	public void processReply(Map<String, String> reply, SettlementDto settlementDto, SettlementDao settlementDao, List<Integer> errorList)
			throws Exception {
		try {
			String reasonCode = reply.get("reasonCode");
			int merchantReferenceCode = settlementDto.getMerchantReferenceCode();
			String captureRequestId = "";
			String processFlag = PROCESS_UNPROCESSED;

			if (reasonCode.equals(SUCCESS)) {
				processFlag = PROCESS_SUCCESS;
				captureRequestId = (String) reply.get("requestID");
			} else {
				processFlag = PROCESS_ERROR;
				// Add to error list
				errorList.add(merchantReferenceCode);
			}
			settlementDao.updateProcessedCapture(processFlag, settlementDto, captureRequestId, reasonCode);
		} catch (Exception e) {
			throw e;
		}
	}

	private HashMap<String, String> buildRequest(SettlementDto settlementDto) {
		HashMap<String, String> request = new HashMap<String, String>();
		request.put("merchantID", "pacsun");
		request.put("merchantReferenceCode", String.valueOf(settlementDto.getMerchantReferenceCode()));
		request.put("ccCaptureService_run", "true");

		switch (this.getCaptureType(settlementDto)) {

		case "Capture":
			request.put("ccCaptureService_authRequestID", settlementDto.getAuthRequestId());
			request.put("purchaseTotals_currency", "USD");
			request.put("purchaseTotals_grandTotalAmount", String.valueOf(settlementDto.getAmount()));
			break;
		case "SequentialCapture":
			request.put("ccCaptureService_sequence", String.valueOf(settlementDto.getSequence()));
			request.put("ccCaptureService_totalCount", String.valueOf(settlementDto.getTotalCount()));
			request.put("ccCaptureService_authRequestID", settlementDto.getAuthRequestId());
			request.put("purchaseTotals_currency", "USD");
			request.put("purchaseTotals_grandTotalAmount", String.valueOf(settlementDto.getAmount()));
			break;
		case "ReauthCapture":
			request.put("ccAuthService_run", "true");
			request.put("purchaseTotals_currency", "USD");
			request.put("purchaseTotals_grandTotalAmount", String.valueOf(settlementDto.getAmount()));
			request.put("recurringSubscriptionInfo_subscriptionID", settlementDto.getTokenNumber());
			break;
		}
		return request;
	}

	private String getCaptureType(SettlementDto settlementDto) {
		String captureType = null;

		String sendSequenceFlag = settlementDto.getSendSequenceFlag();

		if (this.reauthRequired)
			captureType = "ReauthCapture";
		else if (sendSequenceFlag.equalsIgnoreCase("Y"))
			captureType = "SequentialCapture";
		else
			captureType = "Capture";

		return captureType;
	}

	public boolean isReauthRequired() {
		return reauthRequired;
	}

	public void setReauthRequired(boolean reauthRequired) {
		this.reauthRequired = reauthRequired;
	}

}
