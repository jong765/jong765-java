package com.pacsun.process;

import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Date;

import org.apache.http.conn.ConnectTimeoutException;
import org.apache.log4j.Logger;

import com.pacsun.util.StackTrace;


public class TestProgram {
	
	private static final Byte API_REQUEST_RETRIAL_ATTEMPT = 3;
	private static Logger logger = Logger.getLogger(TestProgram.class);

	public void run() throws Exception {
		try {
			boolean connectionTimedout = false;
			boolean retry = true;
			int counter = 0;

			while (retry) {
				connectionTimedout = false;

				try {
					logger.info("Calling Send API ... " + new Date());
					// Call API
					logger.info("Received Send API response ... " + new Date());
				} catch (Exception e) {
					if (e.getCause() instanceof ConnectTimeoutException
							|| e.getCause() instanceof SocketTimeoutException
							|| e.getCause() instanceof SocketException) {
						logger.fatal(this.getClass().getName() + " : "
								+ e.getMessage() + "\n"
								+ StackTrace.getStackTrace(e));
						connectionTimedout = true;
						Thread.sleep(5000);
					} else {
						throw new Exception(e);
					}
				}
				counter++;
				if (connectionTimedout) {
					if (counter < API_REQUEST_RETRIAL_ATTEMPT)
						retry = true;
					else
						throw new ConnectTimeoutException(
								"Connection timed out");
				} else {
					retry = false;
				}
			}
		} catch (ConnectTimeoutException e) {
			throw new ConnectTimeoutException("Connection timed out");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.fatal(this.getClass().getName() + " : " + e.getMessage()
					+ "\n" + StackTrace.getStackTrace(e));
			throw new Exception(e);
		}

	}

}
