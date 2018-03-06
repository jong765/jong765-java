package com.pacsun.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pacsun.dao.InventoryDAO;
import com.pacsun.dto.InventoryDTO;

public class InventoryDAOImpl implements InventoryDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insertBatch(final List<InventoryDTO> inventories) {

		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO JKIM.JKStgInventory " + "(ProductId, Quantity, AllocationDate) "
				+ "VALUES (?, ?, ?)";

		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			public void setValues(PreparedStatement ps, int i) throws SQLException {
				InventoryDTO inventory = inventories.get(i);
				ps.setString(1, inventory.getProductId());
				ps.setInt(2, inventory.getQuantity());
				ps.setDate(3, inventory.getAllocationDate());
			}

			public int getBatchSize() {
				return inventories.size();
			}
		});
	}

}
