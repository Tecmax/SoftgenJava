package com.mahesh.stringHandelling;

public class ReplaceFirst {
	public static void main(String args[]) {
		String str = new String("Site is BeginnersBook.com");

		System.out.print("String after replacing com with net :");
		System.out.println(str.replaceFirst("com", "net"));

		System.out.print("String after replacing Site name:");
		System.out.println(str.replaceFirst("Beginners(.*)", "XYZ.com"));
	}
}
