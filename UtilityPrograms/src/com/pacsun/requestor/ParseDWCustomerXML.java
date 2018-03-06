package com.pacsun.requestor;

import java.io.File;

import javax.xml.bind.JAXBException;

import com.pacsun.process.ParseDWCustomerXMLProcess;

public class ParseDWCustomerXML {

	public static void main(String[] args) throws JAXBException {

		ParseDWCustomerXMLProcess process = new ParseDWCustomerXMLProcess();
		File xmlFile = new File("Custom/QUA/xml/SandboxCustomerExport07072017.xml");
		process.run(xmlFile);
		System.out.println("Customer XML Parse completed successfully.");

	}

}
