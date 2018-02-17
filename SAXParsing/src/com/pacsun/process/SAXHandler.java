package com.pacsun.process;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.pacsun.dto.ProductDTO;

public class SAXHandler extends DefaultHandler {

	private ProductDTO product;
	private String elementValue;
	private String attributeId;

	public void startDocument() throws SAXException {
		System.out.println("Start parsing xml file...");
	}

	public void endDocument() throws SAXException {
		System.out.println("XML parsing completed.");
	}

	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if (qName.equalsIgnoreCase("product")) {
			product = new ProductDTO();
			product.setProductId(attributes.getValue("product-id"));
		}
		if (qName.equalsIgnoreCase("custom-attribute")) {
			attributeId = attributes.getValue("attribute-id");
		}
	}

	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if (qName.equalsIgnoreCase("product")) {
			System.out.println("Product=" + product.getProductId() + ",Brand="
					+ product.getBrand() + ",Department="
					+ product.getDepartment());
		}
		if (qName.equalsIgnoreCase("brand")) {
			product.setBrand(elementValue);
		}
		if (attributeId != null && attributeId.equalsIgnoreCase("department")) {
			product.setDepartment(elementValue);
		}
	}

	public void characters(char ch[], int start, int length)
			throws SAXException {
		elementValue = new String(ch, start, length);
	}

	public void ignorableWhitespace(char ch[], int start, int length)
			throws SAXException {
	}

}