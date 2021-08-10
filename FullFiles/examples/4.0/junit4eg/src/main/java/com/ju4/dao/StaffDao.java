package com.ju4.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ju4.bo.StaffBo;
import com.ju4.exception.RecordNotFoundException;
import com.ju4.helper.ConnectionManager;

public class StaffDao {
	private final String SQL_GET_STAFF = "select staff_no, full_nm, gender, age, experience, mobile_nbr, email_address from staff where staff_no = ?";
	private ConnectionManager connectionManager;

	public StaffDao(ConnectionManager connectionManager) {
		this.connectionManager = connectionManager;
	}

	public StaffBo getStaff(int staffNo) throws SQLException, ClassNotFoundException, IOException {
		StaffBo bo = null;
		try (Connection con = connectionManager.getConnection();
				PreparedStatement pstmt = con.prepareStatement(SQL_GET_STAFF);) {
			pstmt.setInt(1, staffNo);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					bo = new StaffBo();
					bo.setStaffNo(rs.getInt(1));
					bo.setFullName(rs.getString(2));
					bo.setGender(rs.getString(3));
					bo.setAge(rs.getInt(4));
					bo.setExperience(rs.getInt(5));
					bo.setMobileNo(rs.getString(6));
					bo.setEmailAddress(rs.getString(7));
				} else {
					throw new RecordNotFoundException("staff not found");
				}
			}
		}

		return bo;
	}
}
