 package com.Sample;

public class InstanceMethodReference {
	
	public static void main(String[] args) {
		Employee e=new Employee();
		Runnable r=()->System.out.print(e.getName()) ;
		Runnable r1=e::getName;//objectReference::methodName
		r.run();
		r1.run();
	}

}
