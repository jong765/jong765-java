package com.pacsun.requestor;

import com.pacsun.process.CallDWLocateAPITestProcess;

public class CallDWLocateAPITest {

	public static void main(String[] args) throws Exception {

		CallDWLocateAPITestProcess process = new CallDWLocateAPITestProcess();
		process.run();
		System.out.println("Call DW Locate API Test completed successfully.");

	}

}
