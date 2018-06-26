package com.pacsun.cybersource.requestor;

import org.apache.log4j.Logger;

import com.pacsun.cybersource.process.ConvertTransactionToCustomerProfileProcess;

public class ConvertTransactionToCustomerProfileRequestor {

	private static final Logger log = Logger.getLogger(ConvertTransactionToCustomerProfileRequestor.class);

	public static void main(String[] args) throws Exception {

		if (args.length < 2) {
			String errorMessage = "Property file path is missing.";
			log.error(errorMessage);
			System.out.println(errorMessage);
			throw new Exception(errorMessage);
		} else {
			String cybsPropertyFilePath = args[0];
			String dbPropertyFilePath = args[1];
			new ConvertTransactionToCustomerProfileRequestor().run(cybsPropertyFilePath, dbPropertyFilePath);
		}
	}

	public void run(String cybsPropertyFilePath, String dbPropertyFilePath) throws Exception {
		ConvertTransactionToCustomerProfileProcess process = new ConvertTransactionToCustomerProfileProcess();
		try {
			process.run(cybsPropertyFilePath, dbPropertyFilePath);
		} catch (Exception e) {
			throw e;
		}
	}
}
