package com.pacsun.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString {

	public static void main(String[] args) {

		String inputString = "è—¤æœ¬";

		Pattern p = Pattern.compile("[\u0000-\u007F]*");
		Matcher m = p.matcher(inputString);
		System.out.println(m.matches());

	}
}
