package com.pacsun.cybersource.dto;

public class CustomerProfileConverterDto {

	private int merchantReferenceCode;
	private String authRequestId;

	public CustomerProfileConverterDto(int merchantReferenceCode, String authRequestId) {
		this.merchantReferenceCode = merchantReferenceCode;
		this.authRequestId = authRequestId;
	}

	public int getMerchantReferenceCode() {
		return merchantReferenceCode;
	}

	public void setMerchantReferenceCode(int merchantReferenceCode) {
		this.merchantReferenceCode = merchantReferenceCode;
	}

	public String getAuthRequestId() {
		return authRequestId;
	}

	public void setAuthRequestId(String authRequestId) {
		this.authRequestId = authRequestId;
	}

	@Override
	public String toString() {
		return "CustomerProfileConverterDto [merchantReferenceCode=" + merchantReferenceCode + ", authRequestId=" + authRequestId + "]";
	}

}
