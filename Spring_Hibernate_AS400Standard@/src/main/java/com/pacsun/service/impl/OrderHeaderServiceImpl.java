package com.pacsun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacsun.dao.OrderHeaderDao;
import com.pacsun.model.OrderHeader;
import com.pacsun.service.OrderHeaderService;

@Service
public class OrderHeaderServiceImpl implements OrderHeaderService {

	@Autowired
	private OrderHeaderDao orderHeaderDao;

	@Transactional
	public void createOrder(OrderHeader orderHeader) {
		orderHeaderDao.createOrder(orderHeader);
	}

	@Transactional
	public void updateStatus(OrderHeader orderHeader) {
		orderHeaderDao.updateStatus(orderHeader);
	}

	@Transactional
	public void batchUpdateStatus(List<OrderHeader> orderHeaderList) {
		orderHeaderDao.batchUpdateStatus(orderHeaderList);
	}

	@Transactional
	public OrderHeader findOrder(int orderNumber) {
		return orderHeaderDao.findOrder(orderNumber);
	}

	@Transactional
	public List<OrderHeader> findUnprocessedOrders() {
		return orderHeaderDao.findUnprocessedOrders();
	}

}
