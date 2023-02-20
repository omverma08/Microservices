package com.polymorphism;

public class Parent {
	public String marry()  {
		System.out.println("Priyanka");
		return null;
	}
	public void property() {
		System.out.println("Gold+land+house");
	}
	private String marraigeLocation() {
		System.out.println("village");
		return null;
	}
	final String Dress() {
		System.out.println("formal");
		return null;
	}
	public String relative() {
		System.out.println("formal");
		return null;
	}


}
class Child extends Parent{
	public String marry()  {
		System.out.println("Kareena");
		return null;
	}
	//public abstract String relative();
	
}
class App{
	public static void main(String[] args) {
		Parent p=new Parent();
		Child c= new Child();
		Parent p2= new Child();
		p2.marry();
		p2.Dress();
		
	}
}
