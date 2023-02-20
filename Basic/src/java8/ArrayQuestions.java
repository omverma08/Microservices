package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayQuestions {

	public static void main(String[] args) {
	    ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,4,5,3,43,21,44,56,92,11,3,5));
		
		System.out.println(numbers);
		List<Integer> even = numbers.stream().filter(i -> i%2==0).collect(Collectors.toList());
		Double count = (double) numbers.stream().filter(i -> i%2==0).count();
		
		//ArrayList<Integer> evenNumbers=listOfNumbers.stream().filter(num->num%2==0).collect(Collectors.toList());
		ArrayList<Integer> newNos=(ArrayList<Integer>) numbers.stream().map(num->num*2).collect(Collectors.toList());
		
		List<Integer> sorted=numbers.stream().sorted((num1,num2)-> -num2.compareTo(num1)).collect(Collectors.toList());
		
		int minNo=numbers.stream().min((num1,num2)->num1.compareTo(num2)).get();
		
		int maxNo=numbers.stream().max((num1,num2)->num1.compareTo(num2)).get();
			
		numbers.stream().filter(i->i>50).forEach(System.out::println);
		
		Integer [] arrays=numbers.stream().toArray(Integer[]::new);
		
		

		
		//System.out.println("Test Optional:"+numbers.stream().filter(i->i>111));
		
		//System.out.println(even);
		//System.out.println(newNos);
		//System.out.println("Sorted List: "+sorted);
		//System.out.println("Smallest NO: "+minNo);
		//System.out.println("Largest NO: "+maxNo);
		//System.out.println("Arrays: "+arrays);
		
		
		ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(1,2,4,3,5,33,32,54,22,9));
		
		ArrayList<String> names= new ArrayList<String>(Arrays.asList("Om","raj","Kush","Luv"));
		
		
		List evenList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		//System.out.println("Even list:"+evenList);
		
		List newNames=names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		newNames.forEach(System.out::println);

	}
	

}
