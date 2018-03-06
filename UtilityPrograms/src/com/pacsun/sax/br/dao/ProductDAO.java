package com.pacsun.sax.br.dao;

import java.util.List;

import com.pacsun.sax.br.dto.ProductDTO;


public interface ProductDAO {

		public void insert(ProductDTO productDTO);
		
		public void insertBatch(List<ProductDTO> productDTO);

}
