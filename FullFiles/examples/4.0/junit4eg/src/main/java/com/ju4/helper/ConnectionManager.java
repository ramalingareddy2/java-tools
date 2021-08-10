package com.ju4.helper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	private String driverClassname;
	private String dbUrl;
	private String dbUsername;
	private String dbPassword;

	public ConnectionManager(String configLocation) throws IOException, ClassNotFoundException {
		Properties props = null;

		props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream(configLocation));
		driverClassname = props.getProperty("db.driverClassname");
		dbUrl = props.getProperty("db.url");
		dbUsername = props.getProperty("db.username");
		dbPassword = props.getProperty("db.password");

		Class.forName(driverClassname);
	}

	public Connection getConnection() throws SQLException {
		Connection con = null;

		con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		con.setAutoCommit(false);
		return con;
	}
}
