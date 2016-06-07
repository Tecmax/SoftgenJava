package com.mahesh.Threads;

public class MultithreadingDemo implements Runnable {
	public void run() {
		System.out.println("My thread is in running state.");
	}
	public void start() {
		System.out.println("My thread is in fbdh state.");
	}

	public static void main(String args[]) {
		MultithreadingDemo obj = new MultithreadingDemo();
		obj.start();
		Thread tobj = new Thread(obj);
		tobj.start();
		tobj.start();
	}
}
