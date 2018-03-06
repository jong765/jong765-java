package com.pacsun.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CreateDWCustomerXMLTest {

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
	public void createDWCustomerXML() {
		String filePath = "Custom/QUA/xml/DWCustomerTemplate.xml";
		String outFilePath = "Custom/QUA/xml/DWTestCustomers7.xml";

		String fileContents = FileUtils.readFile(filePath);
		FileUtils.writeFile(outFilePath, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n", true);
		FileUtils.writeFile(outFilePath,
				"<customers xmlns=\"http://www.demandware.com/xml/impex/customer/2006-10-31\">\n",
				false);

		for (int i = 290001; i < 490000; i++) {
			String customerNo = String.format("%08d", i);
			String stringValue = "Test" + i;
			String newFileContents = fileContents.replace("${customer_no}", customerNo);
			newFileContents = newFileContents.replace("${string_value}", stringValue);
			FileUtils.writeFile(outFilePath, newFileContents, false);
		}
		FileUtils.writeFile(outFilePath, "</customers>", false);

		System.out.println("Done.");
	}

}
