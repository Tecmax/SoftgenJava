package com.mahesh.Threads;

public class CreateThread extends Thread {
	public void run() {
		System.out.println("My thread is in running state.");
	}

	public static void main(String args[]) {
		CreateThread obj = new CreateThread();
		obj.start();
//		obj.run();
	}
}
