package com.pacsun.cybersource.apitest;

import java.util.Properties;

import com.pacsun.cybersource.dto.CustomerProfileConverterDto;
import com.pacsun.cybersource.process.ConvertTransactionToCustomerProfileProcess;
import com.pacsun.util.PropertyLoader;

public class ConvertTransactionToCustomerProfileAPITest {

	public static void main(String[] args) throws Exception {
		String environment = args[0];
		System.out.println("API test in " + environment + " started.");

		new ConvertTransactionToCustomerProfileAPITest().run(environment);
		System.out.println("API test completed.");
	}

	private void run(String environment) throws Exception {
		String propertyFilePath = "Custom/" + environment + "/CybersourceTokenization/properties/cybs.properties";
		Properties cybsProps = PropertyLoader.load(propertyFilePath);

		propertyFilePath = "Custom/" + environment + "/CybersourceTokenization/properties/apitest.properties";
		Properties testProps = PropertyLoader.load(propertyFilePath);

		int merchantReferenceCode = Integer.parseInt(testProps.getProperty("apitest.merchantReferenceCode"));
		String authRequestId = testProps.getProperty("apitest.authRequestId");
		CustomerProfileConverterDto converterDto = new CustomerProfileConverterDto(merchantReferenceCode, authRequestId);

		ConvertTransactionToCustomerProfileProcess process = new ConvertTransactionToCustomerProfileProcess();
		String token = process.callAPI(converterDto, cybsProps);
		System.out.println("token=" + token);
	}
}
