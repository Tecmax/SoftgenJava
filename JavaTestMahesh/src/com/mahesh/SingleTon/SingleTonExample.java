package com.mahesh.SingleTon;

public class SingleTonExample {
	private static SingleTonExample myObj;

	/**
	 * Create private constructor
	 */
	private SingleTonExample() {

	}

	/**
	 * Create a static method to get instance.
	 */
	public static SingleTonExample getInstance() {
		if (myObj == null) {
			myObj = new SingleTonExample();
		}
		return myObj;
	}

	public void getSomeThing() {
		// do something here
		System.out.println("I am here....");
	}

	public static void main(String a[]) {
		SingleTonExample st = SingleTonExample.getInstance();
		st.getSomeThing();
	}
}
