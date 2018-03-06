package com.pacsun.requestor;

import com.pacsun.process.ValidateXMLSchemaProcess;

public class ValidateXMLSchema {

	public static void main(String[] args) throws Exception {

		String xmlFile = "C:/temp/Demandware/LoanerStagingInventory.xml";
		String schemaFile = "C:/eclipse_workspace jk/UtilityPrograms/Custom/QUA/xsd/inventory.xsd";

		ValidateXMLSchemaProcess process = new ValidateXMLSchemaProcess(schemaFile, xmlFile);
		process.run();

		System.out.println("Validation completed.");
	}

}
