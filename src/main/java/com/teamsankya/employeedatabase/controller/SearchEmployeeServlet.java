package com.teamsankya.employeedatabase.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamsankya.employeedatabase.dao.EmployeeDAO;
import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;
import com.teamsankya.employeedatabase.factory.EmployeeServiceManager;

public class SearchEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeMasterBean bean = (EmployeeMasterBean) req.getAttribute("bean");
		String name = req.getParameter("search");
		EmployeeDAO dao= EmployeeServiceManager
				.getInstance()
				.daoGenerator();
        dao.searchEmployee(name);
        req.getRequestDispatcher("search_response.jsp").forward(req, resp);
	}
}

	

