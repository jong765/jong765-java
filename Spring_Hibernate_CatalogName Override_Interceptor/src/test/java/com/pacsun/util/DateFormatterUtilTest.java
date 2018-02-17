package com.pacsun.util;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DateFormatterUtilTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFormatDateDateString() {
		String dateString = DateFormatterUtil.formatDate(new Date(), "yyyy-MM-dd'T'HH:mm:ss");
		System.out.println(dateString);
	}

}
