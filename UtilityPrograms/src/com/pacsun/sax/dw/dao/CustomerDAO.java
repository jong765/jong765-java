package com.pacsun.sax.dw.dao;

import java.util.List;

import com.pacsun.dto.CustomerDTO;

public interface CustomerDAO {

	public void insertBatch(final List<CustomerDTO> customers);

}
