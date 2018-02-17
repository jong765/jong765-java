package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException,
			FactoryConfigurationError, TransformerException {

		File xmlFile = new File("test.xml");
		StringBuffer xmlStringBuffer = new StAXStreamHandler().processXMLFile(xmlFile);

		// System.out.println(xmlStringBuffer.toString());
		System.out.println(Driver.transformXML(4, xmlStringBuffer.toString()));

	}

	public static String transformXML(int indentation, String rawXML) throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		transformerFactory.setAttribute("indent-number", indentation);
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		StreamResult streamResult = new StreamResult(new StringWriter());
		transformer.transform(new StreamSource(new StringReader(rawXML)), streamResult);
		return streamResult.getWriter().toString();
	}

}
