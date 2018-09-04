package com.teamsankya.employeedatabase.dto;

public class EmployeeCompanyInfoBean{
	private String id;
	private String dateOfJoining;
	private int experience;
	private String lastCompanyName;
	
	public String getId() {
		return id;
	}
	public void setId(String string) {
		this.id = string;
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
