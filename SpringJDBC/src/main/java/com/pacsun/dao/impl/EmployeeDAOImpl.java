package com.pacsun.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.pacsun.dao.EmployeeDAO;
import com.pacsun.dto.EmployeeDTO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(EmployeeDTO employee) {

		String sql = "INSERT INTO employee "
				+ "(ID, NAME, AGE) VALUES (?, ?, ?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setInt(3, employee.getAge());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public EmployeeDTO findById(int id) {

		String sql = "SELECT * FROM JKIM.JKOrderHeader WHERE orderId > ?";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			EmployeeDTO employee = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				employee = new EmployeeDTO(rs.getInt("ID"),
						rs.getString("NAME"), rs.getInt("AGE"));
			}
			rs.close();
			ps.close();
			return employee;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}
}