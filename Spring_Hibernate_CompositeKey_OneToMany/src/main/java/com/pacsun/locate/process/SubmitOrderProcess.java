package com.pacsun.locate.process;

import java.rmi.RemoteException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.microsretail.Locate.SubmitOrderRequestMessageHeaderTypeBean;
import com.microsretail.Locate.SubmitOrderResponseMessageTypeBean;
import com.pacsun.locate.builder.SubmitOrderRequestBuilder;
import com.pacsun.locate.constants.EmailConstants;
import com.pacsun.locate.handler.SubmitOrderResponseHandler;
import com.pacsun.locate.model.OrderHeader;
import com.pacsun.locate.webservice.invoker.IWebServiceInvoker;
import com.pacsun.util.StackTrace;

@Component
@Scope("prototype")
@Lazy
public class SubmitOrderProcess extends LocateProcess implements Runnable, EmailConstants {

	public Thread t;

	@Autowired
	private SubmitOrderResponseHandler orderResponseHandler;

	@Autowired
	private SubmitOrderRequestBuilder submitOrderRequestBuilder;

	@Autowired
	private SubmitOrderRequestMessageHeaderTypeBean messageHeader;

	@Autowired
	private IWebServiceInvoker webServiceInvoker;

	private List<OrderHeader> orderHeaderList;

	private int errorCounter = 0;

	@Value("${as400.submit.order.job.log}")
	private String SUBMIT_ORDER_JOB_LOG;

	private static final Logger log = Logger.getLogger(SubmitOrderProcess.class);

	public void run() {
		log.info("Locate submit order process has started.");

		try {
			if (orderHeaderList.size() > 0) {
				// Loop through OP order header list and submit orders to Locate
				for (OrderHeader orderHeader : orderHeaderList) {
					try {
						this.buildSubmitOrderRequestMessage(orderHeader);
						SubmitOrderResponseMessageTypeBean response = this.callSubmitOrderWebService();
						orderResponseHandler.processResponse(orderHeader, response);
					} catch (Exception e) {
						errorCounter++;
						String errorMessage = "Error: OrderId=" + orderHeader.getId().getOrderNumber()
								+ ", PickTicketCode=" + orderHeader.getId().getPickTicketCode()
								+ ", FulfillmentLocation=" + orderHeader.getId().getFulfillmentLocation();
						log.error(errorMessage);
					}
				}
				log.info("Locate submit order process has completed. " + orderResponseHandler.getProcessCounter()
						+ " order(s) have processed. " + orderResponseHandler.getErrorCounter() + " error(s) occurred.");
			} else {
				log.info("Locate submit order process: There are no orders to process at this time.");
			}

			// Send email notification if there were any errors in submitting
			// orders
			// to locate
			if (errorCounter > 0 || orderResponseHandler.getErrorCounter() > 0) {
				String content = "Some of Submit Order API processes have failed. Please review job log in "
						+ SUBMIT_ORDER_JOB_LOG;
				htmlEmail.setContent(content);
				sendEmailNotification();
			}
		} catch (Exception e) {
			String errorMessage = this.getClass().getName() + " : " + "Error in Locate Submit Order process.\n"
					+ StackTrace.getStackTrace(e);
			log.error(errorMessage);
		}
	}

	public SubmitOrderResponseMessageTypeBean callSubmitOrderWebService() throws RemoteException {
		return webServiceInvoker.callSubmitOrder(submitOrderRequestBuilder.getOrderRequestMessage());
	}

	public void buildSubmitOrderRequestMessage(OrderHeader orderHeader) throws Exception {
		submitOrderRequestBuilder.build(orderHeader);
	}

	public void buildMessageHeader() {
		messageHeader.setXaction_type(LOCATE_REQUEST_MESSAGE_HEADER_XACTION_TYPE);
		messageHeader.setXaction_response(LOCATE_REQUEST_MESSAGE_HEADER_XACTION_RESPONSE);
		messageHeader.setVersion(LOCATE_REQUEST_MESSAGE_HEADER_LOCATE_VERSION);
		messageHeader.setDestination(LOCATE_REQUEST_MESSAGE_HEADER_DESTINATION);
		messageHeader.setMessage_type(LOCATE_REQUEST_MESSAGE_HEADER_MESSAGE_TYPE);
		messageHeader.setSource(LOCATE_REQUEST_MESSAGE_HEADER_SOURCE);
	}

	@PostConstruct
	public void init() {
		buildMessageHeader();
	}

	public void setupThread(String name) {
		t = new Thread(this, name);
	}

	public List<OrderHeader> getOrderHeaderList() {
		return orderHeaderList;
	}

	public void setOrderHeaderList(List<OrderHeader> orderHeaderList) {
		this.orderHeaderList = orderHeaderList;
	}

	public IWebServiceInvoker getWebServiceInvoker() {
		return webServiceInvoker;
	}

	public void setWebServiceInvoker(IWebServiceInvoker webServiceInvoker) {
		this.webServiceInvoker = webServiceInvoker;
	}

	public Thread getT() {
		return t;
	}

	public void setT(Thread t) {
		this.t = t;
	}

}
