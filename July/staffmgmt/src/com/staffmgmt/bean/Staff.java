package com.staffmgmt.bean;

public class Staff {
	private int staffNo;
	private String fullname;
	private int age;
	private String gender;
	private int experience;
	private String mobileNo;
	private String emailAddress;

	public int getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
	public String toString() {
		return "Staff [staffNo=" + staffNo + ", fullname=" + fullname + ", age=" + age + ", gender=" + gender
				+ ", experience=" + experience + ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + "]";
	}

}
