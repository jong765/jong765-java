package com.pacsun.locate.process;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pacsun.util.HtmlEmail;

@ContextConfiguration({ "classpath:applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class LocateSubmitOrderProcessTest {

	@Autowired
	private HtmlEmail htmlEmail;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void sendEmailNotification() throws AddressException, MessagingException {
		String content = "Some of Submit Order API processes have failed. Please review job log in /LocateOrder/Custom/QUA/Locate/logs/ps_locate.log.";
		htmlEmail.setContent(content);
		htmlEmail.sendEmail();
	}

}
