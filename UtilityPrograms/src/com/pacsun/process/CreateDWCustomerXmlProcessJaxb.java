package com.pacsun.process;

import java.util.List;

import javax.xml.bind.JAXBException;

import com.pacsun.customer.jaxb.ComplexTypeCustomer;
import com.pacsun.customer.jaxb.ComplexTypeProfile;
import com.pacsun.customer.jaxb.Customers;
import com.pacsun.customer.jaxb.ObjectFactory;
import com.pacsun.customer.jaxb.SharedTypeCustomAttribute;
import com.pacsun.customer.jaxb.SharedTypeCustomAttributes;
import com.pacsun.dao.CustomerDAO;
import com.pacsun.dto.CustomerDTO;
import com.pacsun.util.FileUtils;
import com.pacsun.util.JAXBMarshallerUtil;

public class CreateDWCustomerXmlProcessJaxb {

	private CustomerDAO customerDAO;

	public void run(String xmlFile) throws JAXBException {

		List<CustomerDTO> customerList = customerDAO.findAllCustomers();

		ObjectFactory objectFactory = new ObjectFactory();

		Customers customers = objectFactory.createCustomers();

		for (CustomerDTO customerDTO : customerList) {
			ComplexTypeCustomer customer = objectFactory.createComplexTypeCustomer();
			customer.setCustomerNo(customerDTO.getCustomerNumber());

			ComplexTypeProfile profile = objectFactory.createComplexTypeProfile();

			SharedTypeCustomAttributes customAttributes = objectFactory
					.createSharedTypeCustomAttributes();

			SharedTypeCustomAttribute customAttribute = objectFactory
					.createSharedTypeCustomAttribute();
			customAttribute.setAttributeId("gigyaToDemandwareConversion");
			customAttribute.getContent().add("true");
			customAttributes.getCustomAttribute().add(customAttribute);

			customAttribute = objectFactory.createSharedTypeCustomAttribute();
			customAttribute.setAttributeId("needsGigyaResetPassword");
			customAttribute.getContent().add("false");
			customAttributes.getCustomAttribute().add(customAttribute);

			profile.setCustomAttributes(customAttributes);
			customer.setProfile(profile);
			customers.getCustomer().add(customer);
		}

		JAXBMarshallerUtil jaxbMarshallerUtil = new JAXBMarshallerUtil();
		String xmlString = jaxbMarshallerUtil.getXMLString(Customers.class, customers);
		FileUtils.writeFile(xmlFile, xmlString, true);
	}

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

}
