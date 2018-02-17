package com.pacsun.util;

public class StringUtil {

	public static Integer convertStringToInteger(String input) {
		return input == null ? 0 : Integer.parseInt(input);
	}

}
