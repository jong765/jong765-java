package com.pacsun.locate.handler;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.microsretail.Locate.MessageHeaderTypeBean;
import com.microsretail.Locate.SubmitOrderResponseMessageBodyTypeBean;
import com.microsretail.Locate.SubmitOrderResponseMessageFulfillmentDetail;
import com.microsretail.Locate.SubmitOrderResponseMessageResponseTypeBean;
import com.microsretail.Locate.SubmitOrderResponseMessageTypeBean;
import com.pacsun.locate.model.OrderHeader;
import com.pacsun.locate.service.IOrderDetailService;
import com.pacsun.locate.service.IOrderHeaderService;
import com.pacsun.util.StackTrace;

@Component
@Scope("prototype")
@Lazy
public class SubmitOrderResponseHandler {

	@Autowired
	private IOrderHeaderService orderHeaderService;

	@Autowired
	private IOrderDetailService orderDetailService;

	private int processCounter = 0;
	private int errorCounter = 0;

	private static final Logger log = Logger.getLogger(SubmitOrderResponseHandler.class);

	public void processResponse(OrderHeader orderHeader, SubmitOrderResponseMessageTypeBean responseMessage)
			throws Exception {
		try {
			MessageHeaderTypeBean responseHeader = responseMessage.getMessage_header();
			SubmitOrderResponseMessageBodyTypeBean responseBody = responseMessage.getMessage_body();
			SubmitOrderResponseMessageResponseTypeBean response = null;

			int orderId = orderHeader.getId().getOrderNumber();
			String pickTicketCode = orderHeader.getId().getPickTicketCode();
			String fulfillmentLocation = orderHeader.getId().getFulfillmentLocation();

			int requestId = 0;
			int responseCode = 0;
			String responseDescription = null;
			String statusCode = "";

			if (responseHeader != null) {
				String actionResponse = responseHeader.getXaction_response();

				if (responseBody != null) {
					response = responseBody.getResponse();
					responseCode = response.getResponse_code();
					responseDescription = response.getResponse_description();
					requestId = response.getRequest_id();
				}

				if (actionResponse.equalsIgnoreCase("OK")) {
					SubmitOrderResponseMessageFulfillmentDetail[] details = response.getFulfillment_details();
					this.updateOrderDetailLocateLineNumber(orderId, requestId, pickTicketCode, details);
					statusCode = "P";
					this.processCounter++;
				} else {
					statusCode = "E";
					String errorMessage = "SubmitOrder could not create an order: OrderId=" + orderId
							+ ", PickTicketCode=" + pickTicketCode + ", FulfillmentLocation="
							+ fulfillmentLocation.trim() + ", ResponseCode=" + responseCode + ", ResponseDescription="
							+ responseDescription;
					log.error(errorMessage);
					this.errorCounter++;
				}
			} else {
				statusCode = "E";
				String errorMessage = "SubmitOrder could not create an order: OrderId=" + orderId + ", PickTicketCode="
						+ pickTicketCode + ", ResponseHeader=" + responseHeader;
				log.error(errorMessage);
				this.errorCounter++;
			}

			orderHeaderService.updateProcessFlag(orderHeader, statusCode, requestId);

		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}

	}

	public void updateOrderDetailLocateLineNumber(int orderId, int requestId, String pickTicketCode,
			SubmitOrderResponseMessageFulfillmentDetail[] details) throws Exception {
		for (int i = 0; i < details.length; i++) {
			int locateLineNumber = details[i].getLine_no();
			int requestingSystemLineNumber = details[i].getRequesting_system_line_no();
			String fulfillingLocationCode = details[i].getFulfillment_location_cd();
			orderDetailService.populateLocateLineNumber(orderId, pickTicketCode, requestId, locateLineNumber,
					requestingSystemLineNumber);
		}
	}

	public int getProcessCounter() {
		return processCounter;
	}

	public void setProcessCounter(int processCounter) {
		this.processCounter = processCounter;
	}

	public int getErrorCounter() {
		return errorCounter;
	}

	public void setErrorCounter(int errorCounter) {
		this.errorCounter = errorCounter;
	}

}
