package com.pacsun.dao;

import java.util.List;

import com.pacsun.dto.EmployeeDTO;

public interface JDBCEmployeeDAO {

	public void insert(EmployeeDTO employee);
	public EmployeeDTO findById(int id);
	public List<EmployeeDTO> findAll();
	public String findNameById(int id);
	public void insertBatch1(final List<EmployeeDTO> employees);
	public void insertBatch2(final String sql);
}
