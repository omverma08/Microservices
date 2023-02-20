package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class App {

	public static void main(String[] args) {
		
        
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(121, "Akash kambli"));
		employees.add(new Employee(192, "Deepak Yadav"));
		employees.add(new Employee(321, "Avinash Rathod"));
		employees.add(new Employee(332, "Ravindra Gupta"));
		employees.add(new Employee(112, "Raviprakash Tiwari"));
		employees.add(new Employee(321, "shivam Pandey"));
		employees.add(new Employee(892, "shashank Dubey"));
		employees.add(new Employee(342, "Pankaj Yadav"));
		employees.add(new Employee(122, "Akash kambli"));
		
		Collections.sort(employees,new SortedById());
		System.out.println(employees);

		System.out.println("=============== Custom Sorting ===============");

		Collections.sort(employees, new SortedByName());
		System.out.println(employees);

		//Natural sorting by TreeSet
		TreeSet<String> names = new TreeSet<String>();

		names.add("avinash");
		names.add("akash");
		
		System.out.println(names);
		System.out.println("===============================================");
		
		Map<Integer, List<Employee>> emp = employees.stream().collect(Collectors.groupingBy(Employee::getId));
		System.out.println(emp);
		

	}

}

class SortedById implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getId() - e2.getId();
	}

}

class SortedByName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName());
	}

}
