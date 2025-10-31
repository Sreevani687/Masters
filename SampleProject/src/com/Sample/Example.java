package com.Sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example {
	public static void main(String[] args) {
  
		var number = Arrays.asList(1, 2, 5, 6, 7, 9);
		List<String> word = Arrays.asList("bannana", "apple", "cherry", "apple");
		
		List<List<String>> letter = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));
		String s1="vani";
		//String str=s.chars().mapToObj(c->(char)c).map(String::toUpperCase).collect(Collectors.joining());	
		// filter//filter:[apple, apple]
		List<String> result = word.stream().filter(w -> w.startsWith("a")).collect(Collectors.toList());
		// map or Collect//map:[7, 5, 6, 5]
		List<Integer> result1 = word.stream().map(String::length).collect(Collectors.toList());
		List<Integer> map = number.stream().filter(n -> n % 2 == 0).map(n -> n / 2).collect(Collectors.toList());
		// flatMap//Flatt Map:[a, b, c, d]
		List<String> result2 = letter.stream().flatMap(List::stream).collect(Collectors.toList());
		// distinct//distinct:[bannana, apple, cherry]
		List<String> result3 = word.stream().distinct().collect(Collectors.toList());
		// sorted//Sorted:[apple, apple, bannana, cherry]
		List<String> result4 = word.stream().sorted().collect(Collectors.toList());
		// sorted//Sorted reverse order:[cherry, bannana, apple, apple]
		List<String> result5 = word.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		// limit//limit:[1, 2]
		List<Integer> result6 = number.stream().limit(2).collect(Collectors.toList());
		// skip//skip:[5, 6, 7, 9]
		List<Integer> result7 = number.stream().skip(2).collect(Collectors.toList());
		// peek//peek:[BANNANA, APPLE, CHERRY, APPLE]
		List<String> result8 = word.stream().peek(w -> System.out.println("test1:" + word)).map(String::toUpperCase)
				.collect(Collectors.toList());
		// Parallel//parallel:[1, 4, 25, 36, 49, 81]
		List<Integer> result9 = number.stream().parallel().map(i -> i * i).collect(Collectors.toList());
		System.out.println("filter:" + result);
		System.out.println("map:" + result1);
		System.out.println("Flatt Map:" + result2);
		System.out.println("distinct:" + result3);
		System.out.println("Sorted:" + result4);
		System.out.println("Sorted reverse order:" + result5);
		System.out.println("limit:" + result6);
		System.out.println("skip:" + result7);
		System.out.println("peek:" + result8);
		System.out.println("parallel:" + result9);
		// forEach //bannana,apple,cherry,apple
		List<String> result10 = word.stream().collect(Collectors.toList());
		result10.forEach(ss -> System.out.println(s1));
		// forEach order //bannana,apple,cherry,apple
		word.stream().forEachOrdered(ss -> System.out.println(s1));
		// toArray //toArray: [bannana, apple, cherry, apple]

		String[] result11 = word.stream().toArray(String[]::new);
		System.out.println("toArray: " + Arrays.toString(result11));
		// reduce//reduce:30
		Integer result12 = number.stream().reduce(0, Integer::sum);
		System.out.println("reduce:" + result12);
		// find First //findFirst:Optional[1] 
		Optional<Integer> result13 = number.stream().findFirst();
		System.out.println("findFirst:" + result13);
		// find any//findAny:Optional[1]
		Optional<Integer> result14 = number.stream().findAny();
		System.out.println("findAny:" + result14);
		// all Match//All Match:false
		boolean result15 = number.stream().allMatch(n -> n % 2 == 0);
		System.out.println("All Match:" + result15);
		// any Match//Any Match:true
		boolean result16 = number.stream().anyMatch(n -> n % 2 == 0);
		System.out.println("Any Match:" + result16);
		// non Match//non Match:false
		boolean result17 = number.stream().noneMatch(n -> n % 2 == 0);
		System.out.println("non Match:" + result17);
		// count//Count:6
		long result18 = number.stream().count();
		System.out.println("Count:" + result18);
		// Min//min:Optional[1]
		Optional<Integer> result19 = number.stream().min(Integer::compare);
		System.out.println("min:" + result19);
		// max//max:Optional[9]
		Optional<Integer> result20 = number.stream().max(Integer::compare);
		System.out.println("max:" + result20);
		// GroupBy//GroupBy:{5=[apple, apple], 6=[cherry], 7=[bannana]}
		Map<Integer, List<String>> result21 = word.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("GroupBy:" + result21);
		// Sorted //Sorted:[apple, apple, bannana, cherry]
		List<String> result22 = word.stream().sorted((a, b) -> a.compareTo(b)).toList();
		System.out.println("Sorted:" + result22);
		// Sortedreverse:[cherry, bannana, apple, apple]
		List<String> result23 = word.stream().sorted((a, b) -> b.compareTo(a)).toList();
		System.out.println("Sortedreverse:" + result23);
		// sum//30
		Integer num = number.stream().reduce(0, Integer::sum);
		int sum = number.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		// 30
		int sum1 = number.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum1);
		// 4
		int sum2 = IntStream.of(2, 2).sum();
		System.out.println(sum2);

		// convert List to Map//Convert to List to Map:{banana=6, apple=5, cherry=6}

		List<String> words = Arrays.asList("apple", "banana", "cherry");

		Map<String, Integer> result24 = words.stream().collect(Collectors.toMap(w -> w, // key = word
				w -> w.length() // value = length of word
		));
		System.out.println("Convert to List to Map:" + result24);
		// convert list to set//Convert to List to Set:[banana, apple, cherry]

		Set<String> result25 = words.stream().collect(Collectors.toSet());
		System.out.println("Convert to List to Set:" + result25);

		List<Employee> employees = Arrays.asList(new Employee("Alice", 50000,"ECE"), new Employee("Bob", 70000,"CSE"),
				new Employee("Charlie", 60000,"EEE"), new Employee("vani", 70000,"CIVIL"), // duplicate salary
				new Employee("Eve", 55000,"Mech"));
		// max //highestSlary:Optional[Employee [name=Bob, salary=70000.0]]
		Optional<Employee> highestSlary = employees.stream()
				.max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		// min //lowest:Optional[Employee [name=Alice, salary=50000.0]]
		Optional<Employee> lowest = employees.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

		// secondHighest//secondHighest:Optional[Employee [name=Charlie,
		// salary=60000.0]]
		Optional<Employee> secondHighest = employees.stream().distinct()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
		// secondHighest1:Optional[7]
		Optional<Employee> secondHighest1 = employees.stream().distinct()
				.sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).skip(1).findFirst();
		// using map
		Optional<Double> secondHighestDistinct = employees.stream().map(Employee::getSalary).distinct()
				.sorted(Comparator.reverseOrder()).skip(1).findFirst();
		// secondHighest11:Optional[7]
		Optional<Integer> secondHighest11 = number.stream().distinct().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();

		// secondHighest12:[]
		Optional<Integer> secondHighest12 = number.stream().distinct().sorted((a, b) -> b.compareTo(a)).skip(1)
				.findFirst();

		// print duplicates
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> printDuplicateValues = number.stream().filter(i -> !set.add(i)).collect(Collectors.toSet());
		// lowernumber:1
		Integer lowernumber = number.stream().max((a, b) -> (b).compareTo(a)).get();
		// print even number
		List<Integer> evenNumber = number.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> addNumber = number.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		// even:[2, 6]
		List<Integer> even = number.stream().distinct().skip(1).limit(6).filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		// startswithV:[Employee [name=vani, salary=70000.0]]
		List<Employee> startswithV = employees.stream().filter(e -> e.getName().startsWith("v"))
				.collect(Collectors.toList());
		// alphabetic order//alphabetis:[Employee [name=Alice, salary=50000.0], Employee
		// [name=Bob, salary=70000.0], Employee [name=Charlie, salary=60000.0], Employee
		// [name=Eve, salary=55000.0], Employee [name=vani, salary=70000.0]]
		List<Employee> alphabetis = employees.stream()
				.sorted((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName())).collect(Collectors.toList());
		alphabetis.forEach(e -> System.out.println(e.getName()));
		// lengthOfString//lengthOfString:[Employee [name=Alice, salary=50000.0],
		// Employee [name=Charlie, salary=60000.0], Employee [name=vani,
		// salary=70000.0]]
		List<Employee> lengthOfString = employees.stream().filter(e -> e.getName().length() > 3)
				.collect(Collectors.toList());
		System.out.println("highestSlary:" + highestSlary);

		System.out.println("lowest:" + lowest);
		System.out.println("secondHighest:" + secondHighest);
		System.out.println("secondHighest1:" + secondHighest11);
		System.out.println("secondHighest12:" + secondHighest12);
		System.out.println("secondHighest12:" + printDuplicateValues);
		System.out.println("lowernumber:" + lowernumber);
		System.out.println("evenNumber:" + evenNumber);
		System.out.println("addNumber:" + addNumber);
		System.out.println("even:" + even);
		System.out.println("startswithV:" + startswithV);
		System.out.println("alphabetis:" + alphabetis);
		System.out.println("lengthOfString:" + lengthOfString);
		System.out.println("sum:" + sum);
		// print each character count
		String s = "Sreevani";
		// count:{a=1, r=1, S=1, e=2, v=1, i=1, n=1}
		Map<Character, Long> count = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("count:" + count);
		count.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
		// remove duplicates//removeDuplicates:Srevani
		String removeDuplicates = s.chars().distinct().mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());
		System.out.println("removeDuplicates:" + removeDuplicates); 
		// reverse of java 7//reverse:inaveerS
		String reverse = new StringBuilder(s).reverse().toString();
		System.out.println("reverse:" + reverse);
		// reverse of given String java8//reverse1:inaveerS
		String reverse1 = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list);
					return list.stream().map(String::valueOf).collect(Collectors.joining());
				}));
		System.out.println("reverse1:" + reverse1);
		// toUpperCase//employee:[ALICE, BOB, CHARLIE, VANI, EVE]
		List<String> employee = employees.stream().map(e -> e.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println("employee:" + employee);

		List<Student> std = Arrays.asList(new Student(1, "vani", "ECE"), new Student(2, "sree", "EEE"),
				new Student(3, "Tashwin", "CSE"));
//{CSE=[Student [id=3, name=Tashwin, departmentName=CSE]], EEE=[Student [id=2, name=sree, departmentName=EEE]], ECE=[Student [id=1, name=vani, departmentName=ECE]]}

		Map<String, List<Student>> studenrInfo = std.stream()
				.collect(Collectors.groupingBy(Student::getDepartmentName));
//		Map<String,List<String>> studenrInfo1=studenrInfo.entrySet().stream().
//		collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue()));
		System.out.println(studenrInfo);

		List<City> citi = Arrays.asList(new City("Ap", 19), new City("Ap", 12), new City("TL", 20), new City("TL", 14),
				new City("KN", 15), new City("TN", 16));
//[City [name=Ap, temparature=19.0], City [name=TL, temparature=20.0], City [name=KN, temparature=15.0], City [name=TN, temparature=16.0]]

		List<City> citiName = citi.stream().filter(c -> c.getTemparature() >= 15).collect(Collectors.toList());
		System.out.println(citiName);
		// {KN=15.0, TL=14.0, TN=16.0, Ap=12.0}
		Map<String, Double> convertMap = citi.stream()
				.collect(Collectors.toMap(c -> c.getName(), c -> c.getTemparature(), (key1, key2) -> key1));
		System.out.println(convertMap);
		// {KN=1, TL=2, TN=1, Ap=2}
		List<String> s11 = citi.stream().map(City::getName).collect(Collectors.toList());
		System.out.println(s11.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		// AP:[12,19]
		Map<String, List<Double>> s111 = citi.stream().collect(
				Collectors.groupingBy(City::getName, Collectors.mapping(City::getTemparature, Collectors.toList())));
		System.out.println(s1);
		String s1111 = "vani";
		// java 7 //inav
		StringBuilder str = new StringBuilder(s1111).reverse();
		System.out.println(str);
		// java 8//inav
		String st = s1111.chars().mapToObj(c -> (char) c)
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list);
					return list.stream().map(String::valueOf).collect(Collectors.joining());
				}));
		System.out.println(st);
		
	 Map<Boolean,List<Integer>>partion=number.stream().collect(Collectors.partitioningBy(i->i%2==0));
	 System.out.println("partion:"+partion);
	 String alphabeticOrder=s1111.chars().mapToObj(c -> String.valueOf((char) c)).sorted().collect(Collectors.joining());
	 System.out.println("alphabeticOrder:"+alphabeticOrder);
	} 
	

}
