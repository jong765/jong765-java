package com.pacsun.dw.store.inventory.dto;

import java.math.BigDecimal;

public class InventoryDto {

	private BigDecimal sku;
	private Integer quantity;
	private String classVendorStyle;

	public BigDecimal getSku() {
		return sku;
	}

	public void setSku(BigDecimal sku) {
		this.sku = sku;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getClassVendorStyle() {
		return classVendorStyle;
	}

	public void setClassVendorStyle(String classVendorStyle) {
		this.classVendorStyle = classVendorStyle;
	}

	@Override
	public String toString() {
		return "InventoryDto [sku=" + sku + ", quantity=" + quantity + ", classVendorStyle="
				+ classVendorStyle + "]";
	}

}
