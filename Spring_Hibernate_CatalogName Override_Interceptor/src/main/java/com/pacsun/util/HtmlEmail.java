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

import com.pacsun.locate.constants.EmailConstants;

public class HtmlEmail implements EmailConstants {

	private String smtpHost;
	private String mailSmtpAuth;
	private String smtpUser;
	private String smtpPassword;
	private String emailSubject;
	private InternetAddress[] addressTo;
	private String content;

	public HtmlEmail(Properties properties, String emailContent) {
		this.setSmtpHost(properties.getProperty(SMTP_HOST));
		this.setMailSmtpAuth(properties.getProperty(MAIL_SMTP_AUTH));
		this.setSmtpUser(properties.getProperty(SMTP_USER));
		this.setSmtpPassword(properties.getProperty(SMTP_PASSWORD));
		this.setEmailSubject(properties.getProperty(EMAIL_SUBJECT));
		this.setAddressTo(properties.getProperty(EMAIL_RECIPIENTS));
		this.content = emailContent;
	}

	public void sendEmail() {

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
			System.out.println("Email sent....");
		} catch (MessagingException ex) {
			ex.printStackTrace();
		}
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

	public String getSmtpHost() {
		return smtpHost;
	}

	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	public String getMailSmtpAuth() {
		return mailSmtpAuth;
	}

	public void setMailSmtpAuth(String mailSmtpAuth) {
		this.mailSmtpAuth = mailSmtpAuth;
	}

	public String getSmtpUser() {
		return smtpUser;
	}

	public void setSmtpUser(String smtpUser) {
		this.smtpUser = smtpUser;
	}

	public String getSmtpPassword() {
		return smtpPassword;
	}

	public void setSmtpPassword(String smtpPassword) {
		this.smtpPassword = smtpPassword;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

}