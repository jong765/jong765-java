package com.pacsun.process;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

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

import com.pacsun.util.ConvertInputStreamToString;
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
	public void sendEmailNotification() throws AddressException, MessagingException,
			FileNotFoundException {
		String content = writeStyle();
		content += writeHeader();
		content += writeTableHeader();
		content += writeTableRow();
		content += "</tbody></table>";
		htmlEmail.setContent(content);
		System.out.println(content);
		htmlEmail.sendEmail();
	}

	public String writeStyle() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(
				"C:/eclipse workspace jk/Spring_HtmlEmail/Custom/QUA/Locate/email/css/email.css");
		String style = ConvertInputStreamToString.convert(fis);
		return style;
	}

	public String writeHeader() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(
				"C:/eclipse workspace jk/Spring_HtmlEmail/Custom/QUA/Locate/email/template/header.html");
		String header = ConvertInputStreamToString.convert(fis);
		return header;
	}

	public String writeTableHeader() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(
				"C:/eclipse workspace jk/Spring_HtmlEmail/Custom/QUA/Locate/email/template/tableHeader.html");
		String header = ConvertInputStreamToString.convert(fis);
		return header;
	}

	public String writeTableRow() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(
				"C:/eclipse workspace jk/Spring_HtmlEmail/Custom/QUA/Locate/email/template/tableRow.html");
		String body = ConvertInputStreamToString.convert(fis);
		return body;
	}

	public String closeHeader() {
		String closure = "</tbody></table>";
		return closure;
	}

}
