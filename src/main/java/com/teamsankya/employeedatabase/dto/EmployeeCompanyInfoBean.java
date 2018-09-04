package com.teamsankya.employeedatabase.dto;

public class EmployeeCompanyInfoBean {
	private int id;
	private String dateOfJoining;
	private int experience;
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getLastCompanyName() {
		return lastCompanyName;
	}
	public void setLastCompanyName(String lastCompanyName) {
		this.lastCompanyName = lastCompanyName;
	}

}
