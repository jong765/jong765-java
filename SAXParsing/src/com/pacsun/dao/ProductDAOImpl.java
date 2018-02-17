package com.pacsun.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.pacsun.dto.ProductDTO;


public class ProductDAOImpl implements ProductDAO {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(ProductDTO productDTO) {

		String sql = "INSERT INTO JKIM2.JKProduct "
				+ "(ProductId, Brand, Department) VALUES (?, ?, ?) WITH NC";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, productDTO.getProductId());
			ps.setString(2, productDTO.getBrand());
			ps.setString(3, productDTO.getDepartment());
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

}