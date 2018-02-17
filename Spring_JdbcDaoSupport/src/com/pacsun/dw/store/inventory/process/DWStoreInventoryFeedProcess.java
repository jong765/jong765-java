package com.pacsun.dw.store.inventory.process;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.pacsun.dw.store.inventory.dao.InventoryDao;
import com.pacsun.dw.store.inventory.dto.InventoryDto;
import com.pacsun.dw.store.inventory.jaxb.ComplexTypeHeader;
import com.pacsun.dw.store.inventory.jaxb.ComplexTypeInventoryList;
import com.pacsun.dw.store.inventory.jaxb.ComplexTypeInventoryRecord;
import com.pacsun.dw.store.inventory.jaxb.ComplexTypeInventoryRecords;
import com.pacsun.dw.store.inventory.jaxb.Inventory;
import com.pacsun.dw.store.inventory.jaxb.ObjectFactory;
import com.pacsun.dw.store.inventory.jaxb.SimpleTypeInventoryRecordPreorderBackorderHandling;
import com.pacsun.util.JAXBMarshallerUtil;
import com.pacsun.util.SftpUtil;

public class DWStoreInventoryFeedProcess {

	@Autowired
	private InventoryDao inventoryDao;

	@Autowired
	private ObjectFactory objectFactory;

	@Value("${landing.inventory.feed.file.name}")
	private String LANDING_INVENTORY_FEED_FILE_NAME;

	@Value("${history.inventory.feed.file.name}")
	private String HISTORY_INVENTORY_FEED_FILE_NAME;

	@Value("${sftp.host}")
	private String SFTP_HOST;

	@Value("${sftp.user}")
	private String SFTP_USER;

	@Value("${sftp.password}")
	private String SFTP_PASSWORD;

	@Value("${sftp.dir}")
	private String SFTP_DIR;

	private static final Logger log = Logger.getLogger(DWStoreInventoryFeedProcess.class);

	public void run() throws Exception {

		log.info("DW Store Inventory Feed process has started.");

		Inventory inventory = objectFactory.createInventory();
		ComplexTypeInventoryList inventoryList = objectFactory.createComplexTypeInventoryList();

		ComplexTypeHeader header = this.getHeader();
		ComplexTypeInventoryRecords records = objectFactory.createComplexTypeInventoryRecords();
		List<InventoryDto> inventoryDtoList = inventoryDao.findAll();

		for (InventoryDto inventoryDto : inventoryDtoList) {
			ComplexTypeInventoryRecord record = objectFactory.createComplexTypeInventoryRecord();
			record.setProductId(String.valueOf(inventoryDto.getSku()));
			record.setAllocation(BigDecimal.valueOf(99999));
			record.setPerpetual(false);
			record.setPreorderBackorderHandling(SimpleTypeInventoryRecordPreorderBackorderHandling.NONE);
			records.getRecord().add(record);
		}

		inventoryList.setHeader(header);
		inventoryList.setRecords(records);

		inventory.getInventoryList().add(inventoryList);
		String xmlString = JAXBMarshallerUtil.getXMLString(Inventory.class, inventory).replace("xmlns:ns2", "xmlns");

		File landingFile = new File(LANDING_INVENTORY_FEED_FILE_NAME);
		File historyFile = new File(HISTORY_INVENTORY_FEED_FILE_NAME);
		FileUtils.writeStringToFile(landingFile, xmlString, false);
		// this.sendSftpFile(landingFile);
		archiveFile(landingFile, historyFile);

	}

	public ComplexTypeHeader getHeader() {
		ComplexTypeHeader header = objectFactory.createComplexTypeHeader();
		header.setListId("storeInventory");
		header.setDescription("Pacsun Store Inventory");
		return header;
	}

	public void archiveFile(File fromFile, File toFile) throws IOException {
		FileUtils.forceDelete(toFile);
		FileUtils.moveFile(fromFile, toFile);
	}

	public void sendSftpFile(File file) throws Exception {
		SftpUtil sftpUtil = new SftpUtil();
		sftpUtil.setSftpHost(SFTP_HOST);
		sftpUtil.setSftpUser(SFTP_USER);
		sftpUtil.setSftpPassword(SFTP_PASSWORD);
		sftpUtil.setSftpDir(SFTP_DIR);
		sftpUtil.sendFile(file);
		Thread.sleep(1000);
	}
}
