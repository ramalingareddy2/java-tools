package com.ju4.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ju4.bo.StaffBo;
import com.ju4.helper.ConnectionManager;
import com.ju4.helper.SchemaHelper;

public class StaffDaoTest {
	ConnectionManager testConnectionManager;
	SchemaHelper testSchemaHelper;
	StaffDao staffDao;

	@BeforeClass
	public static void startUp() throws ClassNotFoundException, IOException, SQLException {
		SchemaHelper schemaHelper = null;
		ConnectionManager connectionManager = null;

		connectionManager = new ConnectionManager("db-root.properties");
		schemaHelper = new SchemaHelper(connectionManager);
		schemaHelper.execute("create-db.sql");
		schemaHelper.execute("create-staff.sql");
	}

	@Before
	public void init() throws ClassNotFoundException, IOException, SQLException {
		testConnectionManager = new ConnectionManager("db-test.properties");
		testSchemaHelper = new SchemaHelper(testConnectionManager);
		testSchemaHelper.execute("staff-data.sql");
		staffDao = new StaffDao(testConnectionManager);
	}

	@Test
	public void testGetStaff() throws ClassNotFoundException, SQLException, IOException {
		int staffNo = 1;
		StaffBo expectedStaffBo = null;
		StaffBo actualStaffBo = null;

		expectedStaffBo = new StaffBo(1, "Alex", "Male", 23, 5, "029298309928", "alex@gmail.com");
		actualStaffBo = staffDao.getStaff(staffNo);
		Assert.assertEquals(expectedStaffBo, actualStaffBo);
	}

	@After
	public void cleanUp() throws FileNotFoundException, IOException, SQLException {
		testSchemaHelper.execute("truncate-staff.sql");
		staffDao = null;
	}

	@AfterClass
	public static void destroy() throws FileNotFoundException, IOException, SQLException, ClassNotFoundException {
		SchemaHelper schemaHelper = null;
		ConnectionManager connectionManager = null;

		connectionManager = new ConnectionManager("db-root.properties");
		schemaHelper = new SchemaHelper(connectionManager);
		schemaHelper.execute("drop-staff.sql");
		schemaHelper.execute("drop-db.sql");
	}
}
