package com.pacsun.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBUnmarshallerUtil {

	public Object getJAXBObject(Class<?> className, InputStream inputStream) throws JAXBException {

		Object object = null;

		try {
			Reader reader = new InputStreamReader(inputStream, "utf-8");
			object = getUnmarshaller(className).unmarshal(inputStream);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null)
					inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return object;
	}

	private Unmarshaller getUnmarshaller(Class<?> className) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(className);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		return jaxbUnmarshaller;
	}

}
