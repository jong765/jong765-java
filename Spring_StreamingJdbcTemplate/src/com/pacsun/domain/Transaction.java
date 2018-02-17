package com.pacsun.domain;

public class Transaction {

	private int transactionId;
	private String productId;
	private String productDescription;
	private int customerId;
	private int quantity;

	public Transaction(int transactionId, String productId,
			String productDescription, int customerId, int quantity) {
		this.transactionId = transactionId;
		this.productId = productId;
		this.productDescription = productDescription;
		this.customerId = customerId;
		this.quantity = quantity;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
