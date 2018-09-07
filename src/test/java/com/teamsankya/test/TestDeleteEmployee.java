package com.teamsankya.test;

import org.junit.Test;

import com.teamsankya.employeedatabase.dao.EmployeeDAOJDBCImpl;

import junit.framework.TestCase;

public class TestDeleteEmployee {
	@Test
	public void deleteEmployeeBooleanTest()
	{
		EmployeeDAOJDBCImpl  empDaoJdbcImpl=new EmployeeDAOJDBCImpl();
		boolean result=empDaoJdbcImpl.deleteEmployee("abc002");
		TestCase.assertEquals(true, result);
	}

}//DONE
