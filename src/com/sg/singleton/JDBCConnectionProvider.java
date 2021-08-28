package com.sg.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionProvider {

	private static JDBCConnectionProvider jdbcConnectionProvider = null;
	private Connection conn;

	private static final String DB_URL = "jdbc:postgresql://localhost:54330/postgres";
	private static final String USER_NAME = "postgres";
	private static final String PASSWORD = "postgres";

	private JDBCConnectionProvider() throws SQLException {

	}

	private void createConnection() throws SQLException {
		conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
	}

	public static JDBCConnectionProvider getInstance() throws SQLException {
		if (jdbcConnectionProvider != null) {
			jdbcConnectionProvider.createConnection();
			return jdbcConnectionProvider;
		}

		synchronized (JDBCConnectionProvider.class) {
			if (jdbcConnectionProvider == null) {
				jdbcConnectionProvider = new JDBCConnectionProvider();
				jdbcConnectionProvider.createConnection();
			}
		}

		return jdbcConnectionProvider;
	}

	public Connection getConnection() {
		return conn;

	}

}
