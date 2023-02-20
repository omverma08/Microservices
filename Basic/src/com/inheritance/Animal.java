package com.inheritance;

public class Animal {

}

class Dog extends Animal{
	
}

class Test{
	public void m1(Animal a) {
		System.out.println("Animal Version");
	}
 public void m1(Dog d) {
		System.out.println("Dog Version");
	}
 
 public static void main(String[] args) {
	Test t=new Test();
	Animal a= new Animal();
	Dog d =new Dog();
	Animal a1= new Dog();
	//t.m1(a1);
	Parent p = new Parent();
	//System.out.println(p.a);
	
}
}
