package com.pacsun.cybersource.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.pacsun.cybersource.constants.PacsunConstants;
import com.pacsun.util.StackTrace;


public class DBConnector implements PacsunConstants {

	private static DBConnector connector;
	private static volatile Connection connection;
	private static Properties properties;
	private static final Logger log = Logger.getLogger(DBConnector.class);

	private DBConnector() {
	}

	public synchronized static DBConnector getInstance() {
		if (connector == null) {
			connector = new DBConnector();
		}
		return connector;
	}

	public static Connection getCurrentConnection() {
		return connection;
	}

	public static Connection getConnection() throws Exception {
		if (connection == null) {
			Connection c = null;
			try {
				Class.forName(properties.getProperty(AS400_DRIVER));
			} catch (ClassNotFoundException e) {
				log.error("DBConnector : " + StackTrace.getStackTrace(e));
				throw new Exception(e);
			}
			try {
				c = DriverManager.getConnection(properties.getProperty(AS400_URL), properties.getProperty(AS400_USER),
						properties.getProperty(AS400_PASSWORD));
			} catch (SQLException e) {
				log.error("DBConnector : " + StackTrace.getStackTrace(e));
				throw new Exception(e);
			}

			connection = c;
		}
		return connection;
	}

	public static void setConnection(Connection connection) {
		DBConnector.connection = connection;
	}

	public static void setProperties(Properties properties) {
		DBConnector.properties = properties;
	}
}