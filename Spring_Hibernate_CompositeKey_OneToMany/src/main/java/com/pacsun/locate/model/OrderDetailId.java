package com.pacsun.locate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDetailId implements Serializable {

	private static final long serialVersionUID = -7635459065142668166L;

	@Column(name = "DORDNO")
	private Integer orderNumber;

	@Column(name = "DPCKCD")
	private String pickTicketCode;

	@Column(name = "DFULOC")
	private String fulfillingLocation;

	@Column(name = "DILINE")
	private Integer itemLine;

	public OrderDetailId() {
	}

	public OrderDetailId(Integer orderNumber, String pickTicketCode, String fulfillingLocation, Integer itemLine) {
		this.orderNumber = orderNumber;
		this.pickTicketCode = pickTicketCode;
		this.fulfillingLocation = fulfillingLocation;
		this.itemLine = itemLine;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getPickTicketCode() {
		return pickTicketCode;
	}

	public void setPickTicketCode(String pickTicketCode) {
		this.pickTicketCode = pickTicketCode;
	}

	public String getFulfillingLocation() {
		return fulfillingLocation;
	}

	public void setFulfillingLocation(String fulfillingLocation) {
		this.fulfillingLocation = fulfillingLocation;
	}

	public Integer getItemLine() {
		return itemLine;
	}

	public void setItemLine(Integer itemLine) {
		this.itemLine = itemLine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fulfillingLocation == null) ? 0 : fulfillingLocation.hashCode());
		result = prime * result + ((itemLine == null) ? 0 : itemLine.hashCode());
		result = prime * result + ((orderNumber == null) ? 0 : orderNumber.hashCode());
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
		OrderDetailId other = (OrderDetailId) obj;
		if (fulfillingLocation == null) {
			if (other.fulfillingLocation != null)
				return false;
		} else if (!fulfillingLocation.equals(other.fulfillingLocation))
			return false;
		if (itemLine == null) {
			if (other.itemLine != null)
				return false;
		} else if (!itemLine.equals(other.itemLine))
			return false;
		if (orderNumber == null) {
			if (other.orderNumber != null)
				return false;
		} else if (!orderNumber.equals(other.orderNumber))
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
				+ ", fulfillingLocation=" + fulfillingLocation + ", itemLine=" + itemLine + "]";
	}

}
