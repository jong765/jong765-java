package com.pacsun.util;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBMarshallerUtil {

	public String getXMLString(Class<?> className, Object classObject) throws JAXBException {

		Marshaller jaxbMarshaller = getMarshaller(className);
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter stringWriter = new StringWriter();
		jaxbMarshaller.marshal(classObject, stringWriter);

		return stringWriter.toString();
	}

	private Marshaller getMarshaller(Class<?> className) throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(className);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		return jaxbMarshaller;
	}

}
