package com.pacsun.util;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.pacsun.dto.TestObject;

public class JSONUtilTest {

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
	public void convertObjectToJSONTest() throws JsonProcessingException {
		TestObject object = new TestObject();
		object.setKey("fruit");
		object.setValue("apple");
		System.out.println(JSONUtil.convertObjectToJSON(object));
	}

	@Test
	public void convertJSONToObjectTest() throws JsonParseException, JsonMappingException,
			IOException {
		String str = "{\"key\":\"fruit\",\"value\":\"apple\"}";
		Object obj = JSONUtil.convertJSONToObject(str);
		System.out.println("Done");
	}
}
