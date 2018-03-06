package com.pacsun.sax.process;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.pacsun.sax.dto.ProductDTO;
import com.pacsun.sax.dw.dao.ProductDAO;

public class DWCatalogParserHandler extends DefaultHandler {

	private ProductDTO productDTO;
	private String elementValue;
	private String attributeId;
	private String siteId;
	private ProductDAO productDAO;
	private int counter = 0;
	private List<ProductDTO> productDTOList;
	private Set<String> displayNameSet = new HashSet<String>();
	private boolean isInCategoryNode = false;

	private boolean writeProductId = true;

	public void startDocument() throws SAXException {
		System.out.println("Start parsing xml file...");
		displayNameSet.add("Homepage");
		displayNameSet.add("Special Offers Attributes");
		displayNameSet.add("Shop By Category");
		displayNameSet.add("Shop by Gender");
		productDTOList = new ArrayList<ProductDTO>();
	}

	public void endDocument() throws SAXException {
		System.out.println("XML parsing completed.");
		System.out.println("Committing to database table...");
		// productDAO.insertBatch(productDTOList);
		System.out.println("Commitment to database table has completed.");
	}

	public void startElement(String uri, String localName, String qName, Attributes attributes)
			throws SAXException {

		if (qName.equalsIgnoreCase("category")) {
			isInCategoryNode = true;
		}

		if (qName.equalsIgnoreCase("product")) {
			productDTO = new ProductDTO();
			productDTO.setProductId(attributes.getValue("product-id"));
			if (this.writeProductId && counter < 10)
				System.out.println(productDTO.getProductId());
			// if (productDTO.getProductId().equalsIgnoreCase("3693041"))
			// this.writeProductId = false;
		}

		if (qName.equalsIgnoreCase("online-flag")) {
			siteId = attributes.getValue("site-id");
		}

		if (qName.equalsIgnoreCase("custom-attribute")) {
			attributeId = attributes.getValue("attribute-id");
		}
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("category")) {
			isInCategoryNode = false;
		}
		if (qName.equalsIgnoreCase("product")) {
			// System.out.println("Product=" + productDTO.getProductId() +
			// ",Brand="
			// + productDTO.getBrand() + ",Department="
			// + productDTO.getDepartment());
			productDTOList.add(productDTO);
			counter++;
			// if (counter % 1000 == 0) {
			// System.out.println(counter +
			// " products were loaded into ProductDTO list.");
			// }
		}
		if (!isInCategoryNode && qName.equalsIgnoreCase("display-name")) {
			if (!displayNameSet.contains(elementValue)) {
				productDTO.setDisplayName(elementValue);
			}
		}
		if (qName.equalsIgnoreCase("brand")) {
			productDTO.setBrand(elementValue);
		}
		if (attributeId != null && attributeId.equalsIgnoreCase("department")) {
			productDTO.setDepartment(elementValue);
		}

		if (qName.equalsIgnoreCase("online-flag")) {
			if (siteId != null && siteId.equalsIgnoreCase("pacsun")) {
				productDTO.setOnlineFlagPacsun(elementValue);
			}
			if (siteId != null && siteId.equalsIgnoreCase("tablet")) {
				productDTO.setOnlineFlagTablet(elementValue);
			}
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