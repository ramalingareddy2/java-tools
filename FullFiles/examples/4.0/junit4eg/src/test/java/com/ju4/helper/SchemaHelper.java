package com.ju4.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SchemaHelper {
	private ConnectionManager connectionManager;

	public SchemaHelper(ConnectionManager connectionManager) {
		this.connectionManager = connectionManager;
	}

	public void execute(String sqlFileLocation) throws FileNotFoundException, IOException, SQLException {
		String sql = null;
		File inFile = null;
		String line = null;
		boolean flag = false;
		StringBuffer buffer = null;

		inFile = new File(this.getClass().getClassLoader().getResource(sqlFileLocation).getPath());
		try (FileReader fileReader = new FileReader(inFile);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			buffer = new StringBuffer();
			while ((line = bufferedReader.readLine()) != null) {
				buffer.append(line);
			}
		}

		sql = buffer.toString();
		try (Connection con = connectionManager.getConnection(); Statement statement = con.createStatement();) {
			try {
				statement.execute(sql);
				flag = true;
			} finally {
				if (con != null) {
					if (flag) {
						con.commit();
					} else {
						con.rollback();
					}
				}
			}
		}
	}
}
