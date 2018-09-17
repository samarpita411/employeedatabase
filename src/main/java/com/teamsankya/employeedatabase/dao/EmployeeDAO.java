package com.teamsankya.employeedatabase.dao;

import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;

import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;

public interface EmployeeDAO 
{
	public String createEmployee(EmployeeMasterBean bean);
	public EmployeeMasterBean searchEmployee(String id);
	public List<EmployeeMasterBean> searchAllEmployee(); 
    public boolean updateEmployee(EmployeeMasterBean bean );
	public boolean deleteEmployee(String empId);
	
	public default String idGenerator() {
		char[] idChar = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
				'q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
		String id = "";
		Random random = new Random();
		for(int i=0;i<8;i++ )
		{
			int index = random.nextInt(idChar.length);
			id = id+idChar[index];
		}
		
    	return id;
    }
    public default String uniqueId()
    {
    	
    	EmployeeMasterBean bean = null;
    	String id = null;
    	do
    	{
    	id= idGenerator();
    	bean = searchEmployee(id);
    	}
    	while(bean == null);
		return id;
    }
	

}
