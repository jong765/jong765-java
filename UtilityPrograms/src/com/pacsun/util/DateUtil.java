package com.pacsun.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateUtil {

	public static String getCurrentDateTime(String dateFormat) {
		// Sample dateformats:
		// yyyy-MM-dd_hh.mm.ss, yyyyMMddhhmmss

		DateFormat df = new SimpleDateFormat(dateFormat);
		df.setTimeZone(TimeZone.getTimeZone("PST"));
		return df.format(new Date());
	}

	public static XMLGregorianCalendar getXmlDate(Date date, String dateFormat)
			throws DatatypeConfigurationException {
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(
				new SimpleDateFormat(dateFormat).format(date));
	}

	public static Date convertStringToDate(String dateString, String dateFormat) {
		DateFormat format = new SimpleDateFormat(dateFormat);
		Date date = null;
		try {
			date = format.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

	public static XMLGregorianCalendar stringToXMLGregorianCalendar(String stringDateFormat,
			String s) throws ParseException, DatatypeConfigurationException {
		XMLGregorianCalendar result = null;
		Date date;
		SimpleDateFormat simpleDateFormat;
		GregorianCalendar gregorianCalendar;

		simpleDateFormat = new SimpleDateFormat(stringDateFormat);
		date = simpleDateFormat.parse(s);
		gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
		gregorianCalendar.setTime(date);
		result = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		return result;
	}

	public static XMLGregorianCalendar dateToXMLGregorianCalendar(Date date) throws ParseException,
			DatatypeConfigurationException {
		XMLGregorianCalendar result = null;
		GregorianCalendar gregorianCalendar;
		gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
		gregorianCalendar.setTime(date);
		result = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		return result;
	}

	public static String dayOfWeek(String date_yymmdd) {
		DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyyMMdd");
		DateTime dt = formatter.parseDateTime(date_yymmdd);
		return dt.dayOfWeek().getAsText();
	}

}
