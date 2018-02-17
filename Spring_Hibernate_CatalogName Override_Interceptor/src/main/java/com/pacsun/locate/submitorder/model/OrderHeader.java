package com.pacsun.locate.submitorder.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JKLCORDH", catalog = "OPCUS111")
public class OrderHeader {

	@EmbeddedId
	OrderHeaderCompositeKey orderHeaderCompositeKey;

	@Column(name = "HPROC")
	private String processFlag;

	@Column(name = "HPRDAT")
	private int processDate;

	@Column(name = "HPRTIM")
	private int processTime;

	@Column(name = "HRFORD")
	private int referenceOrderNumber;

	@Column(name = "HTYPID")
	private String transactionTypeId;

	@Column(name = "HFULOC")
	private String fulfillmentLocation;

	@Column(name = "HSBTOT")
	private double orderSubtotal;

	@Column(name = "HTOTAX")
	private double totalTax;

	@Column(name = "HTRTOT")
	private double total;

	@Column(name = "HSPINS")
	private String specialInstruction;

	@Column(name = "HTRSTS")
	private String transactionStatus;

	@Column(name = "HTRCHN")
	private String transactionChannel;

	@Column(name = "HSPVIA")
	private String shipVia;

	@Column(name = "HSVDES")
	private String shipViaDescription;

	@Column(name = "HORMSG")
	private String orderMessage;

	@Column(name = "HGFTFG")
	private String gift;

	@Column(name = "HCUST")
	// rename #
	private int customerNumber;

	@Column(name = "HREVFG")
	private String underReviewFlag;

	@Column(name = "HCFNAM")
	private String customerFirstName;

	@Column(name = "HCLNAM")
	private String customerLastName;

	@Column(name = "HCADR1")
	private String customerAddress1;

	@Column(name = "HCADR2")
	private String cutomerAddress2;

	@Column(name = "HCADR3")
	private String customerAddress3;

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

	@Column(name = "HLOCCD")
	private String locationCode;

	@Column(name = "HSYSCD")
	private String systemCode;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "DORDNO"), @JoinColumn(name = "DPCKCD") })
	private Set<OrderDetail> orderDetailList;

	public OrderHeader() {
	}

	public OrderHeaderCompositeKey getOrderHeaderCompositeKey() {
		return orderHeaderCompositeKey;
	}

	public void setOrderHeaderCompositeKey(OrderHeaderCompositeKey orderHeaderCompositeKey) {
		this.orderHeaderCompositeKey = orderHeaderCompositeKey;
	}

	public String getProcessFlag() {
		return processFlag;
	}

	public void setProcessFlag(String processFlag) {
		this.processFlag = processFlag;
	}

	public int getProcessDate() {
		return processDate;
	}

	public void setProcessDate(int processDate) {
		this.processDate = processDate;
	}

	public int getProcessTime() {
		return processTime;
	}

	public void setProcessTime(int processTime) {
		this.processTime = processTime;
	}

	public int getReferenceOrderNumber() {
		return referenceOrderNumber;
	}

	public void setReferenceOrderNumber(int referenceOrderNumber) {
		this.referenceOrderNumber = referenceOrderNumber;
	}

	public String getTransactionTypeId() {
		return transactionTypeId;
	}

	public void setTransactionTypeId(String transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

	public String getFulfillmentLocation() {
		return fulfillmentLocation;
	}

	public void setFulfillmentLocation(String fulfillmentLocation) {
		this.fulfillmentLocation = fulfillmentLocation;
	}

	public double getOrderSubtotal() {
		return orderSubtotal;
	}

	public void setOrderSubtotal(double orderSubtotal) {
		this.orderSubtotal = orderSubtotal;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getSpecialInstruction() {
		return specialInstruction;
	}

	public void setSpecialInstruction(String specialInstruction) {
		this.specialInstruction = specialInstruction;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionChannel() {
		return transactionChannel;
	}

	public void setTransactionChannel(String transactionChannel) {
		this.transactionChannel = transactionChannel;
	}

	public String getShipVia() {
		return shipVia;
	}

	public void setShipVia(String shipVia) {
		this.shipVia = shipVia;
	}

	public String getShipViaDescription() {
		return shipViaDescription;
	}

	public void setShipViaDescription(String shipViaDescription) {
		this.shipViaDescription = shipViaDescription;
	}

	public String getOrderMessage() {
		return orderMessage;
	}

	public void setOrderMessage(String orderMessage) {
		this.orderMessage = orderMessage;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getUnderReviewFlag() {
		return underReviewFlag;
	}

	public void setUnderReviewFlag(String underReviewFlag) {
		this.underReviewFlag = underReviewFlag;
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

	public String getCustomerAddress3() {
		return customerAddress3;
	}

	public void setCustomerAddress3(String customerAddress3) {
		this.customerAddress3 = customerAddress3;
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

	public Set<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(Set<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	@Override
	public String toString() {
		return "OrderHeader [orderHeaderCompositeKey=" + orderHeaderCompositeKey + ", processFlag=" + processFlag
				+ ", processDate=" + processDate + ", processTime=" + processTime + ", referenceOrderNumber="
				+ referenceOrderNumber + ", transactionTypeId=" + transactionTypeId + ", fulfillmentLocation="
				+ fulfillmentLocation + ", orderSubtotal=" + orderSubtotal + ", totalTax=" + totalTax + ", total="
				+ total + ", specialInstruction=" + specialInstruction + ", transactionStatus=" + transactionStatus
				+ ", transactionChannel=" + transactionChannel + ", shipVia=" + shipVia + ", shipViaDescription="
				+ shipViaDescription + ", orderMessage=" + orderMessage + ", gift=" + gift + ", customerNumber="
				+ customerNumber + ", underReviewFlag=" + underReviewFlag + ", customerFirstName=" + customerFirstName
				+ ", customerLastName=" + customerLastName + ", customerAddress1=" + customerAddress1
				+ ", cutomerAddress2=" + cutomerAddress2 + ", customerAddress3=" + customerAddress3 + ", customerCity="
				+ customerCity + ", customerState=" + customerState + ", customerZipCode=" + customerZipCode
				+ ", customerCountry=" + customerCountry + ", billingPhoneNumber=" + billingPhoneNumber
				+ ", customerEmailAddress=" + customerEmailAddress + ", locationCode=" + locationCode + ", systemCode="
				+ systemCode + ", orderDetailList=" + orderDetailList + "]";
	}

}
