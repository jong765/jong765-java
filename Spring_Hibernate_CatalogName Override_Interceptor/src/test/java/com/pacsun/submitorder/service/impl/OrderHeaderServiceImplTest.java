package com.pacsun.submitorder.service.impl;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pacsun.locate.submitorder.model.OrderHeader;
import com.pacsun.locate.submitorder.service.OrderHeaderService;

@ContextConfiguration({ "classpath:hsqlApplicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderHeaderServiceImplTest {

	@Autowired
	private OrderHeaderService orderHeaderService;

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
	public void findUnprocessedOrders() {
		List<OrderHeader> orderHeaderList = orderHeaderService.findUnprocessedOrders();
		for (OrderHeader orderHeader : orderHeaderList) {
			System.out.println(orderHeader);
		}
	}
}
