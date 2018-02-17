package com.pacsun.process;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserProcess {

	private String xmlFileName;

	public SAXParserProcess(String xmlFileName) {
		this.xmlFileName = xmlFileName;
	}

	public void run() {

		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {

			InputStream xmlInput = new FileInputStream(xmlFileName);
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler handler = new SAXHandler();
			saxParser.parse(xmlInput, handler);

		} catch (ParserConfigurationException e) {
			System.out.println("ParserConfig error");
		} catch (SAXException e) {
			System.out.println("SAXException : xml not well formed");
		} catch (IOException e) {
			System.out.println("IO error");
		}
	}
}
