package com.ExecptionHandling;

import java.io.File;

public class Employee {
	
	String name="Jonhy Deep";
	final static String address="New York";
	

	public static void main(String[] args) {
		try {
			calculateSalary();
			retreiveFiles();
		} catch (Exception e) {
			//System.out.println("Error:Divide by Zero");
			e.printStackTrace();
		}
		finally {
			 
			
			 
		}

	}
	
	public static String calculateSalary() throws Exception {
		int amount=30000;
		int per=0;
		int c=30000/1;
		return null;
	}
	
	public static String retreiveFiles() {
		
		throw new ArithmeticException("/divide by one");
		
	}

}
