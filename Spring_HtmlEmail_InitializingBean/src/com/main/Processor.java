package com.main;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.stereotype.Component;

import com.util.HtmlEmail;

@Component
public class Processor {

	@Resource
	private HtmlEmail htmlEmail;

	public void run() throws AddressException, MessagingException {
		String messageText = "There were some errors in shipping confirmation email.";
		htmlEmail.setContent(messageText);
		htmlEmail.sendEmail();
	}

}
