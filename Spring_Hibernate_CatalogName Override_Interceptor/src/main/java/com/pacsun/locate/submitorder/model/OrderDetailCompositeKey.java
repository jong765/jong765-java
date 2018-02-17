package com.pacsun.locate.submitorder.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDetailCompositeKey implements Serializable {

	private static final long serialVersionUID = -7635459065142668166L;

	@Column(name = "DORDNO")
	private int orderNumber;

	@Column(name = "DPCKCD")
	private String pickTicketCode;

	@Column(name = "DILINE")
	private int itemLine;

	public OrderDetailCompositeKey() {
	}

	public OrderDetailCompositeKey(int orderNumber, String pickTicketCode, int itemLine) {
		this.orderNumber = orderNumber;
		this.pickTicketCode = pickTicketCode;
		this.itemLine = itemLine;
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

	public int getItemLine() {
		return itemLine;
	}

	public void setItemLine(int itemLine) {
		this.itemLine = itemLine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemLine;
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
		OrderDetailCompositeKey other = (OrderDetailCompositeKey) obj;
		if (itemLine != other.itemLine)
			return false;
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
		return "OrderDetailCompositeKey [orderNumber=" + orderNumber + ", pickTicketCode=" + pickTicketCode
				+ ", itemLine=" + itemLine + "]";
	}

}
