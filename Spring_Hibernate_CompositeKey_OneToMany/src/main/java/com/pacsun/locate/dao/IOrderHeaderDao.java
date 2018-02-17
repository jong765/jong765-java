package com.pacsun.locate.dao;

import java.util.List;

import com.pacsun.locate.model.OrderHeader;

public interface IOrderHeaderDao {

	public List<OrderHeader> findUnprocessedOrders() throws Exception;

	public List<OrderHeader> findOrdersForOpStatusUpdate() throws Exception;

	public void updateOrderStatus(String requestId, String statusCode) throws Exception;

	public void updateProcessFlag(OrderHeader orderHeader, String statusCode, int requestId) throws Exception;

}
