package com.code;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
	
		
		Map m= new HashMap();
		m.put(null,"A");
		m.put("B",null);
		m.put("123",123);
		
		
		
		boolean result=m.containsKey("123");
		//System.out.println("value:"+m.get("B"));
		//System.out.println(result);
		//inserting all value from map
		
		Map<String, String> mapA = new HashMap<>();
		mapA.put("key1", "value1");
		mapA.put("key2", "value2");
		//replace map values
		mapA.put("key3", "value4");
		mapA.replace("key3","value3");

		Map<String, String> mapB = new HashMap<>();
		mapB.putAll(mapA);
		
		Iterator iterator = mapB.keySet().iterator();
		Iterator iterator1=mapB.entrySet().iterator();
		
		while(iterator1.hasNext()){
			Entry<String, String> e  = (Entry<String, String>) iterator1.next();
			 // System.out.println("key:"+e.getKey());
			  //System.out.println("value:"+e.getValue());
			}

		while(iterator.hasNext()){
		  Object key   = iterator.next();
		  //System.out.println("key:"+key);
		  Object value = mapB.get(key);
		  //System.out.println("key:"+value);
		}
		
		//Using a Key Stream
		Map<String, String> map = new HashMap<>();

		map.put("one", "first");
		map.put("two", "second");
		map.put("three", "third");

		Stream<String> stream = map.keySet().stream();
		stream.forEach((value) -> {
		    System.out.println(map.get(value));
		});  
		
		//using values
		

		Iterator<String> itr =map.values().iterator();
	   Collection values= map.values();
	
	//System.out.println(values.stream().findFirst());

		while(itr.hasNext()) {
		    String nextValue = itr.next();
		    //System.out.println(nextValue);
		}  
		
		//Using entrySet
		
		Set<Map.Entry<String, String>> entries = map.entrySet();

		Iterator<Map.Entry<String, String>> iterator2 =
		    entries.iterator();

		while(iterator2.hasNext()) {
		    Map.Entry<String, String> entry = iterator2.next();
		    String key   = entry.getKey();
		    String value = entry.getValue();
		}

		
		//using foreach
		for(Map.Entry<String, String> entry : map.entrySet()){
		    String key = entry.getKey();
		    String value = entry.getValue();
		}
		
		
		//compute()
		String newValue=map.compute("one", (key, value) -> 
	    value == null ? null : 
	        value.toString().toUpperCase());
		//System.out.println(newValue);

	}

}
