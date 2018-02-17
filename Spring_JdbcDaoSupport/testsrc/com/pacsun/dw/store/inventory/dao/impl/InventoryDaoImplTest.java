package com.pacsun.dw.store.inventory.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pacsun.dw.store.inventory.dao.InventoryDao;
import com.pacsun.dw.store.inventory.dto.InventoryDto;
import com.pacsun.dw.store.inventory.dto.ProductDto;

@ContextConfiguration({ "classpath:applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class InventoryDaoImplTest {

	@Autowired
	private InventoryDao inventoryDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void findAll() {
		List<InventoryDto> inventoryList = inventoryDao.findAll();
		System.out.println(inventoryList);
	}

	@Test
	public void getInventoryBySKU() {
		InventoryDto inventoryDto = inventoryDao.getInventoryBySKU(2319135);
		System.out.println(inventoryDto);
	}

	@Test
	public void findByCVS() {
		List<InventoryDto> inventoryList = inventoryDao.findByCVS("0097000250009");
		System.out.println(inventoryList);
	}

	@Test
	public void batchInsert() {
		List<ProductDto> productDtoList = new ArrayList<ProductDto>();
		ProductDto productDto = new ProductDto();
		productDto.setProductId(1000);
		productDto.setDescription("Product 1000");
		productDto.setUnitPrice(new BigDecimal(10.00));
		productDtoList.add(productDto);

		productDto = new ProductDto();
		productDto.setProductId(2000);
		productDto.setDescription("Product 2000");
		productDto.setUnitPrice(new BigDecimal(20.00));
		productDtoList.add(productDto);

		inventoryDao.batchInsert(productDtoList);
	}

	@Test
	public void batchUpdate() {
		List<ProductDto> productDtoList = new ArrayList<ProductDto>();
		ProductDto productDto = new ProductDto();
		productDto.setProductId(1000);
		productDtoList.add(productDto);

		productDto = new ProductDto();
		productDto.setProductId(2000);
		productDtoList.add(productDto);

		inventoryDao.batchUpdate(productDtoList);
	}
}
