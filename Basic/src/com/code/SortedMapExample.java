package com.code;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap sortedMap = new TreeMap();

		sortedMap.put("a", "one");
		sortedMap.put("d", "four");
		sortedMap.put("b", "two");
		sortedMap.put("c", "three");
		
		

		//Iterator iterator = sortedMap.keySet().iterator();
		Iterator iterator=((TreeMap) sortedMap).descendingKeySet().iterator();

		while(iterator.hasNext()) {
		    String key   = (String) iterator.next();
		    System.out.println(key);

		    String value = (String) sortedMap.get(key);
		    System.out.println(value);
		}
		
		
		SortedMap sortedMap2 = new TreeMap();

		sortedMap2.put("a", "1");
		sortedMap2.put("c", "3");
		sortedMap2.put("e", "5");
		sortedMap2.put("d", "4");
		sortedMap2.put("b", "2");

		SortedMap headMap = sortedMap2.headMap("c");

        SortedMap tailMap = sortedMap2.tailMap("c");
        
        SortedMap subMap = sortedMap.subMap("b", "e");

        System.out.println(subMap);

		System.out.println(headMap);
		System.out.println(tailMap);

	}

}
