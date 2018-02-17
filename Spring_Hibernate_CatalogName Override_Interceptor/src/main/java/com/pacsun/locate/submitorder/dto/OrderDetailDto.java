package com.pacsun.locate.submitorder.dto;

public class OrderDetailDto {

	private int sequenceNumber;

	private String itemNumber;

	private String itemDescription;

	private double orderQuantity;

	private double unitPrice;

	private String specialInstructions;

	private String trackingNumber;

	private int upcCode;

	private int eanCode;

	private String fulfillingStoreNumber;

	public int getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getSpecialInstructions() {
		return specialInstructions;
	}

	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public int getUpcCode() {
		return upcCode;
	}

	public void setUpcCode(int upcCode) {
		this.upcCode = upcCode;
	}

	public int getEanCode() {
		return eanCode;
	}

	public void setEanCode(int eanCode) {
		this.eanCode = eanCode;
	}

	public double getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(double orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public String getFulfillingStoreNumber() {
		return fulfillingStoreNumber;
	}

	public void setFulfillingStoreNumber(String fulfillingStoreNumber) {
		this.fulfillingStoreNumber = fulfillingStoreNumber;
	}

}
