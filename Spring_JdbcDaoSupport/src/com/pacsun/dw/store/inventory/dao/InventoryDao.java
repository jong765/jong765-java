package com.pacsun.dw.store.inventory.dao;

import java.util.List;

import com.pacsun.dw.store.inventory.dto.InventoryDto;
import com.pacsun.dw.store.inventory.dto.ProductDto;

public interface InventoryDao {

	public List<InventoryDto> findAll();

	public List<InventoryDto> findByCVS(String cvs);

	public InventoryDto getInventoryBySKU(int sku);

	public void batchInsert(final List<ProductDto> productDtoList);

	public void batchUpdate(final List<ProductDto> productDtoList);

}
