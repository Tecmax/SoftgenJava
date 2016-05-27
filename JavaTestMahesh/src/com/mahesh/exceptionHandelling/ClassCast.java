package com.mahesh.exceptionHandelling;

public class ClassCast {
	public static void main(String[] args) {
		try {
			Object obj = new Integer(100);
			System.out.println((float) obj);
		} catch (ClassCastException e) {
			System.out.println("Check the casting");
		}
	}

}
