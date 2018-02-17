package com.test;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;

public class Demo {

	public static void main(String[] args) throws Exception {

		Root root = new Root();
		root.setId("8342221");
		root.setName("James Bond");
		root.setSurname("Double O Seven");

		Marshaller jaxbMarshaller = getMarshaller(Root.class);
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.setProperty(CharacterEscapeHandler.class.getName(),
				new CharacterEscapeHandler() {
					@Override
					public void escape(char[] ac, int i, int j, boolean flag, Writer writer)
							throws IOException {
						writer.write(ac, i, j);
					}
				});
		jaxbMarshaller.marshal(root, new OutputStreamWriter(System.out));

	}

	private static Marshaller getMarshaller(Class<?> className) throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(className);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		return jaxbMarshaller;
	}

}