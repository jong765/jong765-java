package com.pacsun.dto;

import java.util.Date;

public class OrderDto {

	private int orderNumber;
	private Date orderDate;
	private Date shipDate;
	private String customerName;

	public OrderDto(int orderNumber, Date orderDate, Date shipDate, String customerName) {

		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.shipDate = shipDate;
		this.customerName = customerName;

	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = "\n";

		result.append(this.getClass().getName() + " Object {" + NEW_LINE);
		result.append(" Order number: " + orderNumber + NEW_LINE);
		result.append(" Order date: " + orderDate + NEW_LINE);
		result.append(" Ship date: " + shipDate + NEW_LINE);
		result.append(" Customer name: " + customerName + NEW_LINE);
		result.append("}");

		return result.toString();
	}

}
