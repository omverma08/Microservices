package com.package2;

import com.package1.Account;

public class User {

	public static void main(String[] args) {
		User user= new User();
		user.m1();
		
	}
	
	private void m1() {
		Account account=new Account();
		account.setAccount(12.23);
		System.out.println(account.getAccount());
		
		
	}
	
}
