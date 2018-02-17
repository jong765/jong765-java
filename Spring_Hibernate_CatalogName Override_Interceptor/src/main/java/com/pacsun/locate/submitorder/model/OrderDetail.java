package com.pacsun.locate.submitorder.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "JKLCORDD", catalog = "JKIM")
public class OrderDetail {

	@EmbeddedId
	private OrderDetailCompositeKey orderDetailCompositeKey;

	@Column(name = "DFULOC")
	private String fulfillingLocation;

	@Column(name = "DSYSCD")
	private String systemCode;

	@Column(name = "DITEM")
	// rename #
	private String itemNumber;

	@Column(name = "DOIQTY")
	private int quantity;

	@Column(name = "DPRICE")
	private double unitPrice;

	@Column(name = "DLNSTS")
	private String itemLineStatus;

	@Column(name = "DSPINS")
	private String specialInstruction;

	@Column(name = "DUPCCD")
	private String productBarcode;

	@Column(name = "DGFTFG")
	private String giftBoxFlag;

	@Column(name = "DMSGLN")
	private String lineMessage;

	@Column(name = "DSFNAM")
	private String shippingFirstName;

	@Column(name = "DSLNAM")
	private String shippingLastName;

	@Column(name = "DATTEN")
	private String attention;

	@Column(name = "DSADR1")
	private String shippingAddress1;

	@Column(name = "DSADR2")
	private String shippingAddress2;

	@Column(name = "DSADR3")
	private String shippingAddress3;

	@Column(name = "DSCITY")
	private String shippingCity;

	@Column(name = "DSSTAT")
	private String shippingState;

	@Column(name = "DSZIPC")
	private String shippingZipCode;

	@Column(name = "DSCNTY")
	private String shippingCountry;

	@Column(name = "DSEMAL")
	private String shippingEmailAddress;

	@Column(name = "DSPHON")
	private String shippingPhoneNumber;

	@Column(name = "DTAXAM")
	private double taxAmount;

	@Column(name = "DTNDDS")
	private String tenderDescription;

	@Column(name = "DTNDAM")
	private double tenderAmount;

	@Column(name = "DTNDAC")
	private String tenderAccount;

	public OrderDetailCompositeKey getOrderDetailCompositeKey() {
		return orderDetailCompositeKey;
	}

	public void setOrderDetailCompositeKey(OrderDetailCompositeKey orderDetailCompositeKey) {
		this.orderDetailCompositeKey = orderDetailCompositeKey;
	}

	public String getFulfillingLocation() {
		return fulfillingLocation;
	}

	public void setFulfillingLocation(String fulfillingLocation) {
		this.fulfillingLocation = fulfillingLocation;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getItemLineStatus() {
		return itemLineStatus;
	}

	public void setItemLineStatus(String itemLineStatus) {
		this.itemLineStatus = itemLineStatus;
	}

	public String getSpecialInstruction() {
		return specialInstruction;
	}

	public void setSpecialInstruction(String specialInstruction) {
		this.specialInstruction = specialInstruction;
	}

	public String getProductBarcode() {
		return productBarcode;
	}

	public void setProductBarcode(String productBarcode) {
		this.productBarcode = productBarcode;
	}

	public String getGiftBoxFlag() {
		return giftBoxFlag;
	}

	public void setGiftBoxFlag(String giftBoxFlag) {
		this.giftBoxFlag = giftBoxFlag;
	}

	public String getLineMessage() {
		return lineMessage;
	}

	public void setLineMessage(String lineMessage) {
		this.lineMessage = lineMessage;
	}

	public String getShippingFirstName() {
		return shippingFirstName;
	}

	public void setShippingFirstName(String shippingFirstName) {
		this.shippingFirstName = shippingFirstName;
	}

	public String getShippingLastName() {
		return shippingLastName;
	}

	public void setShippingLastName(String shippingLastName) {
		this.shippingLastName = shippingLastName;
	}

	public String getAttention() {
		return attention;
	}

	public void setAttention(String attention) {
		this.attention = attention;
	}

	public String getShippingAddress1() {
		return shippingAddress1;
	}

	public void setShippingAddress1(String shippingAddress1) {
		this.shippingAddress1 = shippingAddress1;
	}

	public String getShippingAddress2() {
		return shippingAddress2;
	}

	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}

	public String getShippingAddress3() {
		return shippingAddress3;
	}

	public void setShippingAddress3(String shippingAddress3) {
		this.shippingAddress3 = shippingAddress3;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingState() {
		return shippingState;
	}

	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	public String getShippingZipCode() {
		return shippingZipCode;
	}

	public void setShippingZipCode(String shippingZipCode) {
		this.shippingZipCode = shippingZipCode;
	}

	public String getShippingCountry() {
		return shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public String getShippingEmailAddress() {
		return shippingEmailAddress;
	}

	public void setShippingEmailAddress(String shippingEmailAddress) {
		this.shippingEmailAddress = shippingEmailAddress;
	}

	public String getShippingPhoneNumber() {
		return shippingPhoneNumber;
	}

	public void setShippingPhoneNumber(String shippingPhoneNumber) {
		this.shippingPhoneNumber = shippingPhoneNumber;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTenderDescription() {
		return tenderDescription;
	}

	public void setTenderDescription(String tenderDescription) {
		this.tenderDescription = tenderDescription;
	}

	public double getTenderAmount() {
		return tenderAmount;
	}

	public void setTenderAmount(double tenderAmount) {
		this.tenderAmount = tenderAmount;
	}

	public String getTenderAccount() {
		return tenderAccount;
	}

	public void setTenderAccount(String tenderAccount) {
		this.tenderAccount = tenderAccount;
	}

	@Override
	public String toString() {
		return "OrderDetail [orderDetailCompositeKey=" + orderDetailCompositeKey + ", fulfillingLocation="
				+ fulfillingLocation + ", systemCode=" + systemCode + ", itemNumber=" + itemNumber + ", quantity="
				+ quantity + ", unitPrice=" + unitPrice + ", itemLineStatus=" + itemLineStatus
				+ ", specialInstruction=" + specialInstruction + ", productBarcode=" + productBarcode
				+ ", giftBoxFlag=" + giftBoxFlag + ", lineMessage=" + lineMessage + ", shippingFirstName="
				+ shippingFirstName + ", shippingLastName=" + shippingLastName + ", attention=" + attention
				+ ", shippingAddress1=" + shippingAddress1 + ", shippingAddress2=" + shippingAddress2
				+ ", shippingAddress3=" + shippingAddress3 + ", shippingCity=" + shippingCity + ", shippingState="
				+ shippingState + ", shippingZipCode=" + shippingZipCode + ", shippingCountry=" + shippingCountry
				+ ", shippingEmailAddress=" + shippingEmailAddress + ", shippingPhoneNumber=" + shippingPhoneNumber
				+ ", taxAmount=" + taxAmount + ", tenderDescription=" + tenderDescription + ", tenderAmount="
				+ tenderAmount + ", tenderAccount=" + tenderAccount + "]";
	}

}
