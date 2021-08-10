package com.ju4.bo;

import java.util.Objects;

public class StaffBo {
	private int staffNo;
	private String fullName;
	private String gender;
	private int age;
	private int experience;
	private String mobileNo;
	private String emailAddress;

	public StaffBo() {
		super();
	}

	public StaffBo(int staffNo, String fullName, String gender, int age, int experience, String mobileNo,
			String emailAddress) {
		this.staffNo = staffNo;
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		this.experience = experience;
		this.mobileNo = mobileNo;
		this.emailAddress = emailAddress;
	}

	public int getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, emailAddress, experience, fullName, gender, mobileNo, staffNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StaffBo other = (StaffBo) obj;
		return age == other.age && Objects.equals(emailAddress, other.emailAddress) && experience == other.experience
				&& Objects.equals(fullName, other.fullName) && Objects.equals(gender, other.gender)
				&& Objects.equals(mobileNo, other.mobileNo) && staffNo == other.staffNo;
	}

}
