package com.pacsun.requestor;

import javax.xml.bind.JAXBException;

import com.pacsun.process.ConvertStoreCsvToXmlProcess;

public class ConvertStoreCsvToXml {

	public static void main(String[] args) throws JAXBException {

		ConvertStoreCsvToXmlProcess process = new ConvertStoreCsvToXmlProcess();

		String inputFileName = "Custom/QUA/file/Store.csv";
		String outputFileName = "Custom/QUA/xml/StoreLocatorStore.xml";

		process.run(inputFileName, outputFileName);

		System.out.println("Process completed successfully.");

	}

}