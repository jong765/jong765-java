package com.pacsun.requestor;

import javax.xml.bind.JAXBException;
import com.pacsun.process.ParseDWCatalogXmlProcessJaxb;

public class ParseDWCatalogXmlJaxb {

	public static void main(String[] args) throws JAXBException {

		ParseDWCatalogXmlProcessJaxb process = new ParseDWCatalogXmlProcessJaxb();
		process.run();
		System.out.println("Catalog XML Parse completed successfully.");

	}

}
