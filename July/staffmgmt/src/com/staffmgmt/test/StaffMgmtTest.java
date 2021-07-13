package com.staffmgmt.test;

import java.sql.SQLException;
import java.util.List;

import com.staffmgmt.bean.Staff;
import com.staffmgmt.dao.StaffDao;

public class StaffMgmtTest {
	public static void main(String[] args) throws SQLException {
		List<Staff> staffList = null;
		StaffDao staffDao = null;

		staffDao = new StaffDao();
		staffList = staffDao.getStaff();
		staffList.stream().forEach(System.out::println);
	}
}
