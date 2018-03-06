package com.pacsun.dao.impl;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pacsun.dao.CustomerDAO;
import com.pacsun.dto.CustomerDTO;

public class CustomerDAOImplTest {

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
	public void testFindAllCustomers() {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		List<CustomerDTO> customerList = customerDAO.findAllCustomers();
		System.out.println(customerList);

	}

}
