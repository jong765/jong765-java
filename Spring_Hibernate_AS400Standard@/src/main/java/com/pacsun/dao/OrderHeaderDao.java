package com.pacsun.dao;

import java.util.List;

import com.pacsun.model.OrderHeader;

public interface OrderHeaderDao {

	public void createOrder(OrderHeader orderHeader);

	public void updateStatus(OrderHeader orderHeader);

	public void batchUpdateStatus(List<OrderHeader> orderHeaderList);

	public OrderHeader findOrder(int orderNumber);

	public List<OrderHeader> findUnprocessedOrders();

}
