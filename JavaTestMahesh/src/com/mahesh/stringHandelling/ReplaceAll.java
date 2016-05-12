package com.mahesh.stringHandelling;

public class ReplaceAll {
	public static void main(String args[]) {
		String str = new String("My .com site is BeginnersBook.com");
		System.out.print("String after replacing all com with net :");
		System.out.println(str.replaceAll("com", "net"));
		System.out.println(str.replace("com", "net"));
	}
}
