package com.pacsun;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class mainApp {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		// TODO Auto-generated method stub

		XMLInputFactory inputFactory = XMLInputFactory.newInstance();

		XMLStreamReader reader = inputFactory.createXMLStreamReader(new FileInputStream(new File(
				"C:/temp/Catalog feed/testcatalog3.xml")));
		while (reader.hasNext()) {
			int next = reader.next();

			if (next == XMLStreamReader.START_ELEMENT) {
				System.out.println(reader.getLocalName());
				reader.next();
				System.out.println(reader.getText());
			} else if (next == XMLStreamReader.END_ELEMENT) {

			} else if (next == XMLStreamReader.ATTRIBUTE) {
				// Print out all the attributes
			} else if (next == XMLStreamReader.COMMENT) {
				// Print the comment
			}
		}

	}
}
