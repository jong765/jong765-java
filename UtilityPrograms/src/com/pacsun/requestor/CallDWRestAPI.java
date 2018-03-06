package com.pacsun.requestor;

import com.pacsun.process.CallDWRestAPIProcess;

public class CallDWRestAPI {

	public static void main(String[] args) throws Exception {

		CallDWRestAPIProcess process = new CallDWRestAPIProcess();
		process.run();
		System.out.println("Call DW Rest API completed successfully.");

	}

}
