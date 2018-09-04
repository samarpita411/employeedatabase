package com.teamsankya.employeedatabase.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;

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
//				
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
	public EmployeeMasterBean getEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeMasterBean> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployee(EmployeeMasterBean bean)
	{ 
		
		boolean check = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			try (Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/student_ex1?user=root&password=root");
					PreparedStatement pstmt1 = con.prepareStatement("update employee_info set firstname=? where id=?");
					PreparedStatement pstmt2 = con.prepareStatement("update employee_info set lastname=? where id=?");
					
					PreparedStatement pstmt3 = con.prepareStatement("update employee_company_info set date_of_joining=? where id=?");
					PreparedStatement pstmt4= con.prepareStatement("update employee_company_info experience=? where id=?");
					PreparedStatement pstmt5 = con.prepareStatement("update employee_company_info set last_company_name=? where id=?");
					
					PreparedStatement pstmt6 = con.prepareStatement("update employee_personal_info set date_of_birth=? where id=?");
					PreparedStatement pstmt7 = con.prepareStatement("update employee_personal_info set phone_no=? where id=?");
					PreparedStatement pstmt8 = con.prepareStatement("update employee_personal_info set email_id  =? where id=?");
					
					PreparedStatement pstmt9= con.prepareStatement("update employee_designation_info set designation=? where id=?");
					PreparedStatement pstmt10 = con.prepareStatement("update employee_designation_info set cost_to_company=? where id=?");
					
					PreparedStatement pstmt11= con.prepareStatement("update employee_address_info set address1=? where id=?");
					PreparedStatement pstmt12 = con.prepareStatement("update employee_address_info set address2=? where id=?");
					PreparedStatement pstmt13= con.prepareStatement("update employee_address_info set city=? where id=?");
					PreparedStatement pstmt14 = con.prepareStatement("update employee_address_info set pincode=? where id=?");){
			
				System.out.println("connection done");
				pstmt1.setString(1, bean.getEmpInfoBean().getFirstname());
				pstmt1.setInt(2,bean.getEmpInfoBean().getId());
				System.out.println("setting values1 done");
				
				pstmt2.setString(1,bean.getEmpInfoBean().getLastname());
				pstmt2.setInt(2,bean.getEmpInfoBean().getId());
				System.out.println("setting values2 done");	
				
				pstmt3.setString(1, bean.getEmpCompanyInfoBean().getDateOfJoining());
				pstmt3.setInt(2, bean.getEmpCompanyInfoBean().getId());
				System.out.println("setting values3 done");
				
				pstmt4.setInt(1, bean.getEmpCompanyInfoBean().getExperience());
				pstmt4.setInt(2, bean.getEmpCompanyInfoBean().getId());
				
				pstmt5.setString(1, bean.getEmpCompanyInfoBean().getLastCompanyName());
				pstmt5.setInt(2, bean.getEmpCompanyInfoBean().getId());
				
				pstmt6.setString(1, bean.getEmpPersonalInfoBean().getDateOfBirth());
				pstmt6.setInt(2, bean.getEmpPersonalInfoBean().getId());
				
				pstmt7.setInt(1,  bean.getEmpPersonalInfoBean().getPhNumber());
				pstmt7.setInt( 2,bean.getEmpPersonalInfoBean().getId());
				
				pstmt8.setString(1,  bean.getEmpPersonalInfoBean().getEmailId());
				pstmt8.setInt(2,  bean.getEmpPersonalInfoBean().getId());
				
				pstmt9.setString(1, bean.getEmpDesignationInfoBean().getDesignation());
				pstmt9.setInt(2, bean.getEmpDesignationInfoBean().getId());
				
				pstmt10.setInt(1, bean.getEmpDesignationInfoBean().getCostTocompany());
				pstmt10.setInt(2, bean.getEmpDesignationInfoBean().getId());
				
				pstmt11.setString(1, bean.getEmpAddressInfoBean().getAddress1());
				pstmt11.setInt(2,bean.getEmpAddressInfoBean().getId());
				
				pstmt12.setString(1, bean.getEmpAddressInfoBean().getAddress2());
				pstmt12.setInt(2, bean.getEmpAddressInfoBean().getId());
				
				pstmt13.setString(1,  bean.getEmpAddressInfoBean().getCity());
				pstmt13.setInt(2,  bean.getEmpAddressInfoBean().getId());
				
				pstmt14.setInt(1,  bean.getEmpAddressInfoBean().getPincode());
				pstmt14.setInt(2,  bean.getEmpAddressInfoBean().getId());
				
				
				int count1 = pstmt1.executeUpdate();
				int count2 = pstmt2.executeUpdate();
				int count3= pstmt3.executeUpdate();
				int count4= pstmt4.executeUpdate();
				int count5= pstmt5.executeUpdate();
				int count6= pstmt6.executeUpdate();
				int count7 = pstmt7.executeUpdate();
				int count8= pstmt8.executeUpdate();
				int count9= pstmt9.executeUpdate();
				int count10= pstmt10.executeUpdate();
				int count11= pstmt11.executeUpdate();
				int count12 = pstmt12.executeUpdate();
				int count13 = pstmt13.executeUpdate();
				int count14 = pstmt14.executeUpdate();
				System.out.println("query execution done");
				
				if (count1 > 0 && count2 > 0 && count3 > 0 && count4>0 && 
					count5>0 && count6>0 && count7>0 && count8>0 && count9>0 && count10>0 && count11>0 
					&& count12>0 && count13>0 && count14>0 ) {
					check = true;
					con.commit();
				}//end of if
				}
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean check = false;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try (Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/student_ex1?user=root&password=root")) {
				con.setAutoCommit(false);
				
				try (PreparedStatement pstmt1 = con.prepareStatement("delete from employee_info where id=?  ");
					 PreparedStatement pstmt2 = con.prepareStatement("delete from employee_company_info where id=? ");
					 PreparedStatement pstmt3 = con.prepareStatement("delete from employee_personal_info where id=? ");
					 PreparedStatement pstmt4 = con.prepareStatement("delete from employee_designation_info where id=? ");
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
	}//end of delete method

}//end of class


















