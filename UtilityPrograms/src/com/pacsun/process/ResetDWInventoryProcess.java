package com.pacsun.process;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.JAXBException;

import com.pacsun.inventory.jaxb.ComplexTypeInventoryRecord;
import com.pacsun.inventory.jaxb.Inventory;
import com.pacsun.util.FileUtils;
import com.pacsun.util.JAXBMarshallerUtil;
import com.pacsun.util.JAXBUnmarshallerUtil;

public class ResetDWInventoryProcess {

	public void run() throws JAXBException, IOException {

		String xmlFileName = "Custom/QUA/xml/LoadTestInventory09092015.xml";
		String newXmlFileName = "Custom/QUA/xml/LoadTestInventory09092015.xml";

		// Read inventory file
		JAXBUnmarshallerUtil unMarshallerUtil = new JAXBUnmarshallerUtil();
		Inventory inventory = (Inventory) unMarshallerUtil.getJAXBObject(Inventory.class,
				new FileInputStream(xmlFileName));

		List<ComplexTypeInventoryRecord> inventoryRecordList = inventory.getInventoryList().get(0)
				.getRecords().getRecord();
		for (ComplexTypeInventoryRecord inventoryRecord : inventoryRecordList) {
			inventoryRecord.setAllocation(new BigDecimal("10000"));
		}

		// Write new inventory file
		JAXBMarshallerUtil marshallerUtil = new JAXBMarshallerUtil();
		String xmlString = marshallerUtil.getXMLString(Inventory.class, inventory);
		FileUtils.writeFile(newXmlFileName, xmlString, true);

		System.out.println("Successful!");
	}
}
