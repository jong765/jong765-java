package com.pacsun.dao;

import java.util.List;

import com.pacsun.dto.CustomerDTO;

public interface CustomerDAO {

	public List<CustomerDTO> findAllCustomers();

	public void insertBatch(final List<CustomerDTO> customers);

}
