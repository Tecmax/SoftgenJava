package com.mahesh.exceptionHandelling;

public class TestFinally {
	
	public static int myTest() {
		try {
			// try block
			System.out.println("Inside TRy block");
			return 40;
		} finally {
			// finally
			System.out.println("Inside Finally block");
			return 20;
		}
	}
	public static void main(String args[]) {
		System.out.println(TestFinally.myTest());
	}
}
