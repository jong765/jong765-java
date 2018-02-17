package com.pacsun.stock.service;

import com.pacsun.stock.model.Stock;

public interface StockService {

	void save(Stock stock);

	void update(Stock stock);

	void delete(Stock stock);

	Stock findByStockCode(String stockCode);

}
