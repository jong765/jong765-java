package com.pacsun.process;

import java.io.File;

import com.pacsun.util.SchemaValidator;

public class ValidateXMLSchemaProcess {

	private String schemaFileName;
	private String xmlFileName;

	public ValidateXMLSchemaProcess(String schemaFileName, String xmlFileName) {
		this.schemaFileName = schemaFileName;
		this.xmlFileName = xmlFileName;
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public void run() throws Exception {

		SchemaValidator schemaValidator = new SchemaValidator();

		File xmlFile = new File(xmlFileName);
		schemaValidator.setSchemaName(schemaFileName);
		schemaValidator.setXmlFile(xmlFile);
		schemaValidator.validate();

	}

	public String getSchemaFileName() {
		return schemaFileName;
	}

	public void setSchemaFileName(String schemaFileName) {
		this.schemaFileName = schemaFileName;
	}

	public String getXmlFileName() {
		return xmlFileName;
	}

	public void setXmlFileName(String xmlFileName) {
		this.xmlFileName = xmlFileName;
	}

}
