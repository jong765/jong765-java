package com.pacsun.sax.process;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.pacsun.dao.CustomerDAO;
import com.pacsun.dto.CustomerDTO;
import com.pacsun.util.DateUtil;

public class DWCustomerParserHandler extends DefaultHandler {

	private CustomerDTO customerDTO;
	private String elementValue;
	private String attributeId;
	private CustomerDAO customerDAO;
	private int counter = 0;
	private List<CustomerDTO> customerDTOList;

	public void startDocument() throws SAXException {
		System.out.println("Start parsing xml file...");
		customerDTOList = new ArrayList<CustomerDTO>();
	}

	public void endDocument() throws SAXException {
		System.out.println("XML parsing completed.");
		System.out.println("Committing to database table...");
		customerDAO.insertBatch(customerDTOList);
		System.out.println("Commitment to database table has completed.");
	}

	public void startElement(String uri, String localName, String qName, Attributes attributes)
			throws SAXException {
		if (qName.equalsIgnoreCase("customer")) {
			customerDTO = new CustomerDTO();
			customerDTO.setCustomerNumber(attributes.getValue("customer-no"));
			// System.out.println("\ncustomer-no=" +
			// customerDTO.getCustomerNumber());
		}

		if (qName.equalsIgnoreCase("custom-attribute")) {
			attributeId = attributes.getValue("attribute-id");
		}
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("customer")) {
			if (customerDTO.getGigyaToDemandwareConversion() == null
					|| customerDTO.getGigyaToDemandwareConversion().equalsIgnoreCase("false")) {

				String dateFormat = "yyyy-MM-dd'T'HH:mm:ss";
				Date testDate = DateUtil.convertStringToDate(customerDTO.getCreationDate(),
						dateFormat);
				Date compareDate = DateUtil.convertStringToDate("2017-01-01T01:00:00.000Z",
						dateFormat);

				int testFlag = testDate.compareTo(compareDate);

				if (testFlag > 0) { // creation date greater than 2017-01-01
					customerDTOList.add(customerDTO);
					counter++;
					if (counter % 1000 == 0) {
						System.out.println(counter
								+ " customers were loaded into CustomerDTO list.");
					}
				}

			}
		}
		if (qName.equalsIgnoreCase("login")) {
			customerDTO.setLogin(elementValue);
		} else if (qName.equalsIgnoreCase("first-name")) {
			customerDTO.setFirstName(elementValue);
		} else if (qName.equalsIgnoreCase("last-name")) {
			customerDTO.setLastName(elementValue);
		} else if (qName.equalsIgnoreCase("email")) {
			customerDTO.setEmail(elementValue);
		} else if (qName.equalsIgnoreCase("creation-date")) {
			customerDTO.setCreationDate(elementValue);
		} else if (qName.equalsIgnoreCase("custom-attribute")) {
			if (attributeId != null && attributeId.equalsIgnoreCase("Zip")) {
				customerDTO.setZip(elementValue);
			}
			if (attributeId != null && attributeId.equalsIgnoreCase("gigyaUID")) {
				customerDTO.setGigyaUId(elementValue);
			}
			if (attributeId != null && attributeId.equalsIgnoreCase("gigyaToDemandwareConversion")) {
				customerDTO.setGigyaToDemandwareConversion(elementValue);
			}
			if (attributeId != null && attributeId.equalsIgnoreCase("needsGigyaResetPassword")) {
				customerDTO.setNeedsGigyaResetPassword(elementValue);
			}
		}

	}

	public void characters(char ch[], int start, int length) throws SAXException {
		elementValue = new String(ch, start, length);
	}

	public void ignorableWhitespace(char ch[], int start, int length) throws SAXException {
	}

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

}