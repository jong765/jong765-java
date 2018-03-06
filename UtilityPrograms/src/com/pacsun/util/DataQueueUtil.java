package com.pacsun.util;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.DataQueue;
import com.ibm.as400.access.DataQueueEntry;
import com.ibm.as400.access.ErrorCompletingRequestException;
import com.ibm.as400.access.IllegalObjectTypeException;
import com.ibm.as400.access.KeyedDataQueue;
import com.ibm.as400.access.ObjectDoesNotExistException;

public class DataQueueUtil {

	private static final Logger log = Logger.getLogger(DataQueueUtil.class);

	public static DataQueue getDataQueue(AS400 system, String dqLibrary, String dqName) {

		String dqString = "/QSYS.LIB/" + dqLibrary + ".LIB/" + dqName + ".DTAQ";
		DataQueue dq = new DataQueue(system, dqString);
		return dq;

	}

	public static KeyedDataQueue getKeyedDataQueue(AS400 system, String dqLibrary, String dqName) {

		String dqString = "/QSYS.LIB/" + dqLibrary + ".LIB/" + dqName + ".DTAQ";
		KeyedDataQueue dq = new KeyedDataQueue(system, dqString);
		return dq;

	}

	public static String readDataQueueEntry(DataQueue dq, int waitTime)
			throws AS400SecurityException, ErrorCompletingRequestException, IOException,
			IllegalObjectTypeException, InterruptedException, ObjectDoesNotExistException {

		DataQueueEntry entry = dq.read(waitTime);
		return entry == null ? "" : entry.getString();
	}

	public static void writeDataQueueEntry(DataQueue dq, String entry)
			throws AS400SecurityException, ErrorCompletingRequestException, IOException,
			IllegalObjectTypeException, InterruptedException, ObjectDoesNotExistException {
		dq.write(entry);
	}

	public static void close(AS400 sys) {
		if (sys != null) {
			try {
				sys.disconnectAllServices();
			} catch (Exception e) {
				log.error("DataQueueUtil.class: disconnecting system, error "
						+ StackTrace.getStackTrace(e));
			}

		}
	}

}
