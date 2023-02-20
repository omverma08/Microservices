package java8;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		
		String[] name={"omprakash","omkar","verma"};
		List<String> asList = Arrays.asList(name);
		for(String names:asList) {
			if(names.startsWith("o")) {
				System.out.println(names);
			}
		
		}
	}
	
	
	

}
