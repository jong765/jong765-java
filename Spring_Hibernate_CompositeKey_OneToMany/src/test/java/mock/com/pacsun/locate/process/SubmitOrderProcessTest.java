package mock.com.pacsun.locate.process;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.microsretail.Locate.SubmitOrderResponseMessageTypeBean;
import com.pacsun.locate.builder.SubmitOrderRequestBuilder;
import com.pacsun.locate.model.OrderHeader;
import com.pacsun.locate.process.SubmitOrderProcess;
import com.pacsun.locate.service.IOrderHeaderService;
import com.pacsun.locate.webservice.invoker.IWebServiceInvoker;
import com.pacsun.util.StackTrace;

@ContextConfiguration({ "classpath:applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SubmitOrderProcessTest {

	@Autowired
	@InjectMocks
	private SubmitOrderProcess submitOrderProcess;

	@Autowired
	protected IOrderHeaderService orderHeaderService;

	@Mock
	private IWebServiceInvoker webServiceInvoker;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@SuppressWarnings("resource")
	@Test
	public void run() throws Exception {
		Mockito.when(
				webServiceInvoker
						.callSubmitOrder(Mockito.any(SubmitOrderRequestBuilder.class).getOrderRequestMessage()))
				.thenReturn(new SubmitOrderResponseMessageTypeBean());

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SubmitOrderProcess process1 = null;
		SubmitOrderProcess process2 = null;
		SubmitOrderProcess process3 = null;
		SubmitOrderProcess process4 = null;
		SubmitOrderProcess process5 = null;

		List<OrderHeader> orderHeaderList1 = new ArrayList<OrderHeader>();
		List<OrderHeader> orderHeaderList2 = new ArrayList<OrderHeader>();
		List<OrderHeader> orderHeaderList3 = new ArrayList<OrderHeader>();
		List<OrderHeader> orderHeaderList4 = new ArrayList<OrderHeader>();
		List<OrderHeader> orderHeaderList5 = new ArrayList<OrderHeader>();

		List<OrderHeader> orderHeaderList = getDemandwareOrdersToProcess();
		Iterator<OrderHeader> IT = orderHeaderList.iterator();

		try {
			while (IT.hasNext()) {
				OrderHeader orderHeader = (OrderHeader) IT.next();
				orderHeaderList1.add(orderHeader);
				orderHeader = (OrderHeader) IT.next();
				orderHeaderList2.add(orderHeader);
				orderHeader = (OrderHeader) IT.next();
				orderHeaderList3.add(orderHeader);
				orderHeader = (OrderHeader) IT.next();
				orderHeaderList4.add(orderHeader);
				orderHeader = (OrderHeader) IT.next();
				orderHeaderList5.add(orderHeader);
				orderHeader = (OrderHeader) IT.next();
			}
		} catch (NoSuchElementException e) {
			// Do nothing
		}

		if (orderHeaderList1.size() > 0) {
			process1 = (SubmitOrderProcess) context.getBean("submitOrderProcess");
			process1.setWebServiceInvoker(webServiceInvoker);
			process1.setOrderHeaderList(orderHeaderList1);
			process1.getT().start();
		}

		if (orderHeaderList2.size() > 0) {
			process2 = (SubmitOrderProcess) context.getBean("submitOrderProcess");
			process2.setWebServiceInvoker(webServiceInvoker);
			process2.setOrderHeaderList(orderHeaderList2);
			process2.getT().start();
		}

		if (orderHeaderList3.size() > 0) {
			process3 = (SubmitOrderProcess) context.getBean("submitOrderProcess");
			process3.setWebServiceInvoker(webServiceInvoker);
			process3.setOrderHeaderList(orderHeaderList3);
			process3.getT().start();
		}

		if (orderHeaderList4.size() > 0) {
			process4 = (SubmitOrderProcess) context.getBean("submitOrderProcess");
			process4.setWebServiceInvoker(webServiceInvoker);
			process4.setOrderHeaderList(orderHeaderList4);
			process4.getT().start();
		}

		if (orderHeaderList5.size() > 0) {
			process5 = (SubmitOrderProcess) context.getBean("submitOrderProcess");
			process5.setWebServiceInvoker(webServiceInvoker);
			process5.setOrderHeaderList(orderHeaderList5);
			process5.getT().start();
		}

		try {
			while ((process1 != null && process1.getT().isAlive()) || (process2 != null && process2.t.isAlive())
					|| (process3 != null && process3.getT().isAlive()) || (process4 != null && process4.t.isAlive())
					|| (process5 != null && process5.getT().isAlive())) {
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			String errorMessage = this.getClass().getName() + " : " + StackTrace.getStackTrace(e);
		}
	}

	public List<OrderHeader> getDemandwareOrdersToProcess() throws Exception {
		List<OrderHeader> orderHeaderList = orderHeaderService.findUnprocessedOrders();
		return orderHeaderList;
	}

}
