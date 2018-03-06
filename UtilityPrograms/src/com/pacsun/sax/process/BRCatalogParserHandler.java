package com.pacsun.sax.process;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.pacsun.sax.br.dao.ProductDAO;
import com.pacsun.sax.br.dto.ProductDTO;

public class BRCatalogParserHandler extends DefaultHandler {

	private ProductDTO productDTO;
	private String elementValue;
	private ProductDAO productDAO;
	private int counter = 0;
	private List<ProductDTO> productDTOList;

	public void startDocument() throws SAXException {
		System.out.println("Start parsing xml file...");
		productDTOList = new ArrayList<ProductDTO>();
	}

	public void endDocument() throws SAXException {
		System.out.println("XML parsing completed.");
		System.out.println("Committing to database table...");
		productDAO.insertBatch(productDTOList);
		System.out.println("Commitment to database table has completed.");
	}

	public void startElement(String uri, String localName, String qName, Attributes attributes)
			throws SAXException {
		if (qName.equalsIgnoreCase("Product")) {
			productDTO = new ProductDTO();
		}
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("Product")) {
			productDTOList.add(productDTO);
			System.out.println(productDTO.getProductId());
			counter++;
			if (counter % 1000 == 0) {
				// System.out.println(counter +
				// " products were loaded into ProductDTO list.");
			}
		}
		if (qName.equalsIgnoreCase("ProductId")) {
			productDTO.setProductId(elementValue);
		}
		if (qName.equalsIgnoreCase("ProductType")) {
			productDTO.setProductType(elementValue);
		}
		if (qName.equalsIgnoreCase("MasterProductId")) {
			productDTO.setMasterProductId(elementValue);
		}
	}

	public void characters(char ch[], int start, int length) throws SAXException {
		elementValue = new String(ch, start, length);
	}

	public void ignorableWhitespace(char ch[], int start, int length) throws SAXException {
	}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

}