package java8;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
 
// using Collectors.toMap() and Math::addExact
public class FindDuplicateCountUsingCollectorsToMap1 {
 
    public static void main(String[] args) {
 
        // 1. list of Strings
        List<String> companies = new ArrayList<String>();
 
 
        // 1.1 add string elements to List
        companies.add("Meta");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Netflix");
        companies.add("Meta"); // duplicate
        companies.add("Google");
        companies.add("Apple"); // duplicate
 
 
        // 1.2 print original List to console
        System.out.println("1. Original List with duplicates : \n");
        companies.forEach(System.out::println);
 
 
        // 2. get duplicate count using Map
        Map<String, Integer> duplicateCountMap = companies
                .stream()
                .collect(
                        Collectors.toMap(Function.identity(), company -> 1, Math::addExact)
                        );
 
 
        // 2.1 print Map for duplicate count
        System.out.println("\n2. Map with Key and its duplicate count : \n");
        duplicateCountMap.forEach(
                (key, value) -> System.out.println("Key : " + key + "\t Count : " + value)
                );
    
    
  

    // 4. get duplicate count using Map
    Map<String, Long> duplicateCount = companies
            .stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


    // 4.1 print Map for duplicate count
    System.out.println("\n4. Map with Key and its duplicate count : \n");
    duplicateCount.forEach(
            (key, value) -> System.out.println("Key : " + key + "\t Count : " + value)
            );
}
}