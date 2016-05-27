package com.mahesh.methodoverloading;

public class Noofparamenters {
	public static void main(String[] args) {
		Noofparamenters.FruitColor(5435, 2234.432f, 432);
		Noofparamenters obj = new Noofparamenters();
		String gf = obj.FruitColor(32.32f);
		obj.FruitColor(2321);
		float abc = obj.FruitColor(32.2f, 32);
		float cab = obj.FruitColor(32, 32.00f);
		float bac = obj.FruitColor(23, 432);
		System.out.println(""+abc +cab + bac);
	}

	private void FruitColor(int a) {
		System.out.println(a);
	}

	private String FruitColor(float a) {
		System.out.println(a);
		return "dsfds";
	}

	private int FruitColor(int a, int b) {
		return a + b;

	}

	private float FruitColor(int a, float b) {
		float c = a + b;
		System.out.println(a + b);
		return c;

	}
	private static float FruitColor(int a, float b,int c) {
		float d = a + b + c ;
		System.out.println(a + b + c);
		return d;

	}

	private float FruitColor(float a, int b) {
		float c = a + b;
		System.out.println(a + b);
		return c;

	}

}
