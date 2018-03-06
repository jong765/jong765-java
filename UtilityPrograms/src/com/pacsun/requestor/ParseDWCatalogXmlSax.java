package com.pacsun.requestor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.sax.process.DWCatalogParserProcess;

public class ParseDWCatalogXmlSax {

	public static void main(String[] args) {

		String xmlFileName = "C:/temp/Catalog feed/testcatalog3.xml";

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"parseDWCatalogXmlSaxApplicationContext.xml");
		DWCatalogParserProcess dwCatalogParserProcess = (DWCatalogParserProcess) context
				.getBean("dwCatalogParserProcess");
		dwCatalogParserProcess.setXmlFileName(xmlFileName);
		dwCatalogParserProcess.run();
		context.close();
	}

}
