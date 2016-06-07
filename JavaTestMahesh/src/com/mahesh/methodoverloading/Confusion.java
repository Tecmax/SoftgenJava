package com.mahesh.methodoverloading;

public class Confusion {

	public static void main(String[] args) {
		String h = null;
		int a = 0;
		float b = 0;
		double d = 0;
		boolean e = false;
		long f = 0;
		short g = 0;
		byte c = 0;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		confused(10, 20f);
		confused(10f, 20);
	}

	private static float confused(int d, float e) {
		return d + e;
	}

	private static double confused(float d, double e) {
		return d + e;
	}
}
