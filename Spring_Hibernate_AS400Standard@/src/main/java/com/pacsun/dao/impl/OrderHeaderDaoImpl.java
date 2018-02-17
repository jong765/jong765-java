package com.pacsun.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pacsun.dao.OrderHeaderDao;
import com.pacsun.model.OrderHeader;

@Repository
public class OrderHeaderDaoImpl implements OrderHeaderDao {

	@Autowired
	private SessionFactory session;

	public void createOrder(OrderHeader orderHeader) {
		session.getCurrentSession().save(orderHeader);
	}

	public void updateStatus(OrderHeader orderHeader) {
		orderHeader.setStatus("A");
		session.getCurrentSession().update(orderHeader);
	}

	public void batchUpdateStatus(List<OrderHeader> orderHeaderList) {
		int i = 0;
		for (OrderHeader orderHeader : orderHeaderList) {
			orderHeader.setStatus("A");
			session.getCurrentSession().update(orderHeader);
			if (i % 20 == 0) { // 20, same as the JDBC batch size
				// flush a batch of inserts and release memory:
				session.getCurrentSession().flush();
				session.getCurrentSession().clear();
			}
		}
	}

	public OrderHeader findOrder(int orderNumber) {
		return (OrderHeader) session.getCurrentSession().get(OrderHeader.class, orderNumber);
	}

	@SuppressWarnings("unchecked")
	public List<OrderHeader> findUnprocessedOrders() {
		Query query = session.getCurrentSession().createQuery("from OrderHeader");
		List<OrderHeader> orderHeaderList = query.list();
		return orderHeaderList;
	}

}
