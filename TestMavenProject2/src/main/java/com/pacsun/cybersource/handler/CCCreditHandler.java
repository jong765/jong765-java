package com.pacsun.cybersource.handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.cybersource.ws.client.Client;
import com.pacsun.cybersource.constants.PacsunConstants;
import com.pacsun.cybersource.dao.SettlementDao;
import com.pacsun.cybersource.dto.SettlementDto;
import com.pacsun.util.MapUtil;

public class CCCreditHandler implements Handler, PacsunConstants {

	String errorMessage;

	private static final Logger log = Logger.getLogger(CCCreditHandler.class);

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, String> callAPI(SettlementDao settlementDao, SettlementDto settlementDto, Properties cybsProperties,
			List<Integer> errorList) throws Exception {
		try {
			HashMap<String, String> request = this.buildRequest(settlementDto);
			log.info(MapUtil.displayMap("CCCredit Request:", request));
			// run transaction now
			Map<String, String> reply = Client.runTransaction(request, cybsProperties);
			log.info(MapUtil.displayMap("CCCredit Reply:", reply));
			return reply;
		} catch (Exception e) {
			throw e;
		}
	}

	public void processReply(Map<String, String> reply, SettlementDto settlementDto, SettlementDao settlementDao, List<Integer> errorList)
			throws Exception {
		try {
			String reasonCode = reply.get("reasonCode");
			int merchantReferenceCode = settlementDto.getMerchantReferenceCode();
			if (reasonCode.equals(SUCCESS)) {
				settlementDao.updateProcessedCredit(settlementDto, reasonCode);
			} else {
				// Update the record with error to review or reprocess later
				settlementDao.updateForError(settlementDto, reasonCode);

				// Add to error list
				errorList.add(merchantReferenceCode);
			}
		} catch (Exception e) {
			throw e;
		}
	}

	private HashMap<String, String> buildRequest(SettlementDto settlementDto) {
		HashMap<String, String> request = new HashMap<String, String>();

		request.put("ccCreditService_run", "true");
		request.put("merchantID", "pacsun");
		request.put("merchantReferenceCode", String.valueOf(settlementDto.getMerchantReferenceCode()));
		request.put("ccCreditService_captureRequestID", settlementDto.getCaptureRequestId());
		request.put("purchaseTotals_currency", "USD");
		request.put("purchaseTotals_grandTotalAmount", String.valueOf(settlementDto.getAmount()));

		return request;
	}
}
