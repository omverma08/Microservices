package com.code;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
	 List list= new LinkedList();
	 System.out.println(list.size());
	 list.add("One");
	 list.add("two");
	 list.add("four");
	 list.add("five");
	//System.out.println(list);
	list.add(2,"three");
	//System.out.println(list);
	LocalDateTime localDate= LocalDateTime.now();
	System.out.println(localDate);
	
	LocalDate today = LocalDate.now();
	LocalDate birthday = LocalDate.of(1997,05,15);
	Period p = Period.between(birthday,today);
	System.out.println(p);
	}

}
