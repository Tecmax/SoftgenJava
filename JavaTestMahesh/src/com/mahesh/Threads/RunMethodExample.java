package com.mahesh.Threads;

public class RunMethodExample implements Runnable {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		Thread th1 = new Thread(new RunMethodExample(), "th1");
		Thread th2 = new Thread(new RunMethodExample(), "th2");
		th1.run();
		th2.run();
	}
}