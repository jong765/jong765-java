package com.pacsun.util;

import java.util.Properties;
import java.util.StringTokenizer;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HtmlEmail {

	private InternetAddress[] addressTo;
	private String content;

	@Value("${mail.smtp.host}")
	private String MAIL_SMTP_HOST;

	@Value("${mail.smtp.auth}")
	private String MAIL_SMTP_AUTH;

	@Value("${mail.smtp.user}")
	private String MAIL_SMTP_USER;

	@Value("${mail.smtp.password}")
	private String MAIL_SMTP_PASSWORD;

	@Value("${email.subject}")
	private String EMAIL_SUBJECT;

	@Value("${email.recipients}")
	private String EMAIL_RECIPIENTS;

	public void sendEmail() throws AddressException, MessagingException {

		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", MAIL_SMTP_HOST);
		properties.put("mail.smtp.auth", MAIL_SMTP_AUTH);
		this.setAddressTo(EMAIL_RECIPIENTS);

		Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(MAIL_SMTP_USER, MAIL_SMTP_PASSWORD);
			}
		});

		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(MAIL_SMTP_USER));
		this.setAddressTo(EMAIL_RECIPIENTS);
		message.addRecipients(Message.RecipientType.TO, addressTo);

		message.setSubject(EMAIL_SUBJECT);
		message.setContent(this.getContent(), "text/html");

		Transport.send(message);

	}

	public void setAddressTo(String emailRecipients) {
		StringTokenizer st = new StringTokenizer(emailRecipients, ",");
		this.addressTo = new InternetAddress[st.countTokens()];
		int i = 0;

		try {
			while (st.hasMoreElements()) {
				this.addressTo[i++] = new InternetAddress((String) st.nextElement());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEMAIL_SUBJECT() {
		return EMAIL_SUBJECT;
	}

	public void setEMAIL_SUBJECT(String eMAIL_SUBJECT) {
		EMAIL_SUBJECT = eMAIL_SUBJECT;
	}

	public String getEMAIL_RECIPIENTS() {
		return EMAIL_RECIPIENTS;
	}

	public void setEMAIL_RECIPIENTS(String eMAIL_RECIPIENTS) {
		EMAIL_RECIPIENTS = eMAIL_RECIPIENTS;
	}

	public InternetAddress[] getAddressTo() {
		return addressTo;
	}

	public void setAddressTo(InternetAddress[] addressTo) {
		this.addressTo = addressTo;
	}

}