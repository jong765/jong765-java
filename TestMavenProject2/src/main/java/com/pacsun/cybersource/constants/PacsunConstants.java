package com.pacsun.cybersource.constants;

public interface PacsunConstants {

	public static final String AS400_SYSTEM = "as400.system";
	public static final String AS400_DRIVER = "as400.driver";
	public static final String AS400_URL = "as400.url";
	public static final String AS400_USER = "as400.user";
	public static final String AS400_PASSWORD = "as400.password";

	public static final String TOKEN_FILE = "token.conversion.file";
	public static final String SETTLEMENT_FILE = "settlement.file";
	public static final String MAX_RECORDS_TOKEN_CONVERSION = "max.number.of.records.token.conversion.per.job";
	public static final String API_REQUEST_RETRIAL_ATTEMPT = "api.request.retrial.attempt";

	// Process flag
	public static final String PROCESS_SUCCESS = "P";
	public static final String PROCESS_ERROR = "E";
	public static final String PROCESS_UNPROCESSED = "U";

	// Cybersource API settlement request type
	public static final String CC_CAPTURE = "CAPTURE";
	public static final String CC_REAUTH_CAPTURE = "REAUT_CAPTURE";
	public static final String CC_CREDIT = "CREDIT";

	// Cybersource reply reason codes
	public static final String SUCCESS = "100";

	// Pacsun reason codes
	public static final String INVALID_ACTION_CODE = "PAC01";

	// Email constants
	public static final String SMTP_HOST = "smtp.host";
	public static final String MAIL_SMTP_AUTH = "mail.smtp.auth";
	public static final String SMTP_USER = "smtp.user";
	public static final String SMTP_PASSWORD = "smtp.password";
	public static final String EMAIL_RECIPIENTS = "email.recipients";
	public static final String EMAIL_STYLESHEET = "email.stylesheet";

}
