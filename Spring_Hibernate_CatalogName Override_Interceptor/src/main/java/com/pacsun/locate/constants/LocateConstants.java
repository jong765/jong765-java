package com.pacsun.locate.constants;

public abstract interface LocateConstants {

	// Submit Order
	public static final String SUBMIT_ORDER_REQUEST_MESSAGE_HEADER_DESTINATION = "LOCATE";
	public static final String SUBMIT_ORDER_REQUEST_MESSAGE_HEADER_XACTION_TYPE = "INSERT";
	public static final String SUBMIT_ORDER_REQUEST_MESSAGE_HEADER_XACTION_RESPONSE = "1";
	public static final String SUBMIT_ORDER_REQUEST_MESSAGE_HEADER_MESSAGE_TYPE = "1";
	public static final String SUBMIT_ORDER_REQUEST_MESSAGE_HEADER_LOCATE_VERSION = "5.2";
	public static final String SUBMIT_ORDER_REQUEST_MESSAGE_HEADER_SOURCE = "WEB";
	public static final String SUBMIT_ORDER_REQUEST_MESSAGE_REQUESTING_STORE_LOCATION_CODE = "ECOM";
	public static final String SUBMIT_ORDER_REQUEST_MESSAGE_REQUESTING_STORE_SYSTEM_CODE = "Xstore";
	public static final String SUBMIT_ORDER_REQUEST_MESSAGE_EMPLOYEEID = "Order Power";
	public static final String SUBMIT_ORDER_REQUEST_MESSAGE_TRANSACTION_STATUS_NEWORDER = "new_order";
	public static final String SUBMIT_ORDER_REQUEST_MESSAGE_TRANSACTION_CHANNEL = "1";

}