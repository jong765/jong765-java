package com.pacsun.dto;

import java.util.Date;

public class InventoryDTO {
	
	private String productId;
	private int allocationQty;
	private int atsQty;
	private Date resetDate;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getAllocationQty() {
		return allocationQty;
	}
	public void setAllocationQty(int allocationQty) {
		this.allocationQty = allocationQty;
	}
	public int getAtsQty() {
		return atsQty;
	}
	public void setAtsQty(int atsQty) {
		this.atsQty = atsQty;
	}
	public Date getResetDate() {
		return resetDate;
	}
	public void setResetDate(Date resetDate) {
		this.resetDate = resetDate;
	}
	
}
