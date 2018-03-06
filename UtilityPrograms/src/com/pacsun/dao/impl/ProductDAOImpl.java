package com.pacsun.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pacsun.dao.ProductDAO;
import com.pacsun.dto.ProductDTO;

public class ProductDAOImpl implements ProductDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(ProductDTO product) {

		String sql = "INSERT INTO JKIM.JKProduct "
				+ "(ProductId, DisplayName, Division, Department, Brand, Color, Size, UPC) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate
				.update(sql,
						new Object[] { product.getProductId(),
								product.getDisplayName(),
								product.getDivision(), product.getDepartment(),
								product.getBrand(), product.getColor(),
								product.getSize(), product.getUpc() });
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ProductDTO findById(String productId) {

		String sql = "SELECT * FROM JKIM.JKProduct WHERE ProductId = ?";

		jdbcTemplate = new JdbcTemplate(dataSource);
		ProductDTO product = (ProductDTO) jdbcTemplate.queryForObject(sql,
				new Object[] { productId },
				new BeanPropertyRowMapper(ProductDTO.class));

		return product;
	}

	@SuppressWarnings("rawtypes")
	public List<ProductDTO> findAll() {

		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM JKIM.JKProduct";

		List<ProductDTO> products = new ArrayList<ProductDTO>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			ProductDTO product = new ProductDTO();
			product.setProductId(String.valueOf(row.get("ProductId")));
			product.setDisplayName(String.valueOf(row.get("DisplayName")));
			product.setDivision(String.valueOf(row.get("Division")));
			product.setDepartment(String.valueOf(row.get("Department")));
			product.setBrand(String.valueOf(row.get("Brand")));
			product.setColor(String.valueOf(row.get("Color")));
			product.setSize(String.valueOf(row.get("Size")));
			product.setUpc(String.valueOf(row.get("UPC")));
		}

		return products;
	}

	public String findDisplayNameById(String productId) {

		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT DisplayName FROM JKIM.JKProduct WHERE ProductId = ?";

		String displayName = (String) jdbcTemplate.queryForObject(sql,
				new Object[] { productId }, String.class);

		return displayName;
	}

	public void insertBatchSQL(final String sql) {

		jdbcTemplate.batchUpdate(new String[] { sql });

	}

	public void insertBatch1(final List<ProductDTO> products) {

		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO JKIM.JKProduct "
				+ "(ProductId, DisplayName, Division, Department, Brand, Color, Size, UPC) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				ProductDTO product = products.get(i);
				ps.setString(1, product.getProductId());
				ps.setString(2, product.getDisplayName());
				ps.setString(3, product.getDivision());
				ps.setString(4, product.getDepartment());
				ps.setString(5, product.getBrand());
				ps.setString(6, product.getColor());
				ps.setString(7, product.getSize());
				ps.setString(8, product.getUpc());
			}

			public int getBatchSize() {
				return products.size();
			}
		});
	}

	public void insertBatch2(final String sql) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.batchUpdate(new String[] { sql });

	}

}
