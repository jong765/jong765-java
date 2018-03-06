package com.pacsun.util;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBUnmarshallerUtil {

	public Object getJAXBObject(Class<?> className, InputStream inputStream) throws JAXBException,
			IOException {

		Object object = null;

		try {
			object = getUnmarshaller(className).unmarshal(inputStream);
		} finally {
			if (inputStream != null)
				inputStream.close();
		}

		return object;
	}

	private Unmarshaller getUnmarshaller(Class<?> className) throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(className);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		return jaxbUnmarshaller;
	}

}
