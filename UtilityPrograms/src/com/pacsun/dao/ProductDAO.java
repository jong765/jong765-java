package com.pacsun.dao;

import java.util.List;

import com.pacsun.dto.ProductDTO;

public interface ProductDAO {

	public void insert(ProductDTO product);

	public ProductDTO findById(String productId);

	public List<ProductDTO> findAll();

	public String findDisplayNameById(String productId);

	public void insertBatch1(final List<ProductDTO> products);

	public void insertBatch2(final String sql);
}
