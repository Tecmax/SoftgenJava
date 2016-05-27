package com.mahesh.exceptionHandelling;

public class IndexBound {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5 };
		/*
		 * My array has only 5 elements but I'm trying to display the value of
		 * 8th element. It should throw ArrayIndexOutOfBoundsException
		 */
		System.out.println(arr[2]);
	}
}
