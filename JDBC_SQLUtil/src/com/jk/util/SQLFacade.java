package com.jk.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLFacade extends SQLFacadeAbstract {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public SQLFacade() throws SQLException {
		super();
	}

	public Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jkim";
		String userName = "jkim";
		String password = "j337446";
		System.out.println("get new connection");
		return (DriverManager.getConnection(url, userName, password));
	}

	public void freeConnection(Connection conn) throws SQLException {
		conn.close();
	}
}