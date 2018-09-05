package com.teamsankya.employeedatabase.dao;

import java.util.List;

import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;

public interface EmployeeDAO 
{
	public boolean createEmployee(EmployeeMasterBean bean);
	public EmployeeMasterBean searchEmployee(String empId);
    public boolean updateEmployee(EmployeeMasterBean bean );
	public boolean deleteEmployee(String empId);
	
	

}
