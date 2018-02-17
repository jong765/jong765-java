package com.pacsun.locate.handler;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.microsretail.Locate.MessageHeaderTypeBean;
import com.microsretail.Locate.SubmitOrderResponseMessageBodyTypeBean;
import com.microsretail.Locate.SubmitOrderResponseMessageResponseTypeBean;
import com.microsretail.Locate.SubmitOrderResponseMessageTypeBean;
import com.pacsun.locate.model.OrderHeader;
import com.pacsun.locate.service.IOrderHeaderService;

@ContextConfiguration({ "classpath:hsqlApplicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderResponseHandlerTest {

	@Autowired
	private SubmitOrderResponseHandler orderResponseHandler;

	@Autowired
	private IOrderHeaderService orderHeaderService;

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
	public void processResponse() throws Exception {
		List<OrderHeader> orderHeaderList = orderHeaderService.findOrdersForOpStatusUpdate();
		int i = 1;
		for (OrderHeader orderHeader : orderHeaderList) {
			System.out.println(orderHeader);
			SubmitOrderResponseMessageTypeBean responseMessage = new SubmitOrderResponseMessageTypeBean();
			MessageHeaderTypeBean messageHeader = new MessageHeaderTypeBean();
			messageHeader.setXaction_response("FAILED");
			responseMessage.setMessage_header(messageHeader);
			SubmitOrderResponseMessageBodyTypeBean messageBody = new SubmitOrderResponseMessageBodyTypeBean();
			SubmitOrderResponseMessageResponseTypeBean response = new SubmitOrderResponseMessageResponseTypeBean();
			messageBody.setResponse(response);
			responseMessage.setMessage_body(messageBody);

			orderResponseHandler.processResponse(orderHeader, responseMessage);

			System.out.println(i++);
		}
	}

}
