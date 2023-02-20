package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class IteratorExample {

	public static void main(String[] args) {


	List<String> list = new ArrayList<>();
	list.add("one");
	list.add("two");
	list.add("three");

	Iterator<String> iterator = list.iterator();

	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		
	}

	Set<String> set = new HashSet<>();
	set.add("four");
	set.add("five");
	set.add("six");

	Iterator<String> iterator2 = set.iterator();
	
	while(iterator2.hasNext()) {
		System.out.println(iterator2.next());
		
	}

	List<String> list2 = new ArrayList<>();
	list2.add("Jane");
	list2.add("Heidi");
	list2.add("Hannah");

	Iterator<String> iterator3 = list2.iterator();
	        
	iterator3.forEachRemaining((element) -> {
	    System.out.println(element);
	});
	
	
	

	
}
	
	
	
}
