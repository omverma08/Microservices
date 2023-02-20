package java8;

import java.util.function.Function;

public class FuncationEx {
	public static void main(String[] args) {
		Function<String,Integer> f= i->i.length();
		System.out.println(f.apply("Omprakash"));
	}
	

}
