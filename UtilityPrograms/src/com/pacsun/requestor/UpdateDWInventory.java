package com.pacsun.requestor;

import com.pacsun.process.UpdateDWInventoryProcess;

public class UpdateDWInventory {

	public static void main(String[] args) throws Exception {

		UpdateDWInventoryProcess process = new UpdateDWInventoryProcess();
		
		String mode = "";
		String productId = "";
		String count = "";
		String reference = "";
		String dataQueueKey = "";
		
		process.run(mode, productId, count, reference, dataQueueKey);
		
		System.out.println("Update DWInventory process completed successfully.");

	}

}
