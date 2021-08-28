package com.sg.singleton;

import java.sql.Connection;
import java.sql.SQLException;

public class SingletonDriver {
	private static Connection con;

	public static void main(String[] args) {

		try {
			System.out.println(JDBCConnectionProvider.getInstance());

			System.out.println(JDBCConnectionProvider.getInstance());

			con = JDBCConnectionProvider.getInstance().getConnection();
			System.out.println(con);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

	}

}
