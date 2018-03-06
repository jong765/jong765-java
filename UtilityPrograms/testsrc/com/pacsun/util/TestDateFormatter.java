package com.pacsun.util;

public class TestDateFormatter {

	public static void main(String[] args) {

		String sdate = DateFormatterUtil.getCurrentDate();
		String stime = DateFormatterUtil.getCurrentTime();
		String guid = "DGUID" + DateFormatterUtil.getCurrentDate()
				+ DateFormatterUtil.getCurrentTime();

		System.out.println(sdate);
		System.out.println(stime);
		System.out.println(guid);

	}
}
