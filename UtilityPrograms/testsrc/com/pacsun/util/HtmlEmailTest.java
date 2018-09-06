package com.pacsun.util;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pacsun.constants.EmailConstants;

public class HtmlEmailTest implements EmailConstants {

	private static String propFile = "Custom/QUA/properties/ps_email.properties";
	private static HashMap<String, String> propMap = new HashMap<String, String>();
	Properties properties = new Properties();
	HtmlEmail htmlEmail;

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
	public void testSendEmail() throws Exception {

		try {
			properties.load(new FileInputStream(propFile));
		} catch (Exception e) {
			System.out.println("Error loading property file: " + StackTrace.getStackTrace(e));
			throw new Exception("Failed to load property file. Terminating process...");
		}
		String filePath1 = "Custom/QUA/html/headerTemplate.html";
		String filePath2 = "Custom/QUA/html/bodyHeaderTemplate.html";
		String filePath3 = "Custom/QUA/html/productTemplateTest.html";
		String filePath4 = "Custom/QUA/html/bodyFooterTemplate.html";
		String fileContent = FileUtils.readFile(filePath1) + FileUtils.readFile(filePath2)
				+ FileUtils.readFile(filePath3) + FileUtils.readFile(filePath4);
		String emailSubject = "Vertex Tax Investigation";
		// String emailContent = fileContent;
		String emailContent = "John, are you sure you don't care for now?";

		htmlEmail = new HtmlEmail(properties, emailSubject, emailContent);

		// Send email
		htmlEmail.sendEmail();
	}
}
