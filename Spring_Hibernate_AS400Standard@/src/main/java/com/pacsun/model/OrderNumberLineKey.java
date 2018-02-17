package com.pacsun.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderNumberLineKey implements Serializable {

	private static final long serialVersionUID = -7635459065142668166L;

	@Column(name = "ODORD")
	private int orderNumber;

	@Column(name = "ODLINE")
	private int lineNumber;

	public OrderNumberLineKey() {
	}

	public OrderNumberLineKey(int orderNumber, int lineNumber) {
		this.orderNumber = orderNumber;
		this.lineNumber = lineNumber;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

}
