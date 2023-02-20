package com.inheritance;

//the maim advantage of inheritance is code Reusebility

public class Parent {
	
	public static void marry() {
		System.out.println("Priyanka");
	}
	
	

}

 class Child extends Parent{
	 
	 public static void marry() {
			System.out.println("Alia");
		}
	 
	
}

 class App {
	 public static void main(String[] args) {
		
	Parent p1= new Child();
	//Child c1=new Parent();// Child ref cannot use to hold Parent object.
	 p1.marry();
	 
	 Parent p= new Parent();
	 p.marry();
	 Child c= new Child();
	 c.marry();
	
 }
 }