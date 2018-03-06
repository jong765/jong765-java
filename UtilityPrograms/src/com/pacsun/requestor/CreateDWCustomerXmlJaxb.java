package com.pacsun.requestor;

import javax.xml.bind.JAXBException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.process.CreateDWCustomerXmlProcessJaxb;

public class CreateDWCustomerXmlJaxb {

	public static void main(String[] args) throws JAXBException {

		String xmlOutputFile = "Custom/QUA/xml/FixCustomerGigyaFlag.xml";

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"parseDWCustomerXMLApplicationContext.xml");
		CreateDWCustomerXmlProcessJaxb createDWCustomerXmlProcessJaxb = (CreateDWCustomerXmlProcessJaxb) context
				.getBean("createDWCustomerXmlProcessJaxb");

		createDWCustomerXmlProcessJaxb.run(xmlOutputFile);
		context.close();

		System.out.println("Process completed.");

		System.exit(0);

	}

}
