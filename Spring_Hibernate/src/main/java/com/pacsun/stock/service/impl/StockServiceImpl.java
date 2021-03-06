package com.pacsun.stock.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacsun.stock.dao.StockDao;
import com.pacsun.stock.model.Stock;
import com.pacsun.stock.service.StockService;

@Service("stockService")
public class StockServiceImpl implements StockService{
	
	@Autowired
	StockDao stockDao;
	
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

	public void save(Stock stock){
		stockDao.save(stock);
	}
	
	public void update(Stock stock){
		stockDao.update(stock);
	}
	
	public void delete(Stock stock){
		stockDao.delete(stock);
	}
	
	public Stock findByStockCode(String stockCode){
		return stockDao.findByStockCode(stockCode);
	}
}
