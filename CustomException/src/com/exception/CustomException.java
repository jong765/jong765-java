package com.exception;

public class CustomException extends Exception {

	private static final long serialVersionUID = 3755941038773682325L;

	public CustomException() {
	}

	public CustomException(String message) {
		super(message);
	}

	public CustomException(Throwable cause) {
		super(cause);
	}

	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}
}