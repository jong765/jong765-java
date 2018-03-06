package com.pacsun.util;

import java.beans.PropertyVetoException;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.DataQueue;
import com.ibm.as400.access.ErrorCompletingRequestException;
import com.ibm.as400.access.IllegalObjectTypeException;
import com.ibm.as400.access.ObjectDoesNotExistException;

public class DataQueueUtilityTest {

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
	public void testWriteDataQueueEntry() throws PropertyVetoException, AS400SecurityException,
			ErrorCompletingRequestException, IOException, IllegalObjectTypeException,
			InterruptedException, ObjectDoesNotExistException {
		AS400 system = new AS400();
		system.setSystemName("LOLADEV");
		boolean remoteFlag = true;

		if (remoteFlag) {
			system.setUserId("JKIM");
			// system.setPassword("Password");
		}

		String dqLibrary = "JKIM";
		String dqName = "JKQUEUE";
		DataQueue dataQueue = DataQueueUtil.getDataQueue(system, dqLibrary, dqName);

		String entry = "second";
		DataQueueUtil.writeDataQueueEntry(dataQueue, entry);

		System.out.println("Done");

	}

	@Test
	public void testReadDataQueueEntry() throws AS400SecurityException,
			ErrorCompletingRequestException, IOException, IllegalObjectTypeException,
			InterruptedException, ObjectDoesNotExistException, PropertyVetoException {
		boolean remoteFlag = true;

		AS400 system = new AS400();
		system.setSystemName("LOLADEV");

		if (remoteFlag) {
			system.setUserId("JKIM");
			system.setPassword("Password");
		}

		String dqLibrary = "JKIM";
		String dqName = "MERJOBDTAQ";
		DataQueue dataQueue = DataQueueUtil.getDataQueue(system, dqLibrary, dqName);
		String dtaqEntry = DataQueueUtil.readDataQueueEntry(dataQueue, 1);
		if (dtaqEntry != null && dtaqEntry.equalsIgnoreCase("*END")) {
			System.out.println(dtaqEntry);
		} else {
			System.out.println("No entry");
		}
	}

}
