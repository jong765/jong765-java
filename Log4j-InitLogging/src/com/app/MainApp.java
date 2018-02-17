package com.app;

import java.io.FileNotFoundException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

public class MainApp {

	public static void main(String[] args) throws FileNotFoundException {
		Log4jConfigurer.initLogging("classpath:log4j.properties", 60000);
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

	}

}
