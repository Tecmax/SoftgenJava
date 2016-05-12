package com.mahesh.stringHandelling;

public class CodePointAt {
	public static void main(String args[]) {
		String str = "Welcome to string handling tutorial";
		int ch1 = str.codePointAt(0);
		int ch2 = str.codePointAt(5);
		int ch3 = str.codePointAt(11);
		int ch4 = str.codePointAt(20);
		System.out.println("CodePoint at 0 index is: " + ch1);
		System.out.println("CodePoint at 5th index is: " + ch2);
		System.out.println("CodePoint at 11th index is: " + ch3);
		System.out.println("CodePoint at 20th index is: " + ch4);
	}
}
