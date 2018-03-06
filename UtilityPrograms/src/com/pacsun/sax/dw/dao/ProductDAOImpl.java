package com.pacsun.sax.dw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.pacsun.sax.dto.ProductDTO;

public class ProductDAOImpl extends JdbcDaoSupport implements ProductDAO {
	private DataSource dataSource;

	public void insert(ProductDTO productDTO) {

		String sql = "INSERT INTO JKIM2.JKProduct "
				+ "(ProductId, Brand, Department, OnlineFlagTablet, OnlineFlagPacsun) VALUES (?, ?, ?, ?, ?) WITH NC";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, productDTO.getProductId());
			ps.setString(2, productDTO.getBrand());
			ps.setString(3, productDTO.getDepartment());
			ps.setString(4, productDTO.getOnlineFlagTablet());
			ps.setString(5, productDTO.getOnlineFlagPacsun());
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

	public void insertBatch(final List<ProductDTO> productDTOList) {

		String sql = "INSERT INTO JKIM2.JKProduct "
				+ "(ProductId, Brand, Department, OnlineFlagTablet, OnlineFlagPacsun) VALUES (?, ?, ?, ?, ?) WITH NC";

		List<Object[]> parameters = new ArrayList<Object[]>();
		for (ProductDTO productDTO : productDTOList) {
			String productId = productDTO.getProductId() == null ? null
					: productDTO.getProductId().trim();
			String brand = productDTO.getBrand() == null ? null : productDTO
					.getBrand().trim();
			String department = productDTO.getDepartment() == null ? null
					: productDTO.getDepartment().trim();
			String onlineFlagTablet = productDTO.getOnlineFlagTablet() == null ? null : productDTO
					.getOnlineFlagTablet().trim();
			String onlineFlagPacsun = productDTO.getOnlineFlagPacsun() == null ? null
					: productDTO.getOnlineFlagPacsun().trim();
			parameters.add(new Object[] { productId, brand, department, onlineFlagTablet, onlineFlagPacsun });
		}
		getJdbcTemplate().batchUpdate(sql, parameters);

	}

}