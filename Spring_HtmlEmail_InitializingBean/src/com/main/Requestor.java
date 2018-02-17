package com.main;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.SpringConfiguration;

public class Requestor {

	public static void main(String[] args) throws AddressException, MessagingException {

		ConfigurableApplicationContext appContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);

		Processor processor = (Processor) appContext.getBean("processor");
		processor.run();

		appContext.close();
	}

}
