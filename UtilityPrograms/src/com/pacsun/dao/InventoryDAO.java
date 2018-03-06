package com.pacsun.dao;

import java.util.List;

import com.pacsun.dto.InventoryDTO;

public interface InventoryDAO {

	public void insertBatch(final List<InventoryDTO> inventories);

}
