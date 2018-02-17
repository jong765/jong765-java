package com.pacsun.locate.submitorder.service;

import java.util.List;

import com.pacsun.locate.submitorder.model.OrderHeader;

public interface OrderHeaderService {

	public List<OrderHeader> findUnprocessedOrders();

}
