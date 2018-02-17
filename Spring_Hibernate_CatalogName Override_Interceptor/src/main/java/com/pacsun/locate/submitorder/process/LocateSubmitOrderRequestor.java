package com.pacsun.locate.submitorder.process;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.util.StackTrace;

public class LocateSubmitOrderRequestor {

	private static String errorMessage;

	private static final Logger log = Logger.getLogger(LocateSubmitOrderRequestor.class);

	public static void main(String[] args) throws Exception {
		try {
			new LocateSubmitOrderRequestor().run();
		} catch (Exception e) {
			throw new Exception(e);
		}
		log.info("Locate Submit Order Process has completed successfully.");
		System.exit(0);
	}

	public void run() throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hsqlApplicationContext.xml");

		try {
			LocateSubmitOrderProcess process = (LocateSubmitOrderProcess) context.getBean("locateSubmitOrderProcess");
			process.run();
		} catch (Exception e) {
			errorMessage = this.getClass().getName() + " : " + "Error in Locate Submit Order requestor.\n"
					+ StackTrace.getStackTrace(e);
			log.error(errorMessage);
			throw new Exception(errorMessage);
		} finally {
			context.close();
		}

	}

}
