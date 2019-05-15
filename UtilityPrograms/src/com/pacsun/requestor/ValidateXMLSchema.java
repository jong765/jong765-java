package com.pacsun.requestor;

import com.pacsun.process.ValidateXMLSchemaProcess;

public class ValidateXMLSchema {

	public static void main(String[] args) throws Exception {

		String xmlFile = "C:/temp/Hingeto/Products-2019-05-01-1556719387-8ede13313530baf33d332b01e7820a8c6d40e0f0.xml";
		String schemaFile = "I:/git/jong765-java/UtilityPrograms/Custom/QUA/xsd/hingeto.xsd";

		ValidateXMLSchemaProcess process = new ValidateXMLSchemaProcess(schemaFile, xmlFile);
		process.run();

		System.out.println("Validation completed.");
	}

}
