package com.pacsun.locate.submitorder.dao;

import java.util.List;

import com.pacsun.locate.submitorder.model.OrderHeader;

public interface OrderHeaderDao {

	public List<OrderHeader> findUnprocessedOrders();

}
