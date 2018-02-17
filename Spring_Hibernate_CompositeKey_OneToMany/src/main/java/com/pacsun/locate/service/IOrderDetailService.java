package com.pacsun.locate.service;

import java.util.List;

import com.pacsun.locate.model.OrderDetail;

public interface IOrderDetailService {

	public List<OrderDetail> findOrderLineItems(int orderNumber, String pickTicketCode, String fulfillingLocation)
			throws Exception;

	public void populateLocateLineNumber(int orderId, String pickTicketCode, int requestId, int locateLineNumber,
			int requestingSystemLineNumber) throws Exception;

}
