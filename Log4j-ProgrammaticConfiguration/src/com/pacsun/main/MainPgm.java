package com.pacsun.main;

import java.io.IOException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class MainPgm {
	
	private final static Logger logger = Logger.getLogger(MainPgm.class);

	public static void main(String[] args) {
		Logger rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(Level.INFO);

		// Define log pattern layout
		PatternLayout layout = new PatternLayout("%d{MMM dd yyyy HH:mm:ss,SSS} [%t] %5p - %m%n");

		// Add console appender to root logger
		rootLogger.addAppender(new ConsoleAppender(layout));
		try {
			// Define file appender with layout and output log file name
			DailyRollingFileAppender fileAppender = new DailyRollingFileAppender(layout, "Custom/QUA/Test/logs/ps_test.log", "yyMMdd");

			// Add the appender to root logger
			rootLogger.addAppender(fileAppender);
		} catch (IOException e) {
			System.out.println("Failed to add appender !!");
		}
		logger.info("info logged");
		logger.debug("debug logged");
		logger.error("error logged");
		logger.warn("warn logged");
		logger.fatal("fatal logged");

	}

}
