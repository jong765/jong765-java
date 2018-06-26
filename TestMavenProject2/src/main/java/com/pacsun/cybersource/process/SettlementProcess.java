package com.pacsun.cybersource.process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.pacsun.cybersource.constants.PacsunConstants;
import com.pacsun.cybersource.dao.SettlementDao;
import com.pacsun.cybersource.dao.SettlementDaoImpl;
import com.pacsun.cybersource.dto.SettlementDto;
import com.pacsun.cybersource.handler.CCCaptureHandler;
import com.pacsun.cybersource.handler.CCCreditHandler;
import com.pacsun.cybersource.handler.Handler;
import com.pacsun.util.HtmlEmail;
import com.pacsun.util.PropertyLoader;

public class SettlementProcess implements PacsunConstants {

	private Map<String, Handler> handlers;
	private Handler handler;
	private SettlementDao settlementDao = null;
	private List<Integer> errorList = new ArrayList<Integer>();
	private Properties cybsProperties = null;
	private Properties dbProperties = null;

	public SettlementProcess() {
		createHandlers();
	}

	public void run(String cybsPropertyFilePath, String dbPropertyFilePath) throws Exception {
		try {
			cybsProperties = PropertyLoader.load(cybsPropertyFilePath);
			dbProperties = PropertyLoader.load(dbPropertyFilePath);
			settlementDao = new SettlementDaoImpl(dbProperties);

			// Retrieve settlements
			List<SettlementDto> settlementDtoList = this.getSettlementDtoList(cybsProperties);
			for (SettlementDto settlementDto : settlementDtoList) {
				handler = this.lookupHandlerBy(settlementDto.getAction());
				if (handler != null) {
					Map<String, String> reply = this.callAPI(settlementDto);
					handler.processReply(reply, settlementDto, settlementDao, errorList);
				} else {
					String reasonCode = INVALID_ACTION_CODE;
					settlementDao.updateForError(settlementDto, reasonCode);
					errorList.add(settlementDto.getMerchantReferenceCode());
				}
			}

			// Send warning email if cybersource returned any error API response
			sendErrorEmail();

		} catch (Exception e) {
			throw e;
		}

	}

	private void createHandlers() {
		handlers = new HashMap<String, Handler>();
		handlers.put(CC_CAPTURE, new CCCaptureHandler(false));
		handlers.put(CC_REAUTH_CAPTURE, new CCCaptureHandler(true));
		handlers.put(CC_CREDIT, new CCCreditHandler());
	}

	public Map<String, String> callAPI(SettlementDto settlementDto) throws Exception {
		Map<String, String> reply;
		try {
			reply = handler.callAPI(settlementDao, settlementDto, cybsProperties, errorList);
		} catch (Exception e) {
			throw e;
		}
		return reply;
	}

	private void sendErrorEmail() throws Exception {
		// Send warning emails to recipients if any API error response occurred.
		if (!errorList.isEmpty()) {
			String emailSubject = "WARNING: Cybersource Credit Card Settlement Errors";
			StringBuilder sb = new StringBuilder("<p>Cybersource API has returned ERROR response for the following orders:</p>");
			for (Integer order : errorList) {
				sb.append("<p>" + order + "</p>");
			}
			sb.append("<p>Please review the errors and take an approriate action.</p>");
			String emailContent = sb.toString();
			HtmlEmail email = new HtmlEmail(cybsProperties, emailSubject, emailContent);
			email.sendEmail();
		}
	}

	public List<SettlementDto> getSettlementDtoList(Properties cybsProperties) throws Exception {
		try {
			List<SettlementDto> settlementDtoList = settlementDao.searchUnprocessedSettlements();
			return settlementDtoList;
		} catch (Exception e) {
			throw e;
		}
	}

	private Handler lookupHandlerBy(String handlerName) {
		return handlers.get(handlerName);
	}
}
