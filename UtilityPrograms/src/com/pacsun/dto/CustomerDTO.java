package com.pacsun.dto;

public class CustomerDTO {

	private String uuid;
	private String login;
	private String customerNumber;
	private String email;
	private String firstName;
	private String lastName;
	private String zip;
	private String gigyaUId;
	private String creationDate;
	private String gigyaToDemandwareConversion;
	private String needsGigyaResetPassword;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getGigyaUId() {
		return gigyaUId;
	}

	public void setGigyaUId(String gigyaUId) {
		this.gigyaUId = gigyaUId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getGigyaToDemandwareConversion() {
		return gigyaToDemandwareConversion;
	}

	public void setGigyaToDemandwareConversion(String gigyaToDemandwareConversion) {
		this.gigyaToDemandwareConversion = gigyaToDemandwareConversion;
	}

	public String getNeedsGigyaResetPassword() {
		return needsGigyaResetPassword;
	}

	public void setNeedsGigyaResetPassword(String needsGigyaResetPassword) {
		this.needsGigyaResetPassword = needsGigyaResetPassword;
	}

	@Override
	public String toString() {
		return "CustomerDTO [uuid=" + uuid + ", login=" + login + ", customerNumber="
				+ customerNumber + ", email=" + email + ", firstName=" + firstName + ", lastName="
				+ lastName + ", zip=" + zip + ", gigyaUId=" + gigyaUId + ", creationDate="
				+ creationDate + ", gigyaToDemandwareConversion=" + gigyaToDemandwareConversion
				+ ", needsGigyaResetPassword=" + needsGigyaResetPassword + "]";
	}

}