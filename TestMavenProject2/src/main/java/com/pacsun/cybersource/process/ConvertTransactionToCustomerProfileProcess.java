package com.pacsun.cybersource.process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.cybersource.ws.client.Client;
import com.cybersource.ws.client.ClientException;
import com.cybersource.ws.client.FaultException;
import com.pacsun.cybersource.constants.PacsunConstants;
import com.pacsun.cybersource.dao.ProfileConvertDao;
import com.pacsun.cybersource.dao.ProfileConvertDaoImpl;
import com.pacsun.cybersource.dto.CustomerProfileConverterDto;
import com.pacsun.util.HtmlEmail;
import com.pacsun.util.MapUtil;
import com.pacsun.util.PropertyLoader;
import com.pacsun.util.StackTrace;

public class ConvertTransactionToCustomerProfileProcess implements PacsunConstants {

	ProfileConvertDao profileConvertDao = null;
	List<Integer> errorList = new ArrayList<Integer>();
	Properties cybsProperties = null;
	Properties dbProperties = null;
	String errorMessage;

	private static final Logger log = Logger.getLogger(ConvertTransactionToCustomerProfileProcess.class);

	public void run(String cybsPropertyFilePath, String dbPropertyFilePath) throws Exception {
		try {
			cybsProperties = PropertyLoader.load(cybsPropertyFilePath);
			dbProperties = PropertyLoader.load(dbPropertyFilePath);
			profileConvertDao = new ProfileConvertDaoImpl(dbProperties);

			// Retrieve transactions to get tokens
			List<CustomerProfileConverterDto> converterDtoList = this.getConverterDtoList(cybsProperties);

			for (CustomerProfileConverterDto converterDto : converterDtoList) {
				String token = this.callAPI(converterDto, cybsProperties);
				profileConvertDao.updateProcessedOrder(converterDto.getMerchantReferenceCode(), token);
			}

			// Send warning email if cybersource returned any error API response
			sendErrorEmail();

		} catch (Exception e) {
			errorMessage = this.getClass().getName() + " : " + StackTrace.getStackTrace(e);
			log.error(errorMessage);
			throw new Exception(errorMessage);
		}

	}

	private void sendErrorEmail() throws Exception {
		// Send warning emails to recipients if any API error response occurred.
		if (!errorList.isEmpty()) {
			String emailSubject = "WARNING: Cybersource Convert Transaction to Customer Profile for Tokenization Errors";
			StringBuilder sb = new StringBuilder(
					"<p>Cybersource API has returned ERROR response for the following orders:</p><p>&nbsp;</p>");
			for (Integer order : errorList) {
				sb.append("<p>" + order + "</p>");
			}
			sb.append("<p>&nbsp;</p><p>Please review the errors and take an approriate action.</p>");
			String emailContent = sb.toString();
			HtmlEmail email = new HtmlEmail(cybsProperties, emailSubject, emailContent);
			email.sendEmail();
		}
	}

	public List<CustomerProfileConverterDto> getConverterDtoList(Properties cybsProperties) throws Exception {
		try {
			List<CustomerProfileConverterDto> converterDtoList = profileConvertDao.searchUnprocessedOrders();
			return converterDtoList;
		} catch (Exception e) {
			errorMessage = this.getClass().getName() + " : " + StackTrace.getStackTrace(e);
			log.error(errorMessage);
			throw new Exception(errorMessage);
		}
	}

	@SuppressWarnings("unchecked")
	public String callAPI(CustomerProfileConverterDto converterDto, Properties cybsProps) throws Exception {
		String token = null;
		try {
			HashMap<String, String> request = this.buildRequest(converterDto);

			log.info(MapUtil.displayMap("PaySubscriptionCreate Request:", request));
			// run transaction now
			Map<String, String> reply = Client.runTransaction(request, cybsProps);
			log.info(MapUtil.displayMap("PaySubscriptionCreate Reply:", reply));

			String reasonCode = reply.get("reasonCode");

			if (reasonCode.equals(SUCCESS)) {
				token = (String) reply.get("paySubscriptionCreateReply_subscriptionID");
			} else {
				// Update the record with error to review or reprocess later
				profileConvertDao.updateForError(converterDto.getMerchantReferenceCode());

				// Add to error list
				errorList.add(converterDto.getMerchantReferenceCode());
			}

		} catch (ClientException e) {
			errorMessage = this.getClass().getName() + " : " + StackTrace.getStackTrace(e);
			log.error(errorMessage);
			throw new Exception(errorMessage);
		} catch (FaultException e) {
			errorMessage = this.getClass().getName() + " : " + StackTrace.getStackTrace(e);
			log.error(errorMessage);
			throw new Exception(errorMessage);
		}

		return token;
	}

	private HashMap<String, String> buildRequest(CustomerProfileConverterDto converterDto) {
		HashMap<String, String> request = new HashMap<String, String>();

		request.put("paySubscriptionCreateService_run", "true");
		request.put("merchantID", "pacsun");
		request.put("merchantReferenceCode", String.valueOf(converterDto.getMerchantReferenceCode()));
		request.put("paySubscriptionCreateService_paymentRequestID", converterDto.getAuthRequestId());
		request.put("recurringSubscriptionInfo_frequency", "on-demand");

		return request;
	}
}
