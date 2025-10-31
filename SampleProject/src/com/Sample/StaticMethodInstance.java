package com.Sample;

public class StaticMethodInstance {

	public static void m1() {
		System.out.println("Main instance");

	}

	public static void main(String[] args) {
		Runnable r = StaticMethodInstance::m1;// className::methodName
		Thread t = new Thread(r);
		t.start();

	}

}
