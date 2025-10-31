package com.Sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	 public static void main(String[] args) {
	      List<Integer>numberList=Arrays.asList(1,67,89,45,46,34,48,0,2,0,4,288);
	     List<Integer>evenumber= numberList.stream().filter(i->i%2==0).map(n->n/2).collect(Collectors.toList());
	     int evenumbers= numberList.stream().mapToInt(Integer::intValue).sum();
	      System.out.println("evenumber:"+evenumber);
	      System.out.println("evenumbers:"+evenumbers);

	  }
}

