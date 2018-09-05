package com.teamsankya.employeedatabase.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamsankya.employeedatabase.dao.EmployeeDAO;
import com.teamsankya.employeedatabase.factory.EmployeeServiceManager;

public class SearchAllEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("searchall");
		EmployeeDAO dao= EmployeeServiceManager
				.getInstance()
				.daoGenerator();
        dao.searchEmployee(name);
        req.getRequestDispatcher("searchall_response.jsp").forward(req, resp);
        
	}

}
