package com.pacsun.sax.dw.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

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

	public void insertBatch(final List<CustomerDTO> customers) {

		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO JKIM2.JKCustomer "
				+ "(CUSTOMERNO, UUID, Login, FirstName, LastName, Email, Zip, GigyaUId, CreationDate, GigyaToDemandwareConversion, NeedsGigyaResetPassword) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) WITH NC";

		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			public void setValues(PreparedStatement ps, int i) {
				CustomerDTO customer = customers.get(i);
				try {
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
				} catch (SQLException e) {
					System.out.println("ERROR: FirstName=" + customer.getFirstName().trim());
					e.printStackTrace();
				}

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

	@Override
	public List<CustomerDTO> findAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
