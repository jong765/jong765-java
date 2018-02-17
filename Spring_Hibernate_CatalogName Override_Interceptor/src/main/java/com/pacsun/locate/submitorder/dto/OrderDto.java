package com.pacsun.locate.submitorder.dto;

import java.math.BigDecimal;
import java.util.List;

public class OrderDto {

	private String orderId;
	private String transactionTypeId;
	private String referenceTransactionNumber;
	private List<OrderDetailDto> orderDetailList;
	private BigDecimal transactionTotal;
	private BigDecimal transactionSubtotal;
	private BigDecimal transactionTax;
	private BigDecimal freightAmount;
	private BigDecimal additionalFreightCharges;
	private String underReview;
	private CustomerDto customerDto;
	private String locationCode;
	private String systemCode;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTransactionTypeId() {
		return transactionTypeId;
	}

	public void setTransactionTypeId(String transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

	public String getReferenceTransactionNumber() {
		return referenceTransactionNumber;
	}

	public void setReferenceTransactionNumber(String referenceTransactionNumber) {
		this.referenceTransactionNumber = referenceTransactionNumber;
	}

	public List<OrderDetailDto> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetailDto> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	public BigDecimal getTransactionTotal() {
		return transactionTotal;
	}

	public void setTransactionTotal(BigDecimal transactionTotal) {
		this.transactionTotal = transactionTotal;
	}

	public BigDecimal getTransactionSubtotal() {
		return transactionSubtotal;
	}

	public void setTransactionSubtotal(BigDecimal transactionSubtotal) {
		this.transactionSubtotal = transactionSubtotal;
	}

	public BigDecimal getTransactionTax() {
		return transactionTax;
	}

	public void setTransactionTax(BigDecimal transactionTax) {
		this.transactionTax = transactionTax;
	}

	public BigDecimal getFreightAmount() {
		return freightAmount;
	}

	public void setFreightAmount(BigDecimal freightAmount) {
		this.freightAmount = freightAmount;
	}

	public BigDecimal getAdditionalFreightCharges() {
		return additionalFreightCharges;
	}

	public void setAdditionalFreightCharges(BigDecimal additionalFreightCharges) {
		this.additionalFreightCharges = additionalFreightCharges;
	}

	public String getUnderReview() {
		return underReview;
	}

	public void setUnderReview(String underReview) {
		this.underReview = underReview;
	}

	public CustomerDto getCustomerDto() {
		return customerDto;
	}

	public void setCustomerDto(CustomerDto customerDto) {
		this.customerDto = customerDto;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

}
