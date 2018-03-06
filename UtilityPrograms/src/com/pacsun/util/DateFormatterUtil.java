package com.pacsun.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

public class DateFormatterUtil {
	private static int calYear = 0;
	private static int calMonth = 0;
	private static int calDay = 0;
	private static int calHour = 0;
	private static int calMinute = 0;
	private static int calSecond = 0;

	public static String formatDate(Date date, String dateFormat) {
		DateFormat formatter = new SimpleDateFormat(dateFormat);
		return formatter.format(date);
	}

	public static Date formatDate(String dateStr) {
		Date returnDate = null;

		if ((dateStr == null) || (dateStr.length() == 0)) {
			dateStr = getCurrentDate();
		}

		if ((dateStr != null) && (dateStr.length() > 0)) {
			try {
				DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
				returnDate = formatter.parse(dateStr);
			} catch (ParseException pe) {
				returnDate = new Date();
			}
		}
		return returnDate;
	}

	public static String getDateTimeStamp() {
		String strDate = "";
		String strTime = "";

		strDate = getCurrentDate();
		strTime = getCurrentTime();

		return strDate + "_" + strTime;
	}

	public static String getDateTimeStampMilli() {
		String strDate = "";
		String strTime = "";

		strDate = getCurrentDate();
		strTime = getCurrentTimeMilli();

		return strDate + "_" + strTime;
	}

	public static String getCurrentDate() {
		Date date = new Date();
		String strCurrentDate = convertDate(date, "America/Los_Angeles", "America/Los_Angeles")
				.toString("yyyyMMdd");

		return strCurrentDate;
	}

	public static String getCurrentTime() {
		Date date = new Date();
		String strCurrentTime = convertDate(date, "America/Los_Angeles", "America/Los_Angeles")
				.toString("HHmmss");

		return strCurrentTime;
	}

	public static String getCurrentTimeMilli() {
		Date date = new Date();
		String strCurrentTime = convertDate(date, "America/Los_Angeles", "America/Los_Angeles")
				.toString("HHmmssSSS");

		return strCurrentTime;
	}

	private static DateTime convertDate(Date date, String fromZone, String toZone) {
		LocalDateTime ldt = new LocalDateTime(date);
		DateTime srcDateTime = ldt.toDateTime(DateTimeZone.forID(fromZone));
		DateTime dstDateTime = srcDateTime.withZone(DateTimeZone.forID(toZone));
		return dstDateTime;
	}

	public static int getCalYear() {
		return calYear;
	}

	public static void setCalYear(int calYear) {
		DateFormatterUtil.calYear = calYear;
	}

	public static int getCalMonth() {
		return calMonth;
	}

	public static void setCalMonth(int calMonth) {
		DateFormatterUtil.calMonth = calMonth;
	}

	public static int getCalDay() {
		return calDay;
	}

	public static void setCalDay(int calDay) {
		DateFormatterUtil.calDay = calDay;
	}

	public static int getCalHour() {
		return calHour;
	}

	public static void setCalHour(int calHour) {
		DateFormatterUtil.calHour = calHour;
	}

	public static int getCalMinute() {
		return calMinute;
	}

	public static void setCalMinute(int calMinute) {
		DateFormatterUtil.calMinute = calMinute;
	}

	public static int getCalSecond() {
		return calSecond;
	}

	public static void setCalSecond(int calSecond) {
		DateFormatterUtil.calSecond = calSecond;
	}
}

/*
 * Location: C:\temp\ps_catalog.jar Qualified Name:
 * com.pacsun.dw.catalog.util.DateFormatter JD-Core Version: 0.6.0
 */