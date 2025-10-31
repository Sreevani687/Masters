package com.Sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Partions {

	public static void main(String[] args) {
		// Partioning By
		List<String> names = Arrays.asList("java", "python", "c", "c++", "SAP");
		Map<Boolean, List<String>> list1 = names.stream().collect(Collectors.partitioningBy(s1 -> s1.length() <= 3));
		List<String> shortString = list1.get(true);
		List<String> longShart = list1.get(false);
		System.out.println(shortString);
		System.out.println(longShart);

		Integer[] a = { 9, 0, 2, 8, 5, 9, 5, 2, 3 };// frequency of leters
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> dup = Arrays.stream(a).filter(i -> !set.add(i)).collect(Collectors.toSet());
//		  Set<Integer> duplicates = Arrays.stream(a)
//		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//		            .entrySet().stream()
//		            .filter(e -> e.getValue() > 1)
//		            .map(Map.Entry::getKey)  
//		            .collect(Collectors.toSet());
//		        System.out.println("Duplicate values: " + duplicates);
		System.out.println("Duplicate values: " + dup);
		int[] c = { 3, 5, 8, 9 };
		int[] d = { 8, 3, 0, 1 };

		List<Integer> combined = Stream.concat(Arrays.stream(c).boxed(), Arrays.stream(d).boxed()).sorted()
				.collect(Collectors.toList());

		System.out.println("Combined list: " + combined);

		List<Integer> result = Stream
				.concat(Arrays.stream(c).boxed().filter(i -> Arrays.stream(d).noneMatch(j -> j == i)),
						Arrays.stream(d).boxed().filter(i -> Arrays.stream(c).noneMatch(j -> j == i)))
				.collect(Collectors.toList());

		System.out.println(result); // Output: [5, 9, 0, 1]

		List<String> n = Arrays.asList("apple", "apricot", "bannana", "application", "berry", "appetrizer");
		n.stream().filter(word -> word.startsWith("app")).forEach(System.out::println);
	}
}
