package com.pacsun.process;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.customer.jaxb.ComplexTypeCustomer;
import com.pacsun.customer.jaxb.Customers;
import com.pacsun.customer.jaxb.SharedTypeCustomAttribute;
import com.pacsun.dao.CustomerDAO;
import com.pacsun.dto.CustomerDTO;

public class ParseDWCustomerXMLProcess {

	@SuppressWarnings("resource")
	public void run(File xmlFile) throws JAXBException {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"parseDWCustomerXMLApplicationContext.xml");

		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");

		JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Customers customers = (Customers) jaxbUnmarshaller.unmarshal(xmlFile);

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		// Customer list
		List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();
		List<ComplexTypeCustomer> customerList = customers.getCustomer();

		for (ComplexTypeCustomer customer : customerList) {

			CustomerDTO customerDTO = new CustomerDTO();
			customerDTO.setLogin(customer.getCredentials().getLogin());
			customerDTO.setEmail(customer.getProfile().getEmail());
			customerDTO.setCustomerNumber(customer.getCustomerNo());
			customerDTO.setFirstName(customer.getProfile().getFirstName());
			customerDTO.setLastName(customer.getProfile().getLastName());

			if (customer.getProfile().getCustomAttributes() != null) {
				List<SharedTypeCustomAttribute> customAttributes = customer.getProfile()
						.getCustomAttributes().getCustomAttribute();
				for (SharedTypeCustomAttribute customAttribute : customAttributes) {
					if (customAttribute.getAttributeId().equalsIgnoreCase("gigyaUID")) {
						customerDTO.setGigyaUId(customAttribute.getContent().get(0).toString());
					}
					if (customAttribute.getAttributeId().equalsIgnoreCase("Zip")) {
						customerDTO.setZip(customAttribute.getContent().get(0).toString());
					}
				}
			}
			customerDTOList.add(customerDTO);
		}
		System.out.println("Inserting into DB...");
		customerDAO.insertBatch(customerDTOList);
	}

}
