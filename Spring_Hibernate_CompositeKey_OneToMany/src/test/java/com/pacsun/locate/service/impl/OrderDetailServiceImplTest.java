package com.pacsun.locate.service.impl;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pacsun.locate.model.OrderDetail;
import com.pacsun.locate.service.IOrderDetailService;

@ContextConfiguration({ "classpath:applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderDetailServiceImplTest {

	@Autowired
	IOrderDetailService orderDetailService;

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
	public void findOrderLineItems() throws Exception {
		for (int i = 0; i < 1000; i++) {
			List<OrderDetail> orderDetailList = orderDetailService.findOrderLineItems(277, "PCK", "899");
			for (OrderDetail orderDetail : orderDetailList) {
				System.out.println(orderDetail);
			}
			System.out.println(i);
		}
	}

}
