package com.pacsun.util;

public class StringUtil {

	public static Integer convertStringToInteger(String input) {
		return input == null ? 0 : Integer.parseInt(input);
	}

	public static String truncateString(String s, int maxLength) {
		return s != null ? s.substring(0, Math.min(s.length(), maxLength)).trim() : "";
	}

}
