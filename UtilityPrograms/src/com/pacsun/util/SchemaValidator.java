package com.pacsun.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.log4j.Logger;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXParseException;

public class SchemaValidator {
	private SAXSource source;
	private FileReader fileReader;
	private String schemaName = "";
	private File xmlFile = null;
	private int errorCount = 0;
	private static final Logger log = Logger.getLogger(SchemaValidator.class);

	public void validate() throws Exception {
		if (this.getSchemaName() != null && this.getSchemaName().length() > 0) {
			Schema schema = loadSchema(this.getSchemaName());
			validateXml(schema, this.getXmlFile());
		} else {
			throw new Exception("Schema file is not found.");
		}
	}

	private void validateXml(Schema schema, File xmlFile) throws Exception {

		Validator validator;
		// preparing the XML file as a SAX source
		try {
			// Creating a Validator instance
			validator = schema.newValidator();
			log.debug(this.getClass().getName() + ": Validator Class: " + validator.getClass().getName());
			fileReader = new FileReader(xmlFile);
			source = new SAXSource(new InputSource(fileReader));
		} catch (Exception e) {
			log.error(this.getClass().getName() + ": getting source XML file to SAX failed.  Errors as follow :\n"
					+ StackTrace.getStackTrace(e));
			throw new Exception(e);
		}

		// Validating the SAX source against the schema
		try {
			validator.validate(source);
		} catch (SAXParseException e) {
			printException(e);
			Locator locator = null;
			throw new SAXParseException("XML Parse exception", locator);
		} catch (IOException e) {
			log.error(this.getClass().getName() + ": I/O error: " + "Errors as follow :\n"
					+ StackTrace.getStackTrace(e));
			throw new IOException(e);
		} finally {
			fileReader.close();
		}
	}

	// Load schema file as schema object
	private Schema loadSchema(String schemaName) {
		Schema schema = null;
		try {
			String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
			SchemaFactory factory = SchemaFactory.newInstance(language);
			schema = factory.newSchema(new File(schemaName));
		} catch (Exception e) {
			log.error(this.getClass().getName() + ": failed loading: " + schemaName + ".  Errors as follow :\n"
					+ StackTrace.getStackTrace(e));
		}
		return schema;
	}

	private void printException(SAXParseException e) {
		errorCount++;
		log.error(this.getClass().getName() + ": validation error details for XML: " + " against schema: "
				+ this.getSchemaName() + "\nError counts: " + Integer.toString(errorCount) + "\nLine number: "
				+ e.getLineNumber() + "\nColumn number: " + e.getColumnNumber() + "\nMessage: " + e.getMessage());
		System.out.println(this.getClass().getName() + ": validation error details for XML: " + " against schema: "
				+ this.getSchemaName() + "\nError counts: " + Integer.toString(errorCount) + "\nLine number: "
				+ e.getLineNumber() + "\nColumn number: " + e.getColumnNumber() + "\nMessage: " + e.getMessage());
	}

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public File getXmlFile() {
		return xmlFile;
	}

	public void setXmlFile(File xmlFile) {
		this.xmlFile = xmlFile;
	}

}
