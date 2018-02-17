package com.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Root {

	@XmlJavaTypeAdapter(AdapterCDATA.class)
	private String name;

	@XmlJavaTypeAdapter(AdapterCDATA.class)
	private String surname;

	@XmlJavaTypeAdapter(AdapterCDATA.class)
	private String id;

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setId(String id) {
		this.id = id;
	}

}
