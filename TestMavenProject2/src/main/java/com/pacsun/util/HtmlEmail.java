package com.pacsun.util;

import java.util.Properties;
import java.util.StringTokenizer;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

import com.pacsun.cybersource.constants.PacsunConstants;

public class HtmlEmail implements PacsunConstants {

	private String smtpHost;
	private String mailSmtpAuth;
	private String smtpUser;
	private String smtpPassword;
	private String emailSubject;
	private InternetAddress[] addressTo;
	private String content;

	String errorMessage;

	private static final Logger log = Logger.getLogger(HtmlEmail.class);

	public HtmlEmail(Properties properties, String emailSubject, String emailContent) throws Exception {
		this.setSmtpHost(properties.getProperty(SMTP_HOST));
		this.setMailSmtpAuth(properties.getProperty(MAIL_SMTP_AUTH));
		this.setSmtpUser(properties.getProperty(SMTP_USER));
		this.setSmtpPassword(properties.getProperty(SMTP_PASSWORD));
		this.setEmailSubject(emailSubject);
		this.setAddressTo(properties.getProperty(EMAIL_RECIPIENTS));
		this.content = emailContent;
	}

	public void sendEmail() throws Exception {

		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", smtpHost);
		properties.put("mail.smtp.auth", mailSmtpAuth);

		Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(smtpUser, smtpPassword);
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(smtpUser));
			message.addRecipients(Message.RecipientType.TO, addressTo);

			message.setSubject(emailSubject);
			message.setContent(this.getContent(), "text/html");

			Transport.send(message);
		} catch (MessagingException e) {
			throw new Exception(e);
		}
	}

	private void setAddressTo(String emailRecipients) throws Exception {
		StringTokenizer st = new StringTokenizer(emailRecipients, ",");
		this.addressTo = new InternetAddress[st.countTokens()];
		int i = 0;

		try {
			while (st.hasMoreElements()) {
				this.addressTo[i++] = new InternetAddress((String) st.nextElement());
			}
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	private String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private String getSmtpHost() {
		return smtpHost;
	}

	private void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	private String getMailSmtpAuth() {
		return mailSmtpAuth;
	}

	private void setMailSmtpAuth(String mailSmtpAuth) {
		this.mailSmtpAuth = mailSmtpAuth;
	}

	private String getSmtpUser() {
		return smtpUser;
	}

	private void setSmtpUser(String smtpUser) {
		this.smtpUser = smtpUser;
	}

	private String getSmtpPassword() {
		return smtpPassword;
	}

	private void setSmtpPassword(String smtpPassword) {
		this.smtpPassword = smtpPassword;
	}

	private String getEmailSubject() {
		return emailSubject;
	}

	private void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

}