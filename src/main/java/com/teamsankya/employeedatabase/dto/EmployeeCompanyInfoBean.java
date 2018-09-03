package com.teamsankya.employeedatabase.dto;

public class EmployeeCompanyInfoBean {
	private int id;
	private String dateOfJoining;
	private String experience;
	private String lastCompanyName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getLastCompanyName() {
		return lastCompanyName;
	}
	public void setLastCompanyName(String lastCompanyName) {
		this.lastCompanyName = lastCompanyName;
	}

}
