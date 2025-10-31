package com.Sample;

public class MusicPlayer extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Playing song part " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
