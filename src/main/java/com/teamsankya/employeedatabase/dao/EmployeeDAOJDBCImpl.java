package com.teamsankya.employeedatabase.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;

import com.teamsankya.employeedatabase.dto.EmployeeAddressInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeInfoBean;
import com.teamsankya.employeedatabase.dto.EmployeeMasterBean;
import com.teamsankya.employeedatabase.dto.EmployeePersonalInfoBean;
import com.teamsankya.employeedatabase.factory.GenerateRandomId;
import com.teamsankya.employeedatabase.dto.CurrentCompanyInfoBean;
import com.teamsankya.employeedatabase.dto.PreviousCompanyInfoBean;
public class EmployeeDAOJDBCImpl implements EmployeeDAO {
	final static Logger logger = Logger.getLogger(EmployeeDAOJDBCImpl.class);
    private String idGenerator() {
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
    private String uniqueId()
    {
    	
    	EmployeeMasterBean bean = null;
    	String id = null;
    	do
    	{
    	id= idGenerator();
    	bean = searchEmployee(id);
    	}
    	while(bean != null);
		return id;
    }
	@Override
	public String createEmployee(EmployeeMasterBean bean)  {
		
    //String id=GenerateRandomId.randomEmployeeIdGenerator(8);
	//to generate random id from class present in factory pkg in employeedatabase project
		String id = uniqueId();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			logger.info("driver loaded");
			try (Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee_db?user=root&password=root");
					PreparedStatement pstmt1 = con.prepareStatement("insert into employee_info values(?,?,?)");
					PreparedStatement pstmt2 = con.prepareStatement("insert into previous_company_info values(?,?,?)");
					PreparedStatement pstmt3 = con.prepareStatement("insert into employee_personal_info values(?,?,?,?)");
					PreparedStatement pstmt4 = con.prepareStatement("insert into current_company_info values(?,?,?,?)");
					PreparedStatement pstmt5 = con.prepareStatement("insert into employee_address_info values(?,?,?,?.?)");){
				
				logger.info("connection done");
				
				
				
				pstmt1.setString(1,id);
				pstmt1.setString(2,bean.getEmpInfoBean().getFirstname());
				pstmt1.setString(3,bean.getEmpInfoBean().getLastname());
			
				logger.info("setting values1 done");
				
				pstmt2.setString(1,id);
				pstmt2.setInt(6, bean.getPreviousCompanyInfoBean().getExperience());
				pstmt2.setString(2, bean.getPreviousCompanyInfoBean().getLastCompanyName());
				
				logger.info("setting values2 done");	
				
				pstmt3.setString(1,id);
				pstmt3.setString(2,bean.getEmpPersonalInfoBean().getDateOfBirth());
				pstmt3.setLong(3,bean.getEmpPersonalInfoBean().getPhNumber());
				pstmt3.setString(4,bean.getEmpPersonalInfoBean().getEmailId());
				logger.info("setting values3 done");
				
				pstmt4.setString(1,id);
				pstmt4.setString(2,bean.getCurrentCompanyInfoBean().getDateOfJoining());
				pstmt4.setString(3,bean.getCurrentCompanyInfoBean().getDateOfJoining());
				pstmt4.setInt(4,bean.getCurrentCompanyInfoBean().getCostToCompany());
				logger.info("setting values4 done");
				
				pstmt5.setString(1,id);
				pstmt5.setString(2,bean.getEmpAddressInfoBean().getAddress1());
				pstmt5.setString(3,bean.getEmpAddressInfoBean().getAddress2());
				pstmt5.setString(4,bean.getEmpAddressInfoBean().getCity());
				pstmt5.setInt(4,bean.getEmpAddressInfoBean().getPincode());
				logger.info("setting values5 done");
				
				pstmt1.execute();
				pstmt2.execute();
				pstmt3.execute();
				logger.info("query execution done");
				return id;
				}
			}
		catch (Exception e) {
			// TODO: handle exception
		}
		return id;
	}//end of createEmployee method
	

	@Override
	public EmployeeMasterBean searchEmployee(String empId) {
		
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
					pstmt.setString(1,empId);

					try (ResultSet rs = pstmt.executeQuery()) {
						if (rs.next()) {
							
							
							
							logger.info("student found table1");
							data.getEmpInfoBean().setId(rs.getString("id"));
							data.getEmpInfoBean().setFirstname(rs.getString("firstname"));
							data.getEmpInfoBean().setLastname(rs.getString("lastname"));
							
							data.getPreviousCompanyInfoBean().setExperience(rs.getInt("experience"));
							data.getPreviousCompanyInfoBean().setLastCompanyName(rs.getString("last_company_name"));
                          
                            data.getEmpPersonalInfoBean().setDateOfBirth(rs.getString("date_of_birth"));
							data.getEmpPersonalInfoBean().setPhNumber(rs.getLong("phone_no"));
							data.getEmpPersonalInfoBean().setEmailId(rs.getString("email_id"));
							
							data.getCurrentCompanyInfoBean().setDateOfJoining(rs.getString("date_of_joining"));
							data.getCurrentCompanyInfoBean().setDesignation(rs.getString("designation"));
							data.getCurrentCompanyInfoBean().setCostToCompany(rs.getInt("cost_to_company"));
							
							data.getEmpAddressInfoBean().setAddress1(rs.getString("address1"));
							data.getEmpAddressInfoBean().setAddress2(rs.getString("address2"));
							data.getEmpAddressInfoBean().setCity(rs.getString("city"));
							data.getEmpAddressInfoBean().setPincode(rs.getInt("pincode"));
							
							logger.info("values are set");
							
						}//end of if block
					}			
				}
				}
	} catch (Exception e) {
			e.printStackTrace();
		}

		return data;
	}//end of searchEmployee method

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
							
							logger.info("student found table1");
							data.getEmpInfoBean().setId(rs.getString("id"));
							data.getEmpInfoBean().setFirstname(rs.getString("firstname"));
							data.getEmpInfoBean().setLastname(rs.getString("lastname"));
							
							data.getPreviousCompanyInfoBean().setExperience(rs.getInt("experience"));
							data.getPreviousCompanyInfoBean().setLastCompanyName(rs.getString("last_company_name"));
                          
                            data.getEmpPersonalInfoBean().setDateOfBirth(rs.getString("date_of_birth"));
							data.getEmpPersonalInfoBean().setPhNumber(rs.getInt("phone_no"));
				 			data.getEmpPersonalInfoBean().setEmailId(rs.getString("email_id"));
							
							data.getCurrentCompanyInfoBean().setDateOfJoining(rs.getString("date_of_joining"));
							data.getCurrentCompanyInfoBean().setDesignation(rs.getString("designation"));
							data.getCurrentCompanyInfoBean().setCostToCompany(rs.getInt("cost_to_company"));
							
							data.getEmpAddressInfoBean().setAddress1(rs.getString("address1"));
							data.getEmpAddressInfoBean().setAddress2(rs.getString("address2"));
							data.getEmpAddressInfoBean().setCity(rs.getString("city"));
							data.getEmpAddressInfoBean().setPincode(rs.getInt("pincode"));
							list.add(data);
							logger.info("values are set");
							
						}//end of while
					}
			}
		}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		return list;
	}//end of searchAllEmployees method

	@Override
	public boolean updateEmployee(EmployeeMasterBean bean)
	{ 
		
		boolean check = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			logger.info("driver loaded");
			try (Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee_db?user=root&password=root");
					PreparedStatement pstmt1 = con.prepareStatement("update employee_info set firstname=?,lastname=?  where id=?");
					PreparedStatement pstmt2 = con.prepareStatement("update previous_company_info set experience=?,last_company_name=? where id=?");
					PreparedStatement pstmt3 = con.prepareStatement("update employee_personal_info set date_of_birth=?,phone_no=?,email_id  =? where id=?");
					PreparedStatement pstmt4= con.prepareStatement("update current_company_info_info set  date_of_joining=?,designation=?,cost_to_company=? where id=?");
					PreparedStatement pstmt5= con.prepareStatement("update employee_address_info set address1=?,address2=?,city=?,pincode=?  where id=?");){
			
				logger.info("connection done");
				pstmt1.setString(1, bean.getEmpInfoBean().getFirstname());
				pstmt1.setString(2,bean.getEmpInfoBean().getLastname());
				pstmt1.setString(3,bean.getEmpInfoBean().getId());
				logger.info("setting values1 done");
				
				
				pstmt2.setInt(1,bean.getPreviousCompanyInfoBean().getExperience());
				pstmt2.setString(2,bean.getPreviousCompanyInfoBean().getLastCompanyName());
				pstmt2.setString(3,bean.getPreviousCompanyInfoBean().getId());
				logger.info("setting values2 done");	
				
				pstmt3.setString(1,bean.getEmpPersonalInfoBean().getDateOfBirth());
				pstmt3.setLong(2,bean.getEmpPersonalInfoBean().getPhNumber());
				pstmt3.setString(3,bean.getEmpPersonalInfoBean().getEmailId());
				pstmt3.setString(4,bean.getEmpPersonalInfoBean().getId());
				logger.info("setting values3 done");
				
				pstmt4.setString(1,bean.getCurrentCompanyInfoBean().getDateOfJoining());
				pstmt4.setString(2,bean.getCurrentCompanyInfoBean().getDesignation());
				pstmt4.setInt(3,bean.getCurrentCompanyInfoBean().getCostToCompany());
				pstmt4.setString(4,bean.getCurrentCompanyInfoBean().getId());
				logger.info("setting values4 done");
				
				pstmt5.setString(1,bean.getEmpAddressInfoBean().getAddress1());
				pstmt5.setString(2,bean.getEmpAddressInfoBean().getAddress2());
				pstmt5.setString(3,bean.getEmpAddressInfoBean().getCity());
				pstmt5.setInt(4,bean.getEmpAddressInfoBean().getPincode());
				pstmt5.setString(5,bean.getEmpAddressInfoBean().getId());
				logger.info("setting values5 done");
				
				
				
				
				int count1 = pstmt1.executeUpdate();
				int count2 = pstmt2.executeUpdate();
				int count3= pstmt3.executeUpdate();
				int count4= pstmt4.executeUpdate();
				int count5= pstmt5.executeUpdate();
				
				logger.info("query execution done");
				logger.info("hsdfbshfjsdhkj");
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
	}//end of updateEmployee method

	@Override
	public boolean deleteEmployee(String empId) {
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

					pstmt1.setString(1, empId);
					pstmt2.setString(1, empId);
					pstmt3.setString(1, empId);
					pstmt4.setString(1, empId);
					pstmt5.setString(1, empId);
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
	}//end of deleteEmployee method
	
	

}//end of class

