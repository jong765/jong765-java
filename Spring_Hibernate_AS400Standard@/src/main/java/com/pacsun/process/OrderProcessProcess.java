package com.pacsun.process;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.pacsun.model.OrderDetail;
import com.pacsun.model.OrderHeader;
import com.pacsun.service.OrderHeaderService;

public class OrderProcessProcess {

	@Autowired
	private OrderHeaderService orderHeaderService;

	public void run() {
		// Create orders
		OrderHeader orderHeader = new OrderHeader();
		orderHeader.setOrderNumber(1);
		// orderHeader.setOrderDate(new Date());
		orderHeader.setStatus("U");
		orderHeader.setCustomerNumber(1000);

		OrderDetail orderDetail1 = new OrderDetail(1, 1);
		orderDetail1.setItemNumber("34221");
		orderDetail1.setItemDescription("Nike Shoes");
		orderDetail1.setUnitPrice(55.20);
		orderHeader.getOrderDetail().add(orderDetail1);

		// OrderDetail orderDetail2 = new OrderDetail(1, 2);
		// orderDetail2.setItemNumber("41229");
		// orderDetail2.setItemDescription("Hurley T-Shirt");
		// orderDetail2.setUnitPrice(25.70);
		// orderHeader.getOrderDetail().add(orderDetail2);

		orderHeaderService.createOrder(orderHeader);

		// List unprocessed orders
		List<OrderHeader> orderHeaderList = orderHeaderService.findUnprocessedOrders();
		for (OrderHeader orderHeader1 : orderHeaderList) {
			System.out.println(orderHeader1.toString());
			Set<OrderDetail> orderDetailSet1 = orderHeader1.getOrderDetail();
			for (OrderDetail orderDetail : orderDetailSet1) {
				System.out.println(orderDetail);
			}
		}

		// Batch update unprocessed orders
		List<OrderHeader> orderHeaderList2 = orderHeaderService.findUnprocessedOrders();
		orderHeaderService.batchUpdateStatus(orderHeaderList2);

	}
}
