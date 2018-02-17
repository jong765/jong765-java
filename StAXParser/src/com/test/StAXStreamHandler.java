package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StAXStreamHandler {

	public StringBuffer processXMLFile(File xmlFile) throws FileNotFoundException,
			XMLStreamException, FactoryConfigurationError {
		StringBuffer rawXML = new StringBuffer();
		XMLStreamReader xmlStreamReader = (XMLInputFactory.newInstance())
				.createXMLStreamReader(new FileInputStream(xmlFile));

		boolean inProductTag = false;

		while (xmlStreamReader.hasNext()) {
			xmlStreamReader.next();
			switch (xmlStreamReader.getEventType()) {
			case XMLStreamConstants.START_ELEMENT:
				String attributeString = this.getAttributeString(xmlStreamReader);
				if (xmlStreamReader.getLocalName().equalsIgnoreCase("product"))
					inProductTag = true;
				if (inProductTag) {
					rawXML.append("<" + xmlStreamReader.getLocalName() + attributeString + ">");
				}
				break;
			case XMLStreamConstants.CHARACTERS:
				if (inProductTag && !xmlStreamReader.isWhiteSpace())
					rawXML.append(xmlStreamReader.getText());
				break;
			case XMLStreamConstants.END_ELEMENT:
				if (inProductTag)
					rawXML.append("</" + xmlStreamReader.getLocalName() + ">");
				if (xmlStreamReader.getLocalName().equalsIgnoreCase("product"))
					inProductTag = false;
				break;
			}
		}
		return rawXML;
	}

	public String getAttributeString(XMLStreamReader xmlStreamReader) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < xmlStreamReader.getAttributeCount(); i++) {
			String name = xmlStreamReader.getAttributeLocalName(i);
			String value = xmlStreamReader.getAttributeValue(i);
			sb.append(" " + name + "=\"" + value + "\"");
		}
		return sb.toString();
	}
}