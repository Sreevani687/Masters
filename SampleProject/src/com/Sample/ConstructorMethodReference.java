package com.Sample;

public class ConstructorMethodReference{
	
	public static void main(String[] args) {
		Interf1 i=Employee::new;//className::New
		Employee e2=i.get();
		
	}

	
}
