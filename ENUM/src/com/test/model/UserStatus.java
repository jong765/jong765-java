package com.test.model;

public enum UserStatus {
	PENDING("Pending"), ACTIVE("Active"), INACTIVE("Inactive"), DELETED("Deleted");

	private String value;

	private UserStatus(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}
}
