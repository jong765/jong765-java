package com.pacsun.locate.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Customer {

	@Column(name = "HCUST#")
	private Integer customerNumber;

	@Column(name = "HCFNAM")
	private String customerFirstName;

	@Column(name = "HCLNAM")
	private String customerLastName;

	@Column(name = "HCADR1")
	private String customerAddress1;

	@Column(name = "HCADR2")
	private String cutomerAddress2;

	@Column(name = "HCCITY")
	private String customerCity;

	@Column(name = "HCSTAT")
	private String customerState;

	@Column(name = "HCZIPC")
	private String customerZipCode;

	@Column(name = "HCCNTY")
	private String customerCountry;

	@Column(name = "HCPHON")
	private String billingPhoneNumber;

	@Column(name = "HCEMAD")
	private String customerEmailAddress;

	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerAddress1() {
		return customerAddress1;
	}

	public void setCustomerAddress1(String customerAddress1) {
		this.customerAddress1 = customerAddress1;
	}

	public String getCutomerAddress2() {
		return cutomerAddress2;
	}

	public void setCutomerAddress2(String cutomerAddress2) {
		this.cutomerAddress2 = cutomerAddress2;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerZipCode() {
		return customerZipCode;
	}

	public void setCustomerZipCode(String customerZipCode) {
		this.customerZipCode = customerZipCode;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public String getBillingPhoneNumber() {
		return billingPhoneNumber;
	}

	public void setBillingPhoneNumber(String billingPhoneNumber) {
		this.billingPhoneNumber = billingPhoneNumber;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerFirstName=" + customerFirstName
				+ ", customerLastName=" + customerLastName + ", customerAddress1=" + customerAddress1
				+ ", cutomerAddress2=" + cutomerAddress2 + ", customerCity=" + customerCity + ", customerState="
				+ customerState + ", customerZipCode=" + customerZipCode + ", customerCountry=" + customerCountry
				+ ", billingPhoneNumber=" + billingPhoneNumber + ", customerEmailAddress=" + customerEmailAddress + "]";
	}

}
