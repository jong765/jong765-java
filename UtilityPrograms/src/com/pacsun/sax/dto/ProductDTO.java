package com.pacsun.sax.dto;

public class ProductDTO {

	private String productId;
	private String productType;
	private String displayName;
	private String masterProductId;
	private String brand;
	private String department;
	private String onlineFlagTablet;
	private String onlineFlagPacsun;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getMasterProductId() {
		return masterProductId;
	}

	public void setMasterProductId(String masterProductId) {
		this.masterProductId = masterProductId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getOnlineFlagTablet() {
		return onlineFlagTablet;
	}

	public void setOnlineFlagTablet(String onlineFlagTablet) {
		this.onlineFlagTablet = onlineFlagTablet;
	}

	public String getOnlineFlagPacsun() {
		return onlineFlagPacsun;
	}

	public void setOnlineFlagPacsun(String onlineFlagPacsun) {
		this.onlineFlagPacsun = onlineFlagPacsun;
	}

}
