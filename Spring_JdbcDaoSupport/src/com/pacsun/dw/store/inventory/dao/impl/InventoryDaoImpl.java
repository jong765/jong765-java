package com.pacsun.dw.store.inventory.dao.impl;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.pacsun.dw.store.inventory.dao.InventoryDao;
import com.pacsun.dw.store.inventory.dto.InventoryDto;
import com.pacsun.dw.store.inventory.dto.ProductDto;
import com.pacsun.util.DateFormatterUtil;

public class InventoryDaoImpl extends JdbcDaoSupport implements InventoryDao {

	@Value("${as400.inventory.file}")
	private String INVENTORY_FILE;

	@SuppressWarnings("rawtypes")
	@Override
	public List<InventoryDto> findAll() {
		String sql = "SELECT MSKU FROM " + INVENTORY_FILE;

		List<InventoryDto> inventoryList = new ArrayList<InventoryDto>();

		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map row : rows) {
			InventoryDto inventoryDto = new InventoryDto();
			inventoryDto.setSku((BigDecimal) (row.get("MSKU"))); // populate
																	// MSKU only
			inventoryList.add(inventoryDto);
		}

		return inventoryList;
	}

	@Override
	public List<InventoryDto> findByCVS(String cvs) {
		String sql = "SELECT * FROM " + INVENTORY_FILE + " WHERE MCVS = ?";

		RowMapper<InventoryDto> myRowMapper = new RowMapper<InventoryDto>() {

			public InventoryDto mapRow(ResultSet rs, int rowNum) throws SQLException {

				InventoryDto inventoryDto = new InventoryDto();

				inventoryDto.setSku(rs.getBigDecimal("MSKU"));
				inventoryDto.setQuantity(rs.getInt("MQTY"));
				inventoryDto.setClassVendorStyle(rs.getString("MCVS"));

				return inventoryDto;
			}
		};

		List<InventoryDto> inventoryDtoList = getJdbcTemplate().query(sql, myRowMapper, cvs);

		return inventoryDtoList;
	}

	public InventoryDto getInventoryBySKU(int sku) {
		String sql = "SELECT * FROM " + INVENTORY_FILE + " WHERE MSKU = ?";

		RowMapper<InventoryDto> myRowMapper = new RowMapper<InventoryDto>() {

			public InventoryDto mapRow(ResultSet rs, int rowNum) throws SQLException {

				InventoryDto inventoryDto = new InventoryDto();

				inventoryDto.setSku(rs.getBigDecimal("MSKU"));
				inventoryDto.setQuantity(rs.getInt("MQTY"));
				inventoryDto.setClassVendorStyle(rs.getString("MCVS"));

				return inventoryDto;
			}
		};

		InventoryDto inventoryDto = getJdbcTemplate().queryForObject(sql, myRowMapper, sku);

		return inventoryDto;
	}

	public void batchInsert(final List<ProductDto> productDtoList) {
		String sql = "INSERT INTO JKIM.JKFileA (ProcessFlag, ProductId, Description, UnitPrice) "
				+ "Values(?, ?, ?, ?) WITH NC";

		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ProductDto productDto = productDtoList.get(i);
				ps.setString(1, "U");
				ps.setInt(2, productDto.getProductId());
				ps.setString(3, productDto.getDescription());
				ps.setBigDecimal(4, productDto.getUnitPrice());
			}

			@Override
			public int getBatchSize() {
				return productDtoList.size();
			}

		});
	}

	public void batchUpdate(final List<ProductDto> productDtoList) {
		String sql = "UPDATE JKIM.JKFileA SET ProcessFlag = ?, ProcessDate = ? WHERE ProductId = ? WITH NC";

		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ProductDto productDto = productDtoList.get(i);
				ps.setString(1, "P");
				ps.setInt(2, Integer.parseInt(DateFormatterUtil.formatDate(new Date(), "yyyyMMdd")));
				ps.setInt(3, productDto.getProductId());
			}

			@Override
			public int getBatchSize() {
				return productDtoList.size();
			}

		});

	}
}
