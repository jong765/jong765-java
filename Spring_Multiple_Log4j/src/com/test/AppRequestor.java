package com.test;

import java.io.FileNotFoundException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

public class AppRequestor {

	public static void main(String[] args) throws FileNotFoundException {

		// Nothing needs to be configured for log4j in applicationContext.xml
		// file
		Log4jConfigurer.initLogging("classpath:opOrderStatusUpdate_log4j.properties", 60000);
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

	}

}
