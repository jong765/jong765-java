package com.pacsun.util;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckAS400JobStatusTest {

	AS400JobStatus jobStatus = new AS400JobStatus();

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
	public void testIsActive() throws Exception {
		jobStatus.setSystemName("LOLADEV");
		jobStatus.setUserName("JKIM");
		jobStatus.setPassword("superis1m");

		String jobName = "PQ_MROSTS";
		boolean isJobActive = jobStatus.isActive(jobName);
		assertTrue(isJobActive);

	}

}
