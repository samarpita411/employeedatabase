package com.teamsankya.test;

import org.junit.Test;

import com.teamsankya.employeedatabase.dao.EmployeeDAOJDBCImpl;

import junit.framework.TestCase;

public class TestDeleteEmployee {
	@Test
	public void deleteEmployeeTest()
	{
		EmployeeDAOJDBCImpl  empDaoJdbcImpl=new EmployeeDAOJDBCImpl();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean result=empDaoJdbcImpl.deleteEmployee("abc002");
		TestCase.assertEquals(true, result);
	}

}//DONE
 