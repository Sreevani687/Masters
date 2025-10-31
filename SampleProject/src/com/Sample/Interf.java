package com.Sample;

public interface Interf {

	default void m1() {
		System.out.println("Default Class");
	}
	static void m2() {
		System.out.println("Static Class");
	}
	
}
