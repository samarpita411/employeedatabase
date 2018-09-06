package com.teamsankya.employeedatabase.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamsankya.employeedatabase.dao.EmployeeDAO;
import com.teamsankya.employeedatabase.factory.EmployeeServiceManager;

public class DeleteEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empId = req.getParameter("EmpId");
		EmployeeDAO dao = EmployeeServiceManager
				.getInstance()
				.daoGenerator();
		boolean b =dao.deleteEmployee(empId);
		if(b==true)
        req.getRequestDispatcher("delete_response.jsp").forward(req, resp);
		req.getRequestDispatcher("delete_response1").forward(req, resp);


	}

}
