package com.mahesh.exceptionHandelling;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NegativeArraySize {
	public static void main(String args[]) throws IOException {
		int c[] = null;
		try {
			c = new int[-2];
		} catch (Exception e) {
			c = new int[2];
		}
		System.out.println(c.length);
		int[] s = new int[3];
		int[] sd;
		try {
			sd = new int[-3];
		} catch (NegativeArraySizeException e) {
			sd = new int[43];
		}
		
		System.out.println(s.length);
		System.out.println(sd.length);
		Scanner in = new Scanner(new InputStreamReader(System.in));
		int b = in.nextInt();
		int a[] = new int[b];
	}
}
