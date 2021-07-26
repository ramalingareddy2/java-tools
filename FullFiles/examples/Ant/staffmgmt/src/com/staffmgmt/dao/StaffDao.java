package com.staffmgmt.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.staffmgmt.bean.Staff;
import com.staffmgmt.helper.ConnectionHelper;

public class StaffDao {
	private final String SQL_GET_STAFF = "select staff_no, full_nm, age, gender,experience,mobile_nbr, email_address from staff order by full_nm";

	public List<Staff> getStaff() throws SQLException {
		List<Staff> staffList = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Staff staff = null;

		staffList = new ArrayList<>();
		con = ConnectionHelper.getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery(SQL_GET_STAFF);
		while (rs.next()) {
			staff = new Staff();
			staff.setStaffNo(rs.getInt(1));
			staff.setFullname(rs.getString(2));
			staff.setAge(rs.getInt(3));
			staff.setGender(rs.getString(4));
			staff.setExperience(rs.getInt(5));
			staff.setMobileNo(rs.getString(6));
			staff.setEmailAddress(rs.getString(7));
			staffList.add(staff);
		}

		return staffList;
	}
}
