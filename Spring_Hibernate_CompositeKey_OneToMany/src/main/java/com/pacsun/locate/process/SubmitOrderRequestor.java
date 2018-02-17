package com.pacsun.locate.process;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

import com.pacsun.locate.model.OrderHeader;
import com.pacsun.util.StackTrace;

public class SubmitOrderRequestor {

	private static String errorMessage;
	private static final Logger log = Logger.getLogger(SubmitOrderRequestor.class);

	public static void main(String[] args) throws Exception {
		try {
			new SubmitOrderRequestor().run();
		} catch (Exception e) {
			log.error(StackTrace.getStackTrace(e));
			throw new Exception(e);
		}
		System.exit(0);
	}

	public void run() throws Exception {
		Log4jConfigurer.initLogging("classpath:log4j_submitOrder.properties", 60000);
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Running in 5 threads
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

		try {
			SubmitOrderProcessHelper processHelper = (SubmitOrderProcessHelper) context
					.getBean("submitOrderProcessHelper");
			List<OrderHeader> orderHeaderList = processHelper.getDemandwareOrdersToProcess();

			if (orderHeaderList.size() > 0) {
				Iterator<OrderHeader> orderHeaderIterator = orderHeaderList.iterator();

				try {
					while (orderHeaderIterator.hasNext()) {
						OrderHeader orderHeader = (OrderHeader) orderHeaderIterator.next();
						orderHeaderList1.add(orderHeader);
						orderHeader = (OrderHeader) orderHeaderIterator.next();
						orderHeaderList2.add(orderHeader);
						orderHeader = (OrderHeader) orderHeaderIterator.next();
						orderHeaderList3.add(orderHeader);
						orderHeader = (OrderHeader) orderHeaderIterator.next();
						orderHeaderList4.add(orderHeader);
						orderHeader = (OrderHeader) orderHeaderIterator.next();
						orderHeaderList5.add(orderHeader);
					}
				} catch (NoSuchElementException e) {
					// Do nothing
				}

				if (orderHeaderList1.size() > 0) {
					process1 = (SubmitOrderProcess) context.getBean("submitOrderProcess");
					process1.setOrderHeaderList(orderHeaderList1);
					process1.setupThread("Thread1");
					process1.t.start();
				}

				if (orderHeaderList2.size() > 0) {
					process2 = (SubmitOrderProcess) context.getBean("submitOrderProcess");
					process2.setOrderHeaderList(orderHeaderList2);
					process2.setupThread("Thread2");
					process2.t.start();
				}

				if (orderHeaderList3.size() > 0) {
					process3 = (SubmitOrderProcess) context.getBean("submitOrderProcess");
					process3.setOrderHeaderList(orderHeaderList3);
					process3.setupThread("Thread3");
					process3.t.start();
				}

				if (orderHeaderList4.size() > 0) {
					process4 = (SubmitOrderProcess) context.getBean("submitOrderProcess");
					process4.setOrderHeaderList(orderHeaderList4);
					process4.setupThread("Thread4");
					process4.t.start();
				}

				if (orderHeaderList5.size() > 0) {
					process5 = (SubmitOrderProcess) context.getBean("submitOrderProcess");
					process5.setOrderHeaderList(orderHeaderList5);
					process5.setupThread("Thread5");
					process5.t.start();
				}

				while ((process1 != null && process1.t.isAlive()) || (process2 != null && process2.t.isAlive())
						|| (process3 != null && process3.t.isAlive()) || (process4 != null && process4.t.isAlive())
						|| (process5 != null && process5.t.isAlive())) {
					Thread.sleep(3000);
				}
			} else {
				log.info("There are no orders to process at this time.");
			}

		} catch (Exception e) {
			errorMessage = this.getClass().getName() + " : " + "Error in Locate Submit Order requestor.\n"
					+ StackTrace.getStackTrace(e);
			log.error(errorMessage);
			throw new Exception(errorMessage);
		} finally {
			context.close();
		}

	}

}
