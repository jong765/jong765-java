package com.pacsun.handler;

public class SuccessHandler implements Handler {

	@Override
	public void execute(String message) {
		System.out.println(message);
	}

}
