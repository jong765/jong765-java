package com.pacsun.sax.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.pacsun.sax.br.dto.ProductDTO;

public class ProductDAOImpl extends JdbcDaoSupport implements ProductDAO {
	private DataSource dataSource;

	public void insert(ProductDTO productDTO) {

		String sql = "INSERT INTO JKIM2.JKProduct3 "
				+ "(ProductId, ProductType, MasterProductId) VALUES (?, ?, ?) WITH NC";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, productDTO.getProductId());
			ps.setString(2, productDTO.getProductType());
			ps.setString(3, productDTO.getMasterProductId());
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

		String sql = "INSERT INTO JKIM2.JKProduct3 "
				+ "(ProductId, ProductType, MasterProductId) VALUES (?, ?, ?) WITH NC";

		List<Object[]> parameters = new ArrayList<Object[]>();
		for (ProductDTO productDTO : productDTOList) {
			String productId = productDTO.getProductId() == null ? null
					: productDTO.getProductId().trim();
			String productType = productDTO.getProductType() == null ? null
					: productDTO.getProductType().trim();
			String masterProductId = productDTO.getMasterProductId() == null ? null
					: productDTO.getMasterProductId().trim();
			parameters.add(new Object[] { productId, productType, masterProductId });
		}
		getJdbcTemplate().batchUpdate(sql, parameters);

	}

}