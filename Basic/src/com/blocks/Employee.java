package com.blocks;

public class Employee {
	
	String name;
	String id;
	
	static {
		System.out.println("static block");
	}
	 Employee(String name,String id){
			this.name=name;
			this.id=id;
		}
	 
	  {
		 System.out.println("instace block");
	 }
	 
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}


	public static void main(String[] args) {
		Employee emp1=new Employee("Omprakash", "5343507");
		System.out.println(emp1);
	}
	
	
	 
}
