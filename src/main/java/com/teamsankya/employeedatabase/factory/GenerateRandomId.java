package com.teamsankya.employeedatabase.factory;
///Program to generate random id
import java.util.ArrayList;

public class GenerateRandomId {

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	static String emp;
	private static int size;
	private static ArrayList<String> storeEmployeeId = new ArrayList<String>();
	
	

	public static String randomEmployeeIdGenerator(int count) {
		size=count;
		StringBuilder builder = new StringBuilder();

		while (count-- != 0) 
		{
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));

		}
		emp = builder.toString();
		System.out.println("emp :"+ emp);
//		checkId(emp);
		
		return emp;
	}
	
//	private static  void checkId(String id)
//	{
//		if (storeEmployeeId.contains(id))
//		{
//			randomEmployeeIdGenerator(size);
//		} 
//		else 
//		{
//			storeEmployeeId.add(id);
//		}
//		
//		
//		
//	}

//	public static void main(String[] args) {
//		String id=GenerateRandomId.randomEmployeeIdGenerator(8);
//		System.out.println("id :" + id);
////		System.out.println("the array elemets are:");
////		for (int i = 0; i <storeEmployeeId.size() ; i++)
////		{
////			System.out.println(storeEmployeeId.get(i));
////			
////		}
//
//	}

}

