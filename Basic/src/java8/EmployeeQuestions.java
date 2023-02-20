package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeQuestions {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		

		// employee By Employee Title
		
		 Map<String, List<Employee>> employees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		// Avg salary
		
		 double avgSalary = employeeList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
		// employeeList.stream().map(Employee::getSalary).

		// find by name
		List<Employee> location = employeeList.stream().filter(emp -> emp.getName().equals("Sanvi Pandey"))
				.collect(Collectors.toList());

		// No of employee via gender
		Map<String, Long> NoOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		// NO of deparment
		List<String> NoOfDeparments = employeeList.stream().map(Employee::getDepartment).distinct()
				.collect(Collectors.toList());

		// Avg age of male and female

		Map<String, Double> AvgAgeOfMaleAndFemaleEmployee = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		// HighestPaid Employee

		Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();

		// employees who have joined after 2015?
		List<String> collect = employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015).map(Employee::getName)
				.collect(Collectors.toList());

		// Count the number of employees in each department?
		Map<String, Long> employeeCountByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

		for (Entry<String, Long> entry : entrySet) {
			//System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Avg salary of each department
		Map<String, Double> avgSalaryOfDepartments = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		Set<Entry<String, Double>> salaryEntrySet = avgSalaryOfDepartments.entrySet();
		

		for (Entry<String, Double> entry : salaryEntrySet) {
			//System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// youngest Male Employee In Product Development
		Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream()
				.filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
				.min(Comparator.comparingInt(Employee::getAge));

		Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

		// most working experience in the organization
		Optional<Employee> seniorMostEmployeeWrapper = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

		// 2nd approch
		Optional<Employee> seniorMostEmployeeWrapper1 = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining)));

		Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
		
		
		Optional<Employee> emp3 = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary).reversed()));

		Employee seniorMostEmployee3 = seniorMostEmployeeWrapper.get();

		// No of female in sales and marketing

		// No of female in sales and marketing

		Map<String, Long> countMaleFemaleEmployeesInSalesMarketing = employeeList.stream()
				.filter(e -> e.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		// all employees in each department
		Map<String, List<Employee>> employeeListByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String, List<Employee>>> entrySet2 = employeeListByDepartment.entrySet();

		// 2nd highest salary
		Optional emp = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1)
				.findFirst();
		
		
		System.out.println(emp.get());

		// employees who are younger or equal to 25 years
		Map<Boolean, List<Employee>> partitionEmployeesByAge = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		// first 3 employee highest salary
		Stream<Employee> limit = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3);

		
		 Map<String, Optional<Employee>> empWithMaxSalaryDeptWise = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
						
						

		empWithMaxSalaryDeptWise.entrySet()
				.forEach(entry -> System.out.println(entry.getKey() + "--" + entry.getValue()));
		
		
		//System.out.println(emp.get());

		// System.out.println("Employee By Employee Title:"+employees);

		// System.out.println("location:"+location);

		// System.out.println("AVg Salary:"+avgSalary);

		// System.out.println("NoOfMaleAndFemaleEmployees:"+NoOfMaleAndFemaleEmployees);

		// System.out.println("NoOfDeparments:"+NoOfDeparments);

		// System.out.println("AvgAgeOfMaleAndFemaleEmployee:"+AvgAgeOfMaleAndFemaleEmployee);
		

	}

}
