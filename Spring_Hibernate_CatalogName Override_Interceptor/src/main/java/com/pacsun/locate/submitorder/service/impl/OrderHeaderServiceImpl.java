package com.pacsun.locate.submitorder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacsun.locate.submitorder.dao.OrderHeaderDao;
import com.pacsun.locate.submitorder.model.OrderHeader;
import com.pacsun.locate.submitorder.service.OrderHeaderService;

@Service
public class OrderHeaderServiceImpl implements OrderHeaderService {

	@Autowired
	private OrderHeaderDao orderHeaderDao;

	@Transactional
	public List<OrderHeader> findUnprocessedOrders() {
		return orderHeaderDao.findUnprocessedOrders();
	}

}
