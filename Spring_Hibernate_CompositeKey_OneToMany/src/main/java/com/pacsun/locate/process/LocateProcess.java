package com.pacsun.locate.process;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.pacsun.util.HtmlEmail;

public class LocateProcess {

	@Autowired
	protected HtmlEmail htmlEmail;

	@Value("${locate.request.message.header.destination}")
	protected String LOCATE_REQUEST_MESSAGE_HEADER_DESTINATION;

	@Value("${locate.request.message.header.message.type}")
	protected String LOCATE_REQUEST_MESSAGE_HEADER_MESSAGE_TYPE;

	@Value("${locate.request.message.header.xaction.type}")
	protected String LOCATE_REQUEST_MESSAGE_HEADER_XACTION_TYPE;

	@Value("${locate.request.message.header.xaction.response}")
	protected String LOCATE_REQUEST_MESSAGE_HEADER_XACTION_RESPONSE;

	@Value("${locate.request.message.header.locate.version}")
	protected String LOCATE_REQUEST_MESSAGE_HEADER_LOCATE_VERSION;

	@Value("${locate.request.message.header.source}")
	protected String LOCATE_REQUEST_MESSAGE_HEADER_SOURCE;

	public void sendEmailNotification() throws AddressException, MessagingException {
		htmlEmail.sendEmail();
	}

}
