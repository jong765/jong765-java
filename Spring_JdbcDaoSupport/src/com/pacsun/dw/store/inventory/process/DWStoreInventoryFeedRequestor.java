package com.pacsun.dw.store.inventory.process;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.util.StackTrace;

public class DWStoreInventoryFeedRequestor {

	private static String errorMessage;

	private static final Logger log = Logger.getLogger(DWStoreInventoryFeedRequestor.class);

	public static void main(String[] args) throws Exception {
		try {
			new DWStoreInventoryFeedRequestor().run();
		} catch (Exception e) {
			throw new Exception(e);
		}
		log.info("DW Store Inventory Feed Process has completed successfully.");
		System.exit(0);
	}

	public void run() throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hsqlApplicationContext.xml");

		try {

			DWStoreInventoryFeedProcess process = (DWStoreInventoryFeedProcess) context
					.getBean("dwStoreInventoryFeedProcess");
			process.run();
		} catch (Exception e) {
			errorMessage = this.getClass().getName() + " : " + "Error in DW Store Inventory Feed requestor.\n"
					+ StackTrace.getStackTrace(e);
			log.error(errorMessage);
			throw new Exception(errorMessage);
		} finally {
			context.close();
		}

	}

}
