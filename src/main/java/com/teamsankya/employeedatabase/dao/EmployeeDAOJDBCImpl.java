package com.teamsankya.employeedatabase.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.teamsankya.employeedatabase.dto.EmployeeAddressInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeCompanyInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeDesignationInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;
import com.teamsankya.employeedatabase.dto.EmployeePersonalInfoBean;

public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	@Override
	public boolean createEmployee(EmployeeMasterBean bean) {
		
//		int id=1;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("driver loaded");
//			
//			try (Connection con = DriverManager
//					.getConnection("jdbc:mysql://localhost:3306/student_ex1?user=root&password=root");
//					PreparedStatement pstmt1 = con.prepareStatement("insert into employee_info values(id,?,?)");
//					PreparedStatement pstmt2 = con.prepareStatement("insert into employee_company_info values(id,?,?,?)");
//					PreparedStatement pstmt3 = con.prepareStatement("insert into employee_personal_info values(id,?,?,?)");
//					PreparedStatement pstmt4 = con.prepareStatement("insert into employee_designation_info values(id,?,?)");
//					PreparedStatement pstmt5 = con.prepareStatement("insert into employee_address_info values(id,?,?,?,?)");){
//				
//				System.out.println("connection done");
//				pstmt1.setInt(1, bean.get
//				pstmt1.setString(2,bean.getStudent_info_bean().getFnm());
//				pstmt1.setString(3,bean.getStudent_info_bean().getMnm());
//				System.out.println("setting values1 done");
//				
//				pstmt2.setInt(1, bean.getStudent_add_info_bean().getRegno());
//				pstmt2.setString(2, bean.getStudent_add_info_bean().getAdd_type());
//				pstmt2.setString(3, bean.getStudent_add_info_bean().getAdd1());
//				pstmt2.setString(4, bean.getStudent_add_info_bean().getAdd2());
//				pstmt2.setString(5, bean.getStudent_add_info_bean().getCity());
//				pstmt2.setInt(6, bean.getStudent_add_info_bean().getPin());
//				System.out.println("setting values2 done");	
//				
//				pstmt3.setInt(1, bean.getGuardian_info_bean().getRegno());
//				pstmt3.setString(2,bean.getGuardian_info_bean().getGfnm());
//				pstmt3.setString(3,bean.getGuardian_info_bean().getGmnm());
//				pstmt3.setString(4,bean.getGuardian_info_bean().getGlnm());
//				System.out.println("setting values3 done");
//				fdgddxsfvdzf
//				pstmt1.execute();
//				pstmt2.execute();
//				pstmt3.execute();
//				System.out.println("query execution done");
//				
//				if (count1 > 0 && count2 > 0 && count3 > 0 &&count4 > &&count5 >) {
//					check = true;
//					con.commit();
//				}
//			}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
		return false;
	}

	@Override
	public EmployeeMasterBean searchEmployee(int empId) {
		
		EmployeeMasterBean data = new EmployeeMasterBean();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try (Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee_db?user=root&password=root")) {
				try (PreparedStatement pstmt = con.prepareStatement("select * from employee_info ei, "
						+ "previous_company_info ec, employee_personal_info ep,current_company_info ed,"
						+ " employee_address_info ea" + 
						" where ei.id=ec.id and ei.id=ep.id and ei.id=ed.id and ei.id=ea.id and ei.id=?");)

				{
					pstmt.setInt(1,empId);

					try (ResultSet rs = pstmt.executeQuery()) {
						if (rs.next()) {
							
							
							
//							System.out.println("student found table1");
							data.getEmpInfoBean().setId(rs.getString("id"));
							data.getEmpInfoBean().setFirstname(rs.getString("firstname"));
							data.getEmpInfoBean().setLastname(rs.getString("lastname"));
							
							data.getEmpCompanyInfoBean().setDateOfJoining(rs.getString("date_of_joining"));
							data.getEmpCompanyInfoBean().setExperience(rs.getInt("experience"));
							data.getEmpCompanyInfoBean().setLastCompanyName(rs.getString("last_company_name"));
                          
                            data.getEmpPersonalInfoBean().setDateOfBirth(rs.getString("date_of_birth"));
							data.getEmpPersonalInfoBean().setPhNumber(rs.getInt("phone_no"));
							data.getEmpPersonalInfoBean().setEmailId(rs.getString("email_id"));
							
							data.getEmpDesignationInfoBean().setDesignation(rs.getString("designation"));
							data.getEmpDesignationInfoBean().setCostTocompany(rs.getInt("cost_to_company"));
							
							data.getEmpAddressInfoBean().setAddress1(rs.getString("address1"));
							data.getEmpAddressInfoBean().setAddress2(rs.getString("address2"));
							data.getEmpAddressInfoBean().setCity(rs.getString("city"));
							data.getEmpAddressInfoBean().setPincode(rs.getInt("pincode"));
							
							System.out.println("values are set");
							
						}//end of if block
					}			
				}
				}
	} catch (Exception e) {
			e.printStackTrace();
		}

		return data;
	}//end of GETEMPLOYEE method

	@Override
	public List<EmployeeMasterBean> searchAllEmployee() {
		

		ArrayList<EmployeeMasterBean> list = new ArrayList<EmployeeMasterBean>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			try (Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee_db?user=root&password=root"))
			{
				//	pstmt.setInt(1,empId);

					try (Statement pstmt = con.createStatement();
							ResultSet rs = pstmt.executeQuery("select * from employee_info ei, "
							+ "previous_company_info ec, employee_personal_info ep,current_company_info"
							+ " ed,"
							+ " employee_address_info ea where ei.id=ec.id and ei.id=ep.id and ei.id=ed.id "
							+ "and ei.id=ea.id");)
					{
						while(rs.next())
						{
							
							EmployeeMasterBean data=new EmployeeMasterBean();
							
//							System.out.println("student found table1");
							data.getEmpInfoBean().setId(rs.getString("id"));
							data.getEmpInfoBean().setFirstname(rs.getString("firstname"));
							data.getEmpInfoBean().setLastname(rs.getString("lastname"));
							
							data.getEmpCompanyInfoBean().setExperience(rs.getInt("experience"));
							data.getEmpCompanyInfoBean().setLastCompanyName(rs.getString("last_company_name"));
                          
                            data.getEmpPersonalInfoBean().setDateOfBirth(rs.getString("date_of_birth"));
							data.getEmpPersonalInfoBean().setPhNumber(rs.getInt("phone_no"));
				 			data.getEmpPersonalInfoBean().setEmailId(rs.getString("email_id"));
							
							data.getEmpDesignationInfoBean().setDateOfJoining(rs.getString("date_of_joining"));
							data.getEmpDesignationInfoBean().setDesignation(rs.getString("designation"));
							data.getEmpDesignationInfoBean().setCostTocompany(rs.getInt("cost_to_company"));
							
							data.getEmpAddressInfoBean().setAddress1(rs.getString("address1"));
							data.getEmpAddressInfoBean().setAddress2(rs.getString("address2"));
							data.getEmpAddressInfoBean().setCity(rs.getString("city"));
							data.getEmpAddressInfoBean().setPincode(rs.getInt("pincode"));
							list.add(data);
							System.out.println("values are set");
							
						}//end of while
					}
			}
		}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		return list;
	}//end of getAllEmployees method

	@Override
	public boolean updateEmployee(EmployeeMasterBean bean)
	{ 
		
		boolean check = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			try (Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee_db?user=root&password=root");
					PreparedStatement pstmt1 = con.prepareStatement("update employee_info set firstname=?,lastname=?  where id=?");
					PreparedStatement pstmt2 = con.prepareStatement("update previous_company_info set experience=?,last_company_name=? where id=?");
					PreparedStatement pstmt3 = con.prepareStatement("update employee_personal_info set date_of_birth=?,phone_no=?,email_id  =? where id=?");
					PreparedStatement pstmt4= con.prepareStatement("update current_company_info_info set  date_of_joining=?,designation=?,cost_to_company=? where id=?");
					PreparedStatement pstmt5= con.prepareStatement("update employee_address_info set address1=?,address2=?,city=?,pincode=?  where id=?");){
			
				System.out.println("connection done");
				pstmt1.setString(1, bean.getEmpInfoBean().getFirstname());
				pstmt1.setString(2,bean.getEmpInfoBean().getLastname());
				pstmt1.setString(3,bean.getEmpInfoBean().getId());
				System.out.println("setting values1 done");
				
				
				pstmt2.setInt(1,bean.getPreviousCompanyInfoBean().getExperience());
				pstmt2.setString(2,bean.getPreviousCompanyInfoBean().getLastCompanyName());
				pstmt2.setString(3,bean.getPreviousCompanyInfoBean().getId());
				System.out.println("setting values2 done");	
				
				pstmt3.setString(1,bean.getEmpPersonalInfoBean().getDateOfBirth());
				pstmt3.setInt(2,bean.getEmpPersonalInfoBean().getPhNumber());
				pstmt3.setString(3,bean.getEmpPersonalInfoBean().getEmailId());
				pstmt3.setString(4,bean.getEmpPersonalInfoBean().getId());
				System.out.println("setting values3 done");
				
				pstmt4.setString(1,bean.getCurrentCompanyInfoBean().getDateOfJoining());
				pstmt4.setString(2,bean.getCurrentCompanyInfoBean().getDesignation());
				pstmt4.setInt(3,bean.getCurrentCompanyInfoBean().getCostToCompany());
				pstmt4.setString(4,bean.getCurrentCompanyInfoBean().getId());
				System.out.println("setting values4 done");
				
				pstmt5.setString(1,bean.getEmpAddressInfoBean().getAddress1());
				pstmt5.setString(2,bean.getEmpAddressInfoBean().getAddress2());
				pstmt5.setString(3,bean.getEmpAddressInfoBean().getCity());
				pstmt5.setInt(4,bean.getEmpAddressInfoBean().getPincode());
				pstmt5.setString(5,bean.getEmpAddressInfoBean().getId());
				System.out.println("setting values5 done");
				
				
				
				
				int count1 = pstmt1.executeUpdate();
				int count2 = pstmt2.executeUpdate();
				int count3= pstmt3.executeUpdate();
				int count4= pstmt4.executeUpdate();
				int count5= pstmt5.executeUpdate();
				
				System.out.println("query execution done");
				System.out.println("hsdfbshfjsdhkj");
				if (count1 > 0 && count2 > 0 && count3 > 0 && count4>0 && 
					count5>0 ) {
					check = true;
					con.commit();
				}//end of if block
				}
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		return check;
	}//end of UPDATE method DONE

	@Override
	public boolean deleteEmployee(int empId) {
		boolean check = false;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try (Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee_db?user=root&password=root")) {
				con.setAutoCommit(false);
				
				try (PreparedStatement pstmt1 = con.prepareStatement("delete from employee_info where id=?  ");
					 PreparedStatement pstmt2 = con.prepareStatement("delete from previous_company_info where id=? ");
					 PreparedStatement pstmt3 = con.prepareStatement("delete from employee_personal_info where id=? ");
					 PreparedStatement pstmt4 = con.prepareStatement("delete from current_company_info where id=? ");
				     PreparedStatement pstmt5 = con.prepareStatement("delete from employee_address_info where id=? ");) {

					pstmt1.setInt(1, empId);
					pstmt2.setInt(1, empId);
					pstmt3.setInt(1, empId);
					pstmt4.setInt(1, empId);
					pstmt5.setInt(1, empId);
					int count1 = pstmt1.executeUpdate();
					int count2 = pstmt2.executeUpdate();
					int count3 = pstmt3.executeUpdate();
					int count4 = pstmt3.executeUpdate();
					int count5 = pstmt3.executeUpdate();
					
//					System.out.println(count1);
//					System.out.println(count2);
//					System.out.println(count3);
					if (count1 > 0 && count2 > 0 && count3 > 0&&count4 > 0 &&count5 > 0)
						{check = true;
					     con.commit();}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return check;
	}//end of delete method DONE

}//end of class


















