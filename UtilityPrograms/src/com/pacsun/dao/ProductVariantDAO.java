package com.pacsun.dao;

import java.util.List;

import com.pacsun.dto.ProductVariantDTO;

public interface ProductVariantDAO {

	public void insertBatch(final List<ProductVariantDTO> productVariants);

}
