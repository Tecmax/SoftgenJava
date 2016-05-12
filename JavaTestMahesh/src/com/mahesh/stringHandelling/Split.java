package com.mahesh.stringHandelling;

public class Split {
	public static void main(String args[]) {
		String str = new String("28/12/2013");
		System.out.println("split(String regex):");
		String array1[] = str.split("/");
		for (String temp : array1) {
			System.out.println(temp);
		}
		System.out.println("split(String regex, int limit) with limit=2:");
		String array2[] = str.split("/", 2);
		for (String temp : array2) {
			System.out.println(temp);
		}
		System.out.println("split(String regex, int limit) with limit=0:");
		String array3[] = str.split("/", 0);
		for (String temp : array3) {
			System.out.println(temp);
		}
		System.out.println("split(String regex, int limit) with limit=-5:");
		String array4[] = str.split("/", -5);
		for (String temp : array4) {
			System.out.println(temp);
		}
	}
}
