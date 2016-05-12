package com.mahesh.stringHandelling;

public class CompareToIgnore {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hi");
		String str3 = new String("Hello");
		System.out.println("str1 compareTo to str2:" + str1.compareToIgnoreCase(str2));
		System.out.println("str1 compareTo to str3:" + str1.compareToIgnoreCase(str3));
		System.out.println("str1 compareTo to Welcome:" + str1.compareToIgnoreCase("Welcome"));
		System.out.println("str1 compareTo to Hello:" + str1.compareToIgnoreCase("Hello"));
		System.out.println("str1 compareTo to hello:" + str1.compareToIgnoreCase("hello"));
	}
}
