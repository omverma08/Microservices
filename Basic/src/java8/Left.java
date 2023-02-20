package java8;

 interface Left {
	 

	
	 public static void staticMethod() {
		 System.out.println("Inside static method");
	 }
	 
	default void m1() {
		System.out.println("Left Default Method");
	}
}

 interface Right {

	default void m1() {
		System.out.println("Right Default Method");
	}
}
 
 class Side implements Left,Right{

	@Override
	public void m1() {
		Left.super.m1();
		System.out.println("side class method");
	}
	
	public static void main(String[] args) {
		 Side side= new Side();
		 side.m1();
	}
	
	
	
	
	
	
	 
 }
 
 