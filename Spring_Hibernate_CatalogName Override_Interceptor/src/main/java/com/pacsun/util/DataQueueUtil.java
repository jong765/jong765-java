package com.pacsun.util;

import java.io.IOException;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.DataQueue;
import com.ibm.as400.access.DataQueueEntry;
import com.ibm.as400.access.ErrorCompletingRequestException;
import com.ibm.as400.access.IllegalObjectTypeException;
import com.ibm.as400.access.KeyedDataQueue;
import com.ibm.as400.access.ObjectDoesNotExistException;

public class DataQueueUtil {

	public DataQueue getDataQueue(AS400 system, String dqLibrary, String dqName) {

		String dqString = "/QSYS.LIB/" + dqLibrary + ".LIB/" + dqName + ".DTAQ";
		DataQueue dq = new DataQueue(system, dqString);
		return dq;

	}

	public KeyedDataQueue getKeyedDataQueue(AS400 system, String dqLibrary, String dqName) {

		String dqString = "/QSYS.LIB/" + dqLibrary + ".LIB/" + dqName + ".DTAQ";
		KeyedDataQueue dq = new KeyedDataQueue(system, dqString);
		return dq;

	}

	public String readDataQueueEntry(DataQueue dq, int waitTime) throws AS400SecurityException,
			ErrorCompletingRequestException, IOException, IllegalObjectTypeException,
			InterruptedException, ObjectDoesNotExistException {

		DataQueueEntry entry = dq.read(waitTime);
		return entry == null ? "" : entry.getString();
	}

}
