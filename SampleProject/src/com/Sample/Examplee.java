package com.Sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Examplee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "my name is sreevani";
//		String result = s.chars().mapToObj(c -> (char) c).map(String::valueOf).sorted(Comparator.reverseOrder())
//				.collect(Collectors.joining());
//		System.out.println(result);
//		String result1 = s.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
//
//					java.util.Collections.reverse(list);
//					return list.stream().map(String::valueOf).collect(Collectors.joining()).replaceAll(" ", "");
//				}));
//
//		System.out.println(result1);
		// String result=Arrays.stream(s.split(" ")).map(i->new
		// StringBuilder(i).reverse()+" ").collect(Collectors.joining());

		// System.out.println(result);

		List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> nums2 = Arrays.asList(2, 3, 4,10);
		List<Integer>commonelements=nums1.stream().filter(nums2::contains).collect(Collectors.toList());
		System.out.println(commonelements);
	}

}
