package com.mahesh.stringHandelling;

public class TrimExample {
	public static void main(String args[]) {
		String str = new String("    How are you??   ");
		System.out.println("String before trim: " + str);
		System.out.println("String after trim: " + str.trim());
	}
}