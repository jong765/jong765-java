package com.pacsun.process;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.util.StackTrace;

public class OrderProcessRequestor {

	private static String errorMessage;

	private static final Logger log = Logger.getLogger(OrderProcessRequestor.class);

	public static void main(String[] args) throws Exception {
		try {
			new OrderProcessRequestor().run();
		} catch (Exception e) {
			throw new Exception(e);
		}
		log.info("Order Process process has completed successfully.");
		System.exit(0);
	}

	public void run() throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		try {

			OrderProcessProcess process = (OrderProcessProcess) context
					.getBean("orderProcessProcess");
			process.run();
		} catch (Exception e) {
			errorMessage = this.getClass().getName() + " : "
					+ "Error in Order process requestor.\n" + StackTrace.getStackTrace(e);
			log.error(errorMessage);
			throw new Exception(errorMessage);
		} finally {
			context.close();
		}

	}

}
