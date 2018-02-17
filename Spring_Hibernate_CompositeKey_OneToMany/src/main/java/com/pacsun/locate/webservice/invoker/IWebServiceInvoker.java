package com.pacsun.locate.webservice.invoker;

import java.rmi.RemoteException;

import com.microsretail.Locate.OrderUpdateRequestMessageTypeBean;
import com.microsretail.Locate.OrderUpdateResponseMessageTypeBean;
import com.microsretail.Locate.StatusListInquiryRequestMessageTypeBean;
import com.microsretail.Locate.StatusListInquiryResponseMessageTypeBean;
import com.microsretail.Locate.StatusUpdateRequestMessageTypeBean;
import com.microsretail.Locate.StatusUpdateResponseMessageTypeBean;
import com.microsretail.Locate.SubmitOrderRequestMessageTypeBean;
import com.microsretail.Locate.SubmitOrderResponseMessageTypeBean;

public interface IWebServiceInvoker {

	public SubmitOrderResponseMessageTypeBean callSubmitOrder(SubmitOrderRequestMessageTypeBean requestMessage)
			throws RemoteException;

	public StatusListInquiryResponseMessageTypeBean callStatusListRequest(
			StatusListInquiryRequestMessageTypeBean requestMessage) throws RemoteException;

	public StatusUpdateResponseMessageTypeBean callStatusUpdateRequest(StatusUpdateRequestMessageTypeBean requestMessage)
			throws RemoteException;

	public OrderUpdateResponseMessageTypeBean callOrderUpdateRequest(OrderUpdateRequestMessageTypeBean requestMessage)
			throws RemoteException;

}
