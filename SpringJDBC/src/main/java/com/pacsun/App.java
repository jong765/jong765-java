package com.pacsun;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.dao.EmployeeDAO;
import com.pacsun.dao.JDBCEmployeeDAO;
import com.pacsun.dto.EmployeeDTO;

public class App {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");

		EmployeeDTO employee1 = new EmployeeDTO(123, "javacodegeeks", 30);
		employeeDAO.insert(employee1);
		EmployeeDTO employee2 = employeeDAO.findById(123);
		System.out.println(employee2);

		JDBCEmployeeDAO jdbcEmployeeDAO = (JDBCEmployeeDAO) context
				.getBean("jdbcEmployeeDAO");

		EmployeeDTO employee3 = new EmployeeDTO(456, "javacodegeeks", 34);
		jdbcEmployeeDAO.insert(employee3);

		EmployeeDTO employee4 = jdbcEmployeeDAO.findById(456);
		System.out.println(employee4);

		List<EmployeeDTO> employees = jdbcEmployeeDAO.findAll();
		System.out.println(employees);

		String name = jdbcEmployeeDAO.findNameById(456);
		System.out.println(name);

		EmployeeDTO emplNew1 = new EmployeeDTO(23, "John", 23);
		EmployeeDTO emplNew2 = new EmployeeDTO(223, "Mark", 43);
		List<EmployeeDTO> employeeList = new ArrayList();
		employeeList.add(emplNew1);
		employeeList.add(emplNew2);
		jdbcEmployeeDAO.insertBatch1(employeeList);
		System.out.println(" inserted rows: " + employeeList);

		System.out.println(" FindAll : " + jdbcEmployeeDAO.findAll());
		jdbcEmployeeDAO.insertBatch2("UPDATE EMPLOYEE SET NAME ='Mary'");

		List<EmployeeDTO> employeeList2 = jdbcEmployeeDAO.findAll();
		System.out.println("Updated column name of table: " + employeeList2);

		System.out.println(" FindAll : " + jdbcEmployeeDAO.findAll());
		context.close();
	}
}
