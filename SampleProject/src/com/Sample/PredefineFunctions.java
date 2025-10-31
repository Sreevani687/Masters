package com.Sample;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefineFunctions {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(2));
		System.out.println(p.test(3));
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(2));
		Consumer<String> c = s -> System.out.println(s);
		c.accept("dyrga");
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}

}
