package com.pacsun.dw.store.inventory.dto;

import java.math.BigDecimal;

public class ProductDto {

	private Integer productId;
	private String description;
	private BigDecimal unitPrice;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "ProductDto [productId=" + productId + ", description=" + description
				+ ", unitPrice=" + unitPrice + "]";
	}

}
