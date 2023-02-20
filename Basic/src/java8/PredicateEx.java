package java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args) {
		Predicate<Integer> p=i->i>10;
		Predicate<String> p1=i->i.length()>4;
		
		Function<String,Integer> fun= s->s.length();
		System.out.println("Value:"+p.test(0));
		System.out.println("name length:"+p1.test("omprakash"));
		
		
		Predicate<Integer> pre=i->i<4;
		Boolean b=pre.test(2);
		System.out.println("b:"+fun.apply("verma"));
		
	}

}
