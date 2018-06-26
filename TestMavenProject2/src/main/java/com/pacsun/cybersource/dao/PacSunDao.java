package com.pacsun.cybersource.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.pacsun.cybersource.connect.DBConnector;
import com.pacsun.cybersource.constants.PacsunConstants;
import com.pacsun.util.StackTrace;

public class PacSunDao implements PacsunConstants {

	protected DriverManagerDataSource dataSource;
	protected Connection conn;
	protected PreparedStatement ps;
	protected ResultSet rs;
	protected Properties dbProperties;
	protected Properties cybsProperties;
	protected String sql = null;
	protected StringBuilder sb = null;

	private static final Logger log = Logger.getLogger(PacSunDao.class);

	protected PacSunDao(Properties properties) {
		this.dbProperties = properties;
	}

	protected Connection getConnection() throws Exception {
		DBConnector.setProperties(dbProperties);
		DBConnector.getInstance();
		try {
			conn = DBConnector.getConnection();
		} catch (Exception e) {
			String errorMessage = this.getClass().getName() + " : " + StackTrace.getStackTrace(e);
			log.error(errorMessage);
			throw new Exception(errorMessage);
		}
		return conn;
	}
}