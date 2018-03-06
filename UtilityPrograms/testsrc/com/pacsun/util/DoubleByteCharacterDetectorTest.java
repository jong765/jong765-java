package com.pacsun.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DoubleByteCharacterDetectorTest {

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
	public void testHasDoubleByteCharacter() {
		// String str = "西野";
		String str = "^ aa";

		String fileContent = FileUtils.readFile("Custom/QUA/xml/Test.xml");
		String shortContent = fileContent.substring(0, 5);
		System.out.println(shortContent);

		System.out.println(DoubleByteCharacterDetector.hasDoubleByteCharacter(fileContent));
	}

}
