package com.pacsun.requestor;

import com.pacsun.process.CallDwOCAPIProcess;

public class CallDwOCAPI {

	private static String clientId = "client_id=a9814d91-7e39-413c-bb55-1db9f3fb2745";

	public static void main(String[] args) throws Exception {

		CallDwOCAPIProcess process = new CallDwOCAPIProcess();
		process.setClientId(clientId);

		process.getProduct("0098201220428");
		// process.addProduct("4235370", 1);
		System.out.println("Call DW OCAPI completed successfully.");

	}

}