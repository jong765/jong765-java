package com.pacsun.dao;

import com.pacsun.dto.EmployeeDTO;

public interface EmployeeDAO {

		public void insert(EmployeeDTO employee);
		public EmployeeDTO findById(int id);
}
