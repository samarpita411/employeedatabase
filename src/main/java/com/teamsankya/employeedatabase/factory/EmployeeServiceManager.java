package com.teamsankya.employeedatabase.factory;

import java.io.FileReader;
import java.util.Properties;

import com.teamsankya.employeedatabase.dao.EmployeeDAO;

public class EmployeeServiceManager {
	private EmployeeServiceManager() {}
	private static final EmployeeServiceManager EMPLOYEE_SERVICE_MANAGER = new EmployeeServiceManager();
	public static EmployeeServiceManager getInstance() {
	
		return EMPLOYEE_SERVICE_MANAGER;
	}
	public EmployeeDAO daoGenerator() {
		Properties properties = new Properties();
		String path = getClass().getResource("/emp_config.properties").getPath();
		try {
			FileReader filereader = new FileReader(path);
			properties.load(filereader);
		}catch (Exception e1) {
			e1.printStackTrace();
		}
		EmployeeDAO dao = null;
		try {
			dao = (EmployeeDAO)Class
					.forName(properties.getProperty("dao_class"))
					.newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dao;
		
	}

}
