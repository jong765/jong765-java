package com.pacsun.process;

import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.dao.InventoryDAO;
import com.pacsun.dto.InventoryDTO;
import com.pacsun.inventory.jaxb.ComplexTypeInventoryRecord;
import com.pacsun.inventory.jaxb.Inventory;

public class ParseDWInventoryXMLProcess {

	@SuppressWarnings("resource")
	public void run(String inventoryFileName) throws Exception {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"parseDWInventoryXMLApplicationContext.xml");

		InventoryDAO inventoryDAO = (InventoryDAO) context.getBean("inventoryDAO");

		JAXBContext jaxbContext = JAXBContext.newInstance(Inventory.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Inventory inventory = (Inventory) jaxbUnmarshaller.unmarshal(new File(inventoryFileName));

		// Inventory list
		List<InventoryDTO> inventories = new ArrayList<InventoryDTO>();
		List<ComplexTypeInventoryRecord> inventoryRecordList = inventory.getInventoryList().get(0)
				.getRecords().getRecord();

		for (ComplexTypeInventoryRecord inventoryRecord : inventoryRecordList) {
			try {
				InventoryDTO inventoryDTO = new InventoryDTO();
				inventoryDTO.setProductId(inventoryRecord.getProductId());
				if (inventoryRecord.getAllocation() != null) {
					inventoryDTO.setQuantity(inventoryRecord.getAllocation().intValue());
					inventoryDTO.setAllocationDate(new Date(inventoryRecord
							.getAllocationTimestamp().toGregorianCalendar().getTime().getTime()));
				}
				inventories.add(inventoryDTO);

			} catch (Exception e) {
				System.out.println("Error occurred for product Id: "
						+ inventoryRecord.getProductId());
				throw new Exception(e);
			}
		}

		inventoryDAO.insertBatch(inventories);
	}

}
