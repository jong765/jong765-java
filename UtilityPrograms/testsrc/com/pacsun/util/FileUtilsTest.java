package com.pacsun.util;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FileUtilsTest {

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
	public void testListFiles() {
		String folderPath = "Custom/QUA/file/";
		File[] fileList = FileUtils.listFiles(folderPath, "test1", "xml");
		for (File file : fileList) {
			System.out.println(file);
		}
	}

	@Test
	public void removeUnparsableCharactersFromXML() {
		String folderPath = "C:/temp/DWprodActiveCustomers.xml";
		String targetFileName = "C:/temp/DWprodActiveCustomers.xml";
		String fileContent = FileUtils.readFile(folderPath);
		fileContent = fileContent.replace("&#", "");
		// System.out.println(fileContent);
		boolean bOverwrite = true;
		FileUtils.writeFile(targetFileName, fileContent, bOverwrite);
	}

}
