package com.mahesh.stringHandelling;

public class ContentEqualsExample {
	public static void main(String args[]) {
		String str1 = "First String";
		String str2 = "Second String";
		StringBuffer str3 = new StringBuffer("Second String");
		StringBuffer str4 = new StringBuffer("First String");
		System.out.println("str1 equals to str3:" + str1.contentEquals(str3));
		System.out.println("str2 equals to str3:" + str2.contentEquals(str3));
		System.out.println("str1 equals to str4:" + str1.contentEquals(str4));
		System.out.println("str2 equals to str4:" + str2.contentEquals(str4));
	}
}
