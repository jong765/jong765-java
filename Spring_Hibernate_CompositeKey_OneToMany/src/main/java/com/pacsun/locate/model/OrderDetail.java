package com.pacsun.locate.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PSLCORDD")
public class OrderDetail {

	@EmbeddedId
	private OrderDetailId id;

	@Column(name = "DLOCCD")
	private String locationCode;

	@Column(name = "DSYSCD")
	private String systemCode;

	@Column(name = "DITEM#")
	private String itemNumber;

	@Column(name = "DREQID")
	private String requestId;

	@Column(name = "DLCLIN")
	private Integer locateLineNumber;

	@Column(name = "DOIQTY")
	private Integer quantity;

	@Column(name = "DPRICE")
	private Double unitPrice;

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

	@Column(name = "DSCITY")
	private String shippingCity;

	@Column(name = "DSSTAT")
	private String shippingState;

	@Column(name = "DSZIPC")
	private String shippingZipCode;

	@Column(name = "DSCNTY")
	private String shippingCountry;

	@Column(name = "DSEMAD")
	private String shippingEmailAddress;

	@Column(name = "DSPHON")
	private String shippingPhoneNumber;

	@Column(name = "DTAXAM")
	private Double taxAmount;

	@Column(name = "DSHPAM")
	private Double shippingCharge;

	@Column(name = "DTNDDS")
	private String tenderDescription;

	@Column(name = "DTNDAM")
	private Double tenderAmount;

	@Column(name = "DTNDAC")
	private String tenderAccount;

	public OrderDetailId getId() {
		return id;
	}

	public void setOrderDetailId(OrderDetailId id) {
		this.id = id;
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

	public String getItemNumber() {
		return itemNumber;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getLocateLineNumber() {
		return locateLineNumber;
	}

	public void setLocateLineNumber(Integer locateLineNumber) {
		this.locateLineNumber = locateLineNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
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

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Double getShippingCharge() {
		return shippingCharge;
	}

	public void setShippingCharge(Double shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

	public String getTenderDescription() {
		return tenderDescription;
	}

	public void setTenderDescription(String tenderDescription) {
		this.tenderDescription = tenderDescription;
	}

	public Double getTenderAmount() {
		return tenderAmount;
	}

	public void setTenderAmount(Double tenderAmount) {
		this.tenderAmount = tenderAmount;
	}

	public String getTenderAccount() {
		return tenderAccount;
	}

	public void setTenderAccount(String tenderAccount) {
		this.tenderAccount = tenderAccount;
	}

	public void setKey(OrderDetailId key) {
		this.id = key;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", locationCode=" + locationCode + ", systemCode=" + systemCode
				+ ", itemNumber=" + itemNumber + ", requestId=" + requestId + ", locateLineNumber=" + locateLineNumber
				+ ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", itemLineStatus=" + itemLineStatus
				+ ", specialInstruction=" + specialInstruction + ", productBarcode=" + productBarcode
				+ ", giftBoxFlag=" + giftBoxFlag + ", lineMessage=" + lineMessage + ", shippingFirstName="
				+ shippingFirstName + ", shippingLastName=" + shippingLastName + ", attention=" + attention
				+ ", shippingAddress1=" + shippingAddress1 + ", shippingAddress2=" + shippingAddress2
				+ ", shippingCity=" + shippingCity + ", shippingState=" + shippingState + ", shippingZipCode="
				+ shippingZipCode + ", shippingCountry=" + shippingCountry + ", shippingEmailAddress="
				+ shippingEmailAddress + ", shippingPhoneNumber=" + shippingPhoneNumber + ", taxAmount=" + taxAmount
				+ ", shippingCharge=" + shippingCharge + ", tenderDescription=" + tenderDescription + ", tenderAmount="
				+ tenderAmount + ", tenderAccount=" + tenderAccount + "]";
	}

}
