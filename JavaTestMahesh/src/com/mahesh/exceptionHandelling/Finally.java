package com.mahesh.exceptionHandelling;

public class Finally {
	public static int myMethod() {
		try {
			// try block
			System.out.println("Inside TRy block");
			return 750;
		} finally {
			// finally
			System.out.println("Inside Finally block");
			return 30;
		}
	}

	public static void main(String args[]) {
		System.out.println(Finally.myMethod());
	}
}
