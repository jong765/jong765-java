package com.pacsun.locate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacsun.locate.dao.IOrderDetailDao;
import com.pacsun.locate.model.OrderDetail;
import com.pacsun.locate.service.IOrderDetailService;

@Service
@Scope("prototype")
@Lazy
public class OrderDetailServiceImpl implements IOrderDetailService {

	@Autowired
	private IOrderDetailDao orderDetailDao;

	@Transactional
	public List<OrderDetail> findOrderLineItems(int orderNumber, String pickTicketCode, String fulfillingLocation)
			throws Exception {
		return orderDetailDao.findOrderLineItems(orderNumber, pickTicketCode, fulfillingLocation);
	}

	@Transactional
	public void populateLocateLineNumber(int orderId, String pickTicketCode, int requestId, int locateLineNumber,
			int requestingSystemLineNumber) throws Exception {
		orderDetailDao.populateLocateLineNumber(orderId, pickTicketCode, requestId, locateLineNumber,
				requestingSystemLineNumber);
	}

}
