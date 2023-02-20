package java8;

@FunctionalInterface
 public interface FunctionalInterfaceExample {
	
	public void methodOne();
	

}

@FunctionalInterface
 interface B extends FunctionalInterfaceExample{
	 public void methodOne();
	 
	
}

@FunctionalInterface
 interface Addition {
	
	public void sum(int a, int b);
	

}

class Caller{
	
	public static void main(String[] args) {
		
		//B b=()->System.out.println("Lambda Expression for method one");
		//b.methodOne();
		Addition add=(a,c)->System.out.println("Sum:"+(a+c));
		add.sum(6,5);
		
	}
	
}