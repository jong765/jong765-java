package com.pacsun.cybersource.requestor;

import org.apache.log4j.Logger;

import com.pacsun.cybersource.process.SettlementProcess;
import com.pacsun.util.StackTrace;

public class SettlementRequestor {

	private static final Logger log = Logger.getLogger(SettlementRequestor.class);

	public static void main(String[] args) throws Exception {

		if (args.length < 2) {
			String errorMessage = "Property file path is missing.";
			log.error(errorMessage);
			System.out.println(errorMessage);
			throw new Exception(errorMessage);
		} else {
			String cybsPropertyFilePath = args[0];
			String dbPropertyFilePath = args[1];
			new SettlementRequestor().run(cybsPropertyFilePath, dbPropertyFilePath);
			System.exit(0);
		}
	}

	public void run(String cybsPropertyFilePath, String dbPropertyFilePath) throws Exception {
		SettlementProcess process = new SettlementProcess();
		try {
			process.run(cybsPropertyFilePath, dbPropertyFilePath);
		} catch (Exception e) {
			String errorMessage = this.getClass().getName() + " : " + e.getMessage() + "\n" + StackTrace.getStackTrace(e);
			log.error(errorMessage);
			System.out.println(errorMessage);
			throw e;
		}
	}
}
