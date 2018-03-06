package com.pacsun.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pacsun.dao.CustomerDAO;
import com.pacsun.dto.CustomerDTO;

public class CustomerDAOImpl implements CustomerDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<CustomerDTO> findAllCustomers() {

		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM JKIM2.JKCustomer";

		List<CustomerDTO> customers = new ArrayList<CustomerDTO>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			CustomerDTO customer = new CustomerDTO();
			customer.setCustomerNumber(String.valueOf(row.get("CUSTOMERNO")));
			customer.setEmail(String.valueOf(row.get("Email")));
			customer.setFirstName(String.valueOf(row.get("FirstName")));
			customer.setGigyaUId(String.valueOf(row.get("GigyaUId")));
			customer.setLastName(String.valueOf(row.get("LastName")));
			customer.setLogin(String.valueOf(row.get("Login")));
			customer.setUuid(String.valueOf(row.get("UUID")));
			customer.setZip(String.valueOf(row.get("Zip")));
			customers.add(customer);
		}

		return customers;
	}

	public void insertBatch(final List<CustomerDTO> customers) {

		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO JKIM2.JKCustomer "
				+ "(CUSTOMERNO, UUID, Login, FirstName, LastName, Email, Zip, GigyaUId, CreationDate, GigyaToDemandwareConversion, NeedsGigyaResetPassword) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) WITH NC";

		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			public void setValues(PreparedStatement ps, int i) throws SQLException {
				CustomerDTO customer = customers.get(i);
				ps.setString(1, truncateString(customer.getCustomerNumber(), 8));
				ps.setString(2, truncateString(customer.getUuid(), 50));
				ps.setString(3, truncateString(customer.getLogin(), 50));
				ps.setString(4, truncateString(customer.getFirstName(), 50));
				ps.setString(5, truncateString(customer.getLastName(), 50));
				ps.setString(6, truncateString(customer.getEmail(), 50));
				ps.setString(7, truncateString(customer.getZip(), 20));
				ps.setString(8, truncateString(customer.getGigyaUId(), 50));
				ps.setString(9, truncateString(customer.getCreationDate(), 20));
				ps.setString(10, truncateString(customer.getGigyaToDemandwareConversion(), 10));
				ps.setString(11, truncateString(customer.getNeedsGigyaResetPassword(), 10));
			}

			public int getBatchSize() {
				return customers.size();
			}
		});
	}

	private String truncateString(String value, int length) {
		String returnValue = null;

		if (value == null) {
			returnValue = "";
		} else {
			if (length < value.length())
				returnValue = value.substring(0, length);
			else
				returnValue = value;
		}
		return returnValue.trim();

	}

}
