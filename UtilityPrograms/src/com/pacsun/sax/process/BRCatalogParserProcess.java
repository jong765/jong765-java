package com.pacsun.sax.process;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class BRCatalogParserProcess {

	private String xmlFileName;
	private BRCatalogParserHandler handler;

	public void run() {

		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {

			InputStream xmlInput = new FileInputStream(xmlFileName);
			SAXParser saxParser = factory.newSAXParser();
			saxParser.parse(xmlInput, handler);

		} catch (ParserConfigurationException e) {
			System.out.println("ParserConfig error");
		} catch (SAXException e) {
			System.out.println("SAXException : xml not well formed");
		} catch (IOException e) {
			System.out.println("IO error");
		}
	}

	public String getXmlFileName() {
		return xmlFileName;
	}

	public void setXmlFileName(String xmlFileName) {
		this.xmlFileName = xmlFileName;
	}

	public BRCatalogParserHandler getHandler() {
		return handler;
	}

	public void setHandler(BRCatalogParserHandler handler) {
		this.handler = handler;
	}
	
}
