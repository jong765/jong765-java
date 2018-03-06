package com.pacsun.requestor;

import com.pacsun.process.ResetDWInventoryProcess;

public class ResetDWInventory {

	public static void main(String[] args) throws Exception {

		ResetDWInventoryProcess process = new ResetDWInventoryProcess();

		process.run();

		System.out.println("Reset DWInventory process completed successfully.");

	}

}
