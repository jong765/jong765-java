package com.pacsun.locate.submitorder.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderHeaderCompositeKey implements Serializable {

	private static final long serialVersionUID = -7635459065142668166L;

	@Column(name = "HORDNO")
	private int orderNumber;

	@Column(name = "HPCKCD")
	private String pickTicketCode;

	public OrderHeaderCompositeKey() {
	}

	public OrderHeaderCompositeKey(int orderNumber, String pickTicketCode) {
		this.orderNumber = orderNumber;
		this.pickTicketCode = pickTicketCode;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getPickTicketCode() {
		return pickTicketCode;
	}

	public void setPickTicketCode(String pickTicketCode) {
		this.pickTicketCode = pickTicketCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderNumber;
		result = prime * result + ((pickTicketCode == null) ? 0 : pickTicketCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderHeaderCompositeKey other = (OrderHeaderCompositeKey) obj;
		if (orderNumber != other.orderNumber)
			return false;
		if (pickTicketCode == null) {
			if (other.pickTicketCode != null)
				return false;
		} else if (!pickTicketCode.equals(other.pickTicketCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderHeaderCompositeKey [orderNumber=" + orderNumber + ", pickTicketCode=" + pickTicketCode + "]";
	}

}
