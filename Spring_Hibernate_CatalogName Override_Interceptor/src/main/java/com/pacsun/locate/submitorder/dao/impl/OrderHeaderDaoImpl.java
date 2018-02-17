package com.pacsun.locate.submitorder.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pacsun.locate.submitorder.dao.OrderHeaderDao;
import com.pacsun.locate.submitorder.model.OrderHeader;
import com.pacsun.locate.submitorder.process.LocateSubmitOrderProcess;

@Repository
public class OrderHeaderDaoImpl implements OrderHeaderDao {

	@Autowired
	private SessionFactory sessionFactory;

	private static final Logger log = Logger.getLogger(LocateSubmitOrderProcess.class);

	@SuppressWarnings("unchecked")
	public List<OrderHeader> findUnprocessedOrders() {
		List<OrderHeader> returnList = null;
		try {
			Query query = sessionFactory.getCurrentSession().createQuery(
					"FROM OrderHeader h WHERE h.processFlag = :processFlag");
			query.setString("processFlag", "U");
			returnList = query.list();

		} catch (Exception e) {
			log.error(e.getMessage());
			System.out.println(e.getMessage());
		}
		return returnList;
	}
}
