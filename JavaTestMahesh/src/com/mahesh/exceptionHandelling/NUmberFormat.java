package com.mahesh.exceptionHandelling;

public class NUmberFormat {
	public static void main(String args[]) {
		try {
			int num = Integer.parseInt("ABCD");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception occurred");
		}
	}
}
