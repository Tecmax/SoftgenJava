package com.mahesh.stringHandelling;

public class RegionMatchesExample {
	public static void main(String args[]) {
		String str1 = new String("Hello, How are you");
		String str2 = new String("How");
		String str3 = new String("HOW");

		System.out.print("Result of Test1: ");
		System.out.println(str1.regionMatches(7, str2, 0, 3));

		System.out.print("Result of Test2: ");
		System.out.println(str1.regionMatches(7, str3, 0, 3));

		System.out.print("Result of Test3: ");
		System.out.println(str1.regionMatches(true, 7, str3, 0, 3));
	}
}
