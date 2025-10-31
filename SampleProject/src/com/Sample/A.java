package com.Sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class A {
	
	public static void main(String args[]) {
	
	List<String> list=Arrays.asList("the","focx","is","the","claver","vani","sree");
	
	
	long num=IntStream.range(0, list.size()).filter(i->"the".equals(list.get(i))).count();
	System.out.println("num:"+num);
	}

}
