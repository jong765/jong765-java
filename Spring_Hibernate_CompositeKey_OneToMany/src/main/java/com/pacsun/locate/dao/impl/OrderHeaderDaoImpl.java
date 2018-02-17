package com.pacsun.locate.dao.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.pacsun.locate.dao.IOrderHeaderDao;
import com.pacsun.locate.model.OrderHeader;
import com.pacsun.util.DateFormatterUtil;
import com.pacsun.util.StackTrace;

@Repository
@Lazy
public class OrderHeaderDaoImpl implements IOrderHeaderDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Set<String> completedStatusSet;

	@Value("${locate.order.status.list.for.update}")
	private String LOCATE_ORDER_STATUS_LIST_FOR_UPDATE;

	private static final Logger log = Logger.getLogger(OrderHeaderDaoImpl.class);

	@SuppressWarnings("unchecked")
	public List<OrderHeader> findUnprocessedOrders() throws Exception {
		List<OrderHeader> returnList = null;

		try {
			Query query = sessionFactory.getCurrentSession().createQuery(
					"FROM OrderHeader h WHERE h.processFlag = :processFlag");
			query.setString("processFlag", "U");
			returnList = query.list();
		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}
		return returnList;
	}

	public void updateProcessFlag(OrderHeader orderHeader, String statusCode, int requestId) throws Exception {
		try {
			Query query = sessionFactory
					.getCurrentSession()
					.createQuery(
							"UPDATE OrderHeader h SET processFlag = :processFlag, requestId = :requestId, processDate = :processDate, processTime = :processTime "
									+ "WHERE h.id.orderNumber = :orderNumber"
									+ " AND h.id.pickTicketCode = :pickTicketCode"
									+ " AND h.id.fulfillmentLocation = :fulfillmentLocation");
			query.setParameter("processFlag", statusCode);
			query.setParameter("requestId", String.valueOf(requestId));
			query.setParameter("processDate", Integer.parseInt(DateFormatterUtil.formatDate(new Date(), "yyyyMMdd")));
			query.setParameter("processTime", Integer.parseInt(DateFormatterUtil.getCurrentTime()));
			query.setInteger("orderNumber", orderHeader.getId().getOrderNumber());
			query.setString("pickTicketCode", orderHeader.getId().getPickTicketCode());
			query.setString("fulfillmentLocation", orderHeader.getId().getFulfillmentLocation());
			query.executeUpdate();
		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}

	}

	public void updateOrderStatus(String requestId, String statusCode) throws Exception {
		try {
			Query query = sessionFactory.getCurrentSession().createQuery(
					"UPDATE OrderHeader h SET locateOrderStatus = :locateOrderStatus "
							+ "WHERE h.requestId = :requestId");
			query.setParameter("locateOrderStatus", statusCode);
			query.setString("requestId", requestId);
			query.executeUpdate();
		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}

	}

	/* We will update order status for PICKUP order only */
	@SuppressWarnings("unchecked")
	public List<OrderHeader> findOrdersForOpStatusUpdate() throws Exception {
		List<OrderHeader> returnList = null;

		try {
			Query query = sessionFactory.getCurrentSession().createQuery(
					"FROM OrderHeader h WHERE h.processFlag = :processFlag"
							+ " AND h.id.pickTicketCode = :pickTicketCode"
							+ " AND h.locateOrderStatus NOT IN :completedStatuses");
			query.setString("processFlag", "P");
			query.setString("pickTicketCode", "PCK");
			query.setParameterList("completedStatuses", completedStatusSet);
			returnList = query.list();
		} catch (Exception e) {
			log.error(this.getClass().getName() + " : " + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}
		return returnList;
	}

	@PostConstruct
	public void init() {
		this.setCompletedStatusSet(new HashSet<String>(Arrays.asList(LOCATE_ORDER_STATUS_LIST_FOR_UPDATE.split(","))));
	}

	public Set<String> getCompletedStatusSet() {
		return completedStatusSet;
	}

	public void setCompletedStatusSet(Set<String> completedStatusSet) {
		this.completedStatusSet = completedStatusSet;
	}
}
