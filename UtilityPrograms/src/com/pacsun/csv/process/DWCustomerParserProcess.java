package com.pacsun.csv.process;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.pacsun.dao.CustomerDAO;
import com.pacsun.dto.CustomerDTO;

public class DWCustomerParserProcess {

	private String csvFileName;
	private CustomerDAO customerDAO;

	public void run() {
		BufferedReader br = null;
		String line = "";
		List<CustomerDTO> customerDtoList = new ArrayList<CustomerDTO>();
		int counter = 0;

		try {

			br = new BufferedReader(new FileReader(this.csvFileName));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				line = line.replaceAll("\"", "");
				String[] field = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				CustomerDTO customerDTO = new CustomerDTO();
				customerDTO.setUuid(field[0]);
				customerDTO.setLogin(field[1]);
				customerDTO.setCustomerNumber(field[2]);
				customerDTO.setFirstName(field[3]);
				customerDTO.setLastName(field[4]);
				customerDTO.setEmail(field[5]);
				customerDTO.setZip(field[6]);
				customerDTO.setGigyaUId(field[7]);
				customerDtoList.add(customerDTO);
				counter++;

				if (counter >= 10000) {
					customerDAO.insertBatch(customerDtoList);
					customerDtoList = new ArrayList<CustomerDTO>();
					counter = 0;
				}
			}
			if (counter > 0)
				customerDAO.insertBatch(customerDtoList);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public String getCsvFileName() {
		return csvFileName;
	}

	public void setCsvFileName(String csvFileName) {
		this.csvFileName = csvFileName;
	}

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

}
