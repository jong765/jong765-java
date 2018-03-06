package com.pacsun.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StripInvalidXmlCharactersTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStripNonValidXMLCharacters() {
		String inputString = "&lt;p&gt;New Era 950 standard fit snapback";
		String inputString2 = "&lt;p&gt;Premium  Fit 100% Cotton Heather Navy 60% Cotton 40% Polyester H Grey 90% Cotton 10% Polyester 30/1 Cuff Longsleeve  Tee Softhand Screenprint&lt;/p&gt;";
		String inputString3 = "<p>New Era 950 standard fit snapback</p>";
		String inputString4 = "xx";
		System.out.println(StripInvalidXmlCharacters.stripNonValidXMLCharacters(inputString4));
	}

}
