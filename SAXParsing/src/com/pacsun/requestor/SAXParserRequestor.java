package com.pacsun.requestor;

import com.pacsun.process.SAXParserProcess;

public class SAXParserRequestor {

	public static void main(String[] args) {

		String xmlFileName = "xml/Small.xml";
		
		SAXParserProcess process = new SAXParserProcess(xmlFileName);
		process.run();

	}

}
