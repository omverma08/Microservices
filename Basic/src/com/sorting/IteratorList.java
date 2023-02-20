package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorList {
	
	public static void main(String[] args) {
		 
		ArrayList list= new ArrayList<String>(); 
		list.add("One");
		list.add("two");
		list.add("three");
		Collections.shuffle(list);
		Iterator itr=list.iterator();
		CustomIterator<String> listIterator= new CustomIterator<>(list);
		
		
		
		while(listIterator.hasNext()){
			
			String numbers=(String) listIterator.next();
			
			//modification during iteratoring
			
			System.out.println(numbers);
			
		}
		
		
	}

}
