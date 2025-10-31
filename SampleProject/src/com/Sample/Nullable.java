package com.Sample;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Nullable {
	public static void main(String args[]) {
		//empty
		Optional<String>empty=Optional.empty();
		//of
		Optional<String>of=Optional.of("hello");
		//ofNullable
		Optional<String>ofNullable=Optional.ofNullable(null);
		System.out.println("empty of:"+empty);
		System.out.println("of:"+of);
		System.out.println("ofNullable:"+ofNullable);
		//get
		try {
			System.out.println("Value from nonEmptyOPT:"+of.get());
		}catch(NoSuchElementException e){
			System.out.println("no value prasent");
			
		}
		//isPrasent
		if(of.isPresent()) {
			System.out.println("the value prasent");
		}
		//ifPrasent
		of.ifPresent(value->System.out.println("value is prasent:"+value));
		//ifPresentorElse
		of.ifPresentOrElse(value->System.out.println("value is :"+value),()->System.out.println("value absent"));
		//filter
		Optional<String>filter=of.filter(value->value.length()>3);
		System.out.println("filter:"+filter);
		//map
		Optional<Integer>map=of.map(String::length);
		System.out.println("map:"+map);
		
		//flatmap
		Optional<String>faltmMap=of.flatMap(value->Optional.of(value.toUpperCase()));
		System.out.println("flatMap:"+faltmMap);
		//else
		String elseptional=of.orElse("Default value");
		System.out.println("elseptional:"+elseptional);
		//orElseGet
		String orElseGet=of.orElseGet(()->"Default value");
		System.out.println("orElseGet:"+orElseGet);
		//orElseThrow
		String orElseThrow=of.orElseThrow(()->new IllegalArgumentException("value is absent"));
		System.out.println("orElseThrow:"+orElseGet);
		
		
	}

}
