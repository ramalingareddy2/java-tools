package com.staffmgmt.helper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHelper {
	private static Properties dbProperties = new Properties();

	static {
		try {
			dbProperties.load(ConnectionHelper.class.getClassLoader().getResourceAsStream("db.properties"));
			Class.forName(dbProperties.getProperty("db.driverClassname"));
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("failed to load db.properties or driverClass");
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection con = null;

		con = DriverManager.getConnection(dbProperties.getProperty("db.url"), dbProperties.getProperty("db.username"),
				dbProperties.getProperty("db.password"));
		con.setAutoCommit(false);

		return con;
	}

}
