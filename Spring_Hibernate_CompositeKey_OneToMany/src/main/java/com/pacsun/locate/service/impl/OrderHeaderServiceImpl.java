package com.pacsun.locate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacsun.locate.dao.IOrderHeaderDao;
import com.pacsun.locate.model.OrderHeader;
import com.pacsun.locate.service.IOrderHeaderService;

@Service
@Scope("prototype")
@Lazy
public class OrderHeaderServiceImpl implements IOrderHeaderService {

	@Autowired
	private IOrderHeaderDao orderHeaderDao;

	@Transactional
	public List<OrderHeader> findUnprocessedOrders() throws Exception {
		return orderHeaderDao.findUnprocessedOrders();
	}

	@Transactional
	public void updateOrderStatus(String requestId, String statusCode) throws Exception {
		orderHeaderDao.updateOrderStatus(requestId, statusCode);
	}

	@Transactional
	public void updateProcessFlag(OrderHeader orderHeader, String statusCode, int requestId) throws Exception {
		orderHeaderDao.updateProcessFlag(orderHeader, statusCode, requestId);
	}

	@Transactional
	public List<OrderHeader> findOrdersForOpStatusUpdate() throws Exception {
		return orderHeaderDao.findOrdersForOpStatusUpdate();
	}

}
