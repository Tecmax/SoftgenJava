package com.mahesh.staticmethods;

public class StaticMethods {
	static int i;
	static String s;

	public static void main(String args[]) // Its a Static Method
	{
		StaticMethods obj = new StaticMethods();
		// Non Static variables accessed using object obj
		System.out.println("i:" + obj.i);
		System.out.println("s:" + obj.s);
	}
}
