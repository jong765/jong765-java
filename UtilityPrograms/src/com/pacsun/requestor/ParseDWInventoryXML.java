package com.pacsun.requestor;

import com.pacsun.process.ParseDWInventoryXMLProcess;

public class ParseDWInventoryXML {

	public static void main(String[] args) throws Exception {

		ParseDWInventoryXMLProcess process = new ParseDWInventoryXMLProcess();

		String inventoryFileName = "C:/Users/jkim/Documents/Staging_InventoryExport_12012015.xml";

		process.run(inventoryFileName);
		System.out.println("Inventory XML Parse completed successfully.");

	}

}
