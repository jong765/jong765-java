package com.pacsun.locate.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.pacsun.locate.dao.IOrderDetailDao;
import com.pacsun.locate.model.OrderDetail;
import com.pacsun.util.StackTrace;

@Repository
@Lazy
public class OrderDetailDaoImpl implements IOrderDetailDao {

	@Autowired
	private SessionFactory sessionFactory;

	private static final Logger log = Logger.getLogger(OrderDetailDaoImpl.class);

	@SuppressWarnings("unchecked")
	public List<OrderDetail> findOrderLineItems(int orderNumber, String pickTicketCode, String fulfillingLocation)
			throws Exception {
		List<OrderDetail> returnList = null;

		try {
			Query query = sessionFactory
					.getCurrentSession()
					.createQuery(
							"FROM OrderDetail d WHERE d.id.orderNumber = :orderNumber AND d.id.pickTicketCode = :pickTicketCode AND d.id.fulfillingLocation = :fulfillingLocation");
			query.setInteger("orderNumber", orderNumber);
			query.setString("pickTicketCode", pickTicketCode);
			query.setString("fulfillingLocation", fulfillingLocation);
			returnList = query.list();
		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}
		return returnList;
	}

	public void populateLocateLineNumber(int orderId, String pickTicketCode, int requestId, int locateLineNumber,
			int requestingSystemLineNumber) throws Exception {
		try {
			Query query = sessionFactory.getCurrentSession().createQuery(
					"UPDATE OrderDetail d SET requestId = :requestId, locateLineNumber = :locateLineNumber "
							+ "WHERE d.id.orderNumber = :orderNumber AND d.id.pickTicketCode = :pickTicketCode"
							+ " AND d.id.itemLine = :requestingSystemLineNumber");
			query.setParameter("requestId", String.valueOf(requestId));
			query.setParameter("locateLineNumber", locateLineNumber);
			query.setInteger("orderNumber", orderId);
			query.setString("pickTicketCode", pickTicketCode);
			query.setInteger("requestingSystemLineNumber", requestingSystemLineNumber);
			query.executeUpdate();
		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}

	}
}
