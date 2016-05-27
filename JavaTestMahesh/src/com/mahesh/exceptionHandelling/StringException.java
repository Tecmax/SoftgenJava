package com.mahesh.exceptionHandelling;

public class StringException {
	public static void main(String[] args) {
		Object obj = null;
		try {
			obj.toString();
		} catch (NullPointerException e) {
			System.out.println("null");
			e.printStackTrace();
		}
	}
}
