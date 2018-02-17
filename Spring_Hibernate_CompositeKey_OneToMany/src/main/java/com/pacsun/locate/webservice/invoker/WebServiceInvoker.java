package com.pacsun.locate.webservice.invoker;

import java.rmi.RemoteException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.microsretail.Locate.LocateProxy;
import com.microsretail.Locate.OrderUpdateRequestMessageTypeBean;
import com.microsretail.Locate.OrderUpdateResponseMessageTypeBean;
import com.microsretail.Locate.StatusListInquiryRequestMessageTypeBean;
import com.microsretail.Locate.StatusListInquiryResponseMessageTypeBean;
import com.microsretail.Locate.StatusUpdateRequestMessageTypeBean;
import com.microsretail.Locate.StatusUpdateResponseMessageTypeBean;
import com.microsretail.Locate.SubmitOrderRequestMessageTypeBean;
import com.microsretail.Locate.SubmitOrderResponseMessageTypeBean;

@Component
@Scope("prototype")
@Lazy
public class WebServiceInvoker implements IWebServiceInvoker {

	private LocateProxy locateProxy;

	@Value("${locate.endpoint.url}")
	protected String ENDPOINT_URL;

	public SubmitOrderResponseMessageTypeBean callSubmitOrder(SubmitOrderRequestMessageTypeBean requestMessage)
			throws RemoteException {
		SubmitOrderResponseMessageTypeBean response = locateProxy.submitOrder(requestMessage);
		return response;
	}

	public StatusListInquiryResponseMessageTypeBean callStatusListRequest(
			StatusListInquiryRequestMessageTypeBean requestMessage) throws RemoteException {
		StatusListInquiryResponseMessageTypeBean response = locateProxy.statusListRequest(requestMessage);
		return response;
	}

	public StatusUpdateResponseMessageTypeBean callStatusUpdateRequest(StatusUpdateRequestMessageTypeBean requestMessage)
			throws RemoteException {
		StatusUpdateResponseMessageTypeBean response = locateProxy.statusUpdate(requestMessage);
		return response;
	}

	public OrderUpdateResponseMessageTypeBean callOrderUpdateRequest(OrderUpdateRequestMessageTypeBean requestMessage)
			throws RemoteException {
		OrderUpdateResponseMessageTypeBean response = locateProxy.orderUpdate(requestMessage);
		return response;
	}

	@PostConstruct
	public void init() {
		locateProxy = new LocateProxy();
		locateProxy.setEndpoint(ENDPOINT_URL);
	}

}
