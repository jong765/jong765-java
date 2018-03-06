package com.pacsun.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import com.pacsun.dao.ProductVariantDAO;
import com.pacsun.dto.ProductVariantDTO;

public class ProductVariantDAOImpl implements ProductVariantDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insertBatch(final List<ProductVariantDTO> productVariants) {

		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO JKIM.JKProductVariant "
				+ "(ProductId, VariantProductId) " + "VALUES (?, ?)";

		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				ProductVariantDTO productVariant = productVariants.get(i);
				ps.setString(1, productVariant.getProductId());
				ps.setString(2, productVariant.getVariantProductId());
			}

			public int getBatchSize() {
				return productVariants.size();
			}
		});
	}

}
