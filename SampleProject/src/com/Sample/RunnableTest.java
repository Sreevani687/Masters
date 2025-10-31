package com.Sample;

public class RunnableTest {

	public static void main(String args[]) {
		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Main thread");
			}
		};

		Thread t = new Thread(r);
		for (int i = 0; i <= 10; i++) {
			System.out.println("Chails thread");
		}
	}
}
