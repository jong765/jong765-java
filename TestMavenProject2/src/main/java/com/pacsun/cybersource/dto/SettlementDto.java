package com.pacsun.cybersource.dto;

public class SettlementDto {

	private String action;
	private int merchantReferenceCode;
	private String authRequestId;
	private String captureRequestId;
	private String tokenNumber;
	private int sequence;
	private int totalCount;
	private String sendSequenceFlag;
	private double amount;

	public SettlementDto(String action, int merchantReferenceCode, String authRequestId, String captureRequestId, String tokenNumber,
			int sequence, int totalCount, String sendSequenceFlag, double amount) {
		this.action = action;
		this.merchantReferenceCode = merchantReferenceCode;
		this.authRequestId = authRequestId;
		this.captureRequestId = captureRequestId;
		this.tokenNumber = tokenNumber;
		this.sequence = sequence;
		this.totalCount = totalCount;
		this.sendSequenceFlag = sendSequenceFlag;
		this.amount = amount;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
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

	public String getCaptureRequestId() {
		return captureRequestId;
	}

	public void setCaptureRequestId(String captureRequestId) {
		this.captureRequestId = captureRequestId;
	}

	public String getTokenNumber() {
		return tokenNumber;
	}

	public void setTokenNumber(String tokenNumber) {
		this.tokenNumber = tokenNumber;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getSendSequenceFlag() {
		return sendSequenceFlag;
	}

	public void setSendSequenceFlag(String sendSequenceFlag) {
		this.sendSequenceFlag = sendSequenceFlag;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "SettlementDto [action=" + action + ", merchantReferenceCode=" + merchantReferenceCode + ", authRequestId=" + authRequestId
				+ ", captureRequestId=" + captureRequestId + ", tokenNumber=" + tokenNumber + ", sequence=" + sequence + ", totalCount="
				+ totalCount + ", sendSequenceFlag=" + sendSequenceFlag + ", amount=" + amount + "]";
	}

}
