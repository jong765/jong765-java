package com.pacsun.locate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderHeaderId implements Serializable {

	private static final long serialVersionUID = -7635459065142668166L;

	@Column(name = "HORDNO")
	private Integer orderNumber;

	@Column(name = "HPCKCD")
	private String pickTicketCode;

	@Column(name = "HFULOC")
	private String fulfillmentLocation;

	public OrderHeaderId() {
	}

	public OrderHeaderId(Integer orderNumber, String pickTicketCode, String fulfillmentLocation) {
		this.orderNumber = orderNumber;
		this.pickTicketCode = pickTicketCode;
		this.fulfillmentLocation = fulfillmentLocation;
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

	public String getFulfillmentLocation() {
		return fulfillmentLocation;
	}

	public void setFulfillmentLocation(String fulfillmentLocation) {
		this.fulfillmentLocation = fulfillmentLocation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fulfillmentLocation == null) ? 0 : fulfillmentLocation.hashCode());
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
		OrderHeaderId other = (OrderHeaderId) obj;
		if (fulfillmentLocation == null) {
			if (other.fulfillmentLocation != null)
				return false;
		} else if (!fulfillmentLocation.equals(other.fulfillmentLocation))
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
		return "OrderHeaderCompositeKey [orderNumber=" + orderNumber + ", pickTicketCode=" + pickTicketCode
				+ ", fulfillmentLocation=" + fulfillmentLocation + "]";
	}

}
