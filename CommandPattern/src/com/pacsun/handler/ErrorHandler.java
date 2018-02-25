package com.pacsun.handler;


public class ErrorHandler implements Handler {

	@Override
	public void execute(String message) {
		System.out.println(message);

	}

}
