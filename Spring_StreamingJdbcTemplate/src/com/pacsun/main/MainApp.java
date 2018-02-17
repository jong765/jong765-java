package com.pacsun.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pacsun.process.TransactionProcess;


public class MainApp {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		TransactionProcess process = (TransactionProcess) context.getBean("transactionProcess");
		process.run();

	}

}
