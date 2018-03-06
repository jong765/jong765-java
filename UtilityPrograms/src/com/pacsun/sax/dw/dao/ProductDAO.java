package com.pacsun.sax.dw.dao;

import java.util.List;
import com.pacsun.sax.dto.ProductDTO;

public interface ProductDAO {

		public void insert(ProductDTO productDTO);
		
		public void insertBatch(List<ProductDTO> productDTO);

}
