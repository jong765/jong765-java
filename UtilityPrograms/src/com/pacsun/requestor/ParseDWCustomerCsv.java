package com.pacsun.requestor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.csv.process.DWCustomerParserProcess;

public class ParseDWCustomerCsv {

	public static void main(String[] args) {

		String csvFileName = "Custom/QUA/file/DWCustomerList.csv";

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"parseDWCustomerCsvApplicationContext.xml");
		DWCustomerParserProcess dwCustomerParserProcess = (DWCustomerParserProcess) context
				.getBean("dwCustomerParserProcess");
		dwCustomerParserProcess.setCsvFileName(csvFileName);
		dwCustomerParserProcess.run();
		context.close();
		System.out.println("Parsing completed.");
	}

}
