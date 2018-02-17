package com.pacsun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.stock.model.Stock;
import com.pacsun.stock.service.StockService;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring/config/BeanLocations.xml");

		StockService stockService = (StockService) appContext
				.getBean("stockService");

		/** insert **/
		Stock stock = new Stock();
		stock.setStockCode("7668");
		stock.setStockName("HAIO");
		stockService.save(stock);

		/** select **/
		Stock stock2 = stockService.findByStockCode("7668");
		System.out.println(stock2);

		/** update **/
		stock2.setStockName("HAIO-1");
		stockService.update(stock2);

		/** delete **/
		// stockService.delete(stock2);

		System.out.println("Done");
	}
}
