package com.Sample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
	public static void main(String args[]) {
		String s = "Sreevani";
		Integer[] a = { 9, 0, 2, 8, 5, 9, 5, 2, 3 };
		Map<Character, Long> map = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("map:" + map);
		map.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

		String removeduplicate = s.chars().distinct().mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());
		System.out.println("removeduplicate:" + removeduplicate);
		String reverse = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list);
					return list.stream().map(String::valueOf).collect(Collectors.joining());

				}));
		System.out.println("reverse:" + reverse);
		String capital = Optional.ofNullable(s).map(String::toUpperCase).orElse("");
		System.out.println("capital:" + capital);

		Function<String, String> toUpper = s1 -> (s1 != null) ? s.toUpperCase() : "";
		String result = toUpper.apply(s);
		System.out.println("result:" + result);
		// Find the first non-repeating character in a String using Java 8

		String s1 = "javajavahelloworld";
		Optional<Character> firstNonRepeating = s1.chars() // IntStream of char values
				.mapToObj(c -> (char) c) // Convert int to Character
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, // Maintain insertion order
						Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1) // Only non-repeating
				.map(Map.Entry::getKey).findFirst(); //

		System.out.println("firstNonRepeating:" + firstNonRepeating);
		
		//find the list of employee max salary of each department
		List<Employee> employees = Arrays.asList(new Employee("Alice", 50000,"ECE"), new Employee("Bob", 20000,"EEE"),
				new Employee("Charlie", 60000,"CSE"), new Employee("vani", 70000,"EEEE"), // duplicate salary
				new Employee("Eve", 55000,"MECH"));
		
		Optional<Employee> salary=employees.stream().max((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()));
		System.out.println("salary:" + salary);
		Map<String, List<Employee>> se=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("se:" + se);
		Map<String, List<Employee>> se1=employees.stream().
				filter(e->e.getSalary()>30000).collect(Collectors.groupingBy(Employee::getName));
		System.out.println("se:" + se1);
		
		String name="vani";
		Object names=name.chars().mapToObj(c->(char)c).collect(Collectors.collectingAndThen(Collectors.toList(), list->{
			Collections.reverse(list);
			return list.stream().map(String::valueOf).collect(Collectors.joining());
		}));
		System.out.println("se:" + names);
		 String names1="My name is vani";
		String g =names1.chars().mapToObj(c->(char)c).collect(Collectors.collectingAndThen(Collectors.toList(), list->{
			 Collections.reverse(list);
			 return list.stream().map(String::valueOf).collect(Collectors.joining());
		 }));
		 System.out.println("se:" + names1);
		 
		 
	}

}
