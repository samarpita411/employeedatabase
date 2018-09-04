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
		int empId = Integer.parseInt(req.getParameter("EmpId"));
		EmployeeDAO dao = EmployeeServiceManager
				.getInstance()
				.daoGenerator();
		dao.deleteEmployee(empId);
		System.out.println("data deleted");

		System.out.println("sending the response now");

		req.getRequestDispatcher("DeleteEmployeeRespons.jsp").forward(req, resp);
		System.out.println("response done");


	}

}
