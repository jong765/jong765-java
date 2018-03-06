package com.pacsun.requestor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.sax.process.DWCustomerParserProcess;

public class ParseDWCustomerXmlSax {

	public static void main(String[] args) {

		String xmlFileName = "C:/temp/Demandware/ProductionCustomerExport_07062017NEW.xml";
		// String xmlFileName = "C:/temp/Demandware/testcustomerexport1.xml";

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"parseDWCustomerXmlSaxApplicationContext.xml");
		DWCustomerParserProcess dwCustomerParserProcess = (DWCustomerParserProcess) context
				.getBean("dwCustomerParserProcess");
		dwCustomerParserProcess.setXmlFileName(xmlFileName);
		dwCustomerParserProcess.run();
		context.close();
	}

}
