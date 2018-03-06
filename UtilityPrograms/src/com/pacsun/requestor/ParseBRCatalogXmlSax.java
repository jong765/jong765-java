package com.pacsun.requestor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.sax.process.BRCatalogParserProcess;

public class ParseBRCatalogXmlSax {

	public static void main(String[] args) {

		String xmlFileName = "C:/eclipse workspace jk/UtilityPrograms/Custom/QUA/xml/sbexport1.xml";

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"parseBRCatalogXmlSaxApplicationContext.xml");
		BRCatalogParserProcess brCatalogParserProcess = (BRCatalogParserProcess) context
				.getBean("brCatalogParserProcess");
		brCatalogParserProcess.setXmlFileName(xmlFileName);
		brCatalogParserProcess.run();
		context.close();

	}

}
