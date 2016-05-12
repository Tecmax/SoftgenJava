package com.mahesh.stringHandelling;

public class CompareTo {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hi");
		String str3 = new String("Hello");
		System.out.println("str1 compareTo to str2:" + str1.compareTo(str2));
		System.out.println("str1 compareTo to str3:" + str1.compareTo(str3));
		System.out.println("str1 compareTo to Welcome:" + str1.compareTo("Welcome"));
		System.out.println("str1 compareTo to Hello:" + str1.compareTo("Hello"));
		System.out.println("str1 compareTo to hello:" + str1.compareTo("hello"));
	}
}
