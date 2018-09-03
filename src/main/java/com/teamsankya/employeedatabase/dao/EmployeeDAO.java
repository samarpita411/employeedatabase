package com.teamsankya.employeedatabase.dao;

import java.util.List;

import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;

public interface EmployeeDAO 
{
	public boolean createEmployee(EmployeeMasterBean empMasterBean);
	public EmployeeMasterBean getEmployee(int empId);
	public List<EmployeeMasterBean> getAllEmployee();
	public boolean updateEmployee(EmployeeMasterBean empMasterBean );
	public boolean deleteEmployee(int empId);
	

}
