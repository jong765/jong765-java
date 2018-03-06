package com.pacsun.util;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pacsun.store.jaxb.Stores;

public class JAXBUnmarshallerUtilTest {

	File xmlFile = new File("Custom/QUA/xml/stores_20160224_123515.xml");
	JAXBUnmarshallerUtil jaxbUnmarshallerUtil = new JAXBUnmarshallerUtil();

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
	public void test() throws JAXBException, IOException {
		FileInputStream fis = new FileInputStream(xmlFile);
		Stores stores = (Stores) jaxbUnmarshallerUtil.getJAXBObject(Stores.class, fis);
		assertNotNull(stores);
	}
}
