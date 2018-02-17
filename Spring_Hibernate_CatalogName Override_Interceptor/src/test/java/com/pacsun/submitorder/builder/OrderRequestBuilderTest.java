package com.pacsun.submitorder.builder;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pacsun.locate.submitorder.builder.OrderRequestBuilder;

@ContextConfiguration({ "classpath:applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderRequestBuilderTest {

	@Autowired
	private OrderRequestBuilder orderRequestBuilder;

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
	public void buildMessageHeader() {
		orderRequestBuilder.buildMessageHeader();
		System.out.println(orderRequestBuilder.getMessageHeader());
	}

}
