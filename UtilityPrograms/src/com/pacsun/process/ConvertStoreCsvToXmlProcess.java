package com.pacsun.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pacsun.store.jaxb.ComplexTypeStore;
import com.pacsun.store.jaxb.ObjectFactory;
import com.pacsun.store.jaxb.Stores;
import com.pacsun.util.FileUtils;
import com.pacsun.util.JAXBMarshallerUtil;

public class ConvertStoreCsvToXmlProcess {

	static Logger log = LoggerFactory.getLogger(FileUtils.class);

	public void run(String inputFileName, String outputFileName) throws JAXBException {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(inputFileName));
			String line = null;
			ObjectFactory factory = new ObjectFactory();
			Stores stores = factory.createStores();
			List<ComplexTypeStore> storeList = new ArrayList<ComplexTypeStore>();

			while ((line = reader.readLine()) != null) {
				String[] stringArray = line.split(",");
				String storeNumber = StringUtils.leftPad(stringArray[0].trim(), 4, '0');
				String storeName = stringArray[1].trim();

				ComplexTypeStore store = factory.createComplexTypeStore();
				store.setStoreId(storeNumber);
				store.setName(storeName);
				storeList.add(store);
			}

			stores.getStore().addAll(storeList);
			createXmlFile(stores, outputFileName);
		} catch (IOException e) {
			log.error("File reader failed for file '" + inputFileName + "':\n ");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				log.error("File reader failed for file '" + inputFileName + "':\n ");
			}
		}

	}

	public void createXmlFile(Stores stores, String outputFileName) throws JAXBException {
		JAXBMarshallerUtil util = new JAXBMarshallerUtil();
		String xmlString = util.getXMLString(Stores.class, stores);

		FileUtils.writeFile(outputFileName, xmlString, true);

	}

}