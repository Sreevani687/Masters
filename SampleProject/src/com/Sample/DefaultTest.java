package com.Sample;

public class DefaultTest implements Interf {
	// public static void main(String[] args) {
//	@Override
//	public void m1() {
//		System.out.println("Default Class11");
//	}
	public static void main(String[] args) {
		Interf d = new DefaultTest();
		d.m1();
		Interf.m2();
	}
}
