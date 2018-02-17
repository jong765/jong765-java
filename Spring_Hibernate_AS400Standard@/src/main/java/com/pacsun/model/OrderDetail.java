package com.pacsun.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JKORDDTL", catalog = "JKIM2")
public class OrderDetail implements Serializable {

	private static final long serialVersionUID = 2918189214241003269L;

	@Id
	private OrderNumberLineKey orderNumberLineKey;

	@Column(name = "ODITEM")
	private String itemNumber;

	@Column(name = "ODIDSC")
	private String itemDescription;

	@Column(name = "ODUPRC")
	private Double unitPrice;

	public OrderDetail() {
	}

	public OrderDetail(int orderNumber, int lineNumber) {
		orderNumberLineKey = new OrderNumberLineKey(orderNumber, lineNumber);
	}

	public OrderNumberLineKey getOrderNumberLineKey() {
		return orderNumberLineKey;
	}

	public void setOrderNumberLineKey(OrderNumberLineKey orderNumberLineKey) {
		this.orderNumberLineKey = orderNumberLineKey;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Order " + orderNumberLineKey.getOrderNumber() + ":[Line Number: "
				+ orderNumberLineKey.getLineNumber() + ", Item Number: " + itemNumber
				+ ", Item Description: " + itemDescription + ", Unit Price: " + unitPrice + "]";
	}

}
