package com.interf;

import java.io.Serializable;


public interface Interf1  extends Serializable{
	
	public boolean m1();
	public int m1(int a);
	

}
class A implements Interf1{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean m1() {
		System.out.println("blank");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int m1(int a) {
		// TODO Auto-generated method stub
		System.out.println("int a");
		return 0;
	}
	
	
}
class App{
	public static void main(String[] args) {
		Interf1 a = new A();
		a.m1();
		System.out.println(a.getClass());
	}
}