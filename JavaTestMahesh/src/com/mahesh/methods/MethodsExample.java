package com.mahesh.methods;

public class MethodsExample {
	public static void main(String[] args) {
		System.out.println("value is " + 32);
		MethodsExample obj = new MethodsExample();
		// obj.add(10,20);
		// obj.add(10,20,24);
		obj.add(10, 20);
		obj.add(10, 20, 24);
		// int a = 23;
		// System.out.println("value is" + a);
	}

	private void add(int i, int j) {
		System.out.println("Sub value is " + j);
		int k = i + j;
		System.out.println("Sub value is " + (i) + j);
		System.out.println("Sub value is " + k);
	}

	private void add(int i, int j, int k) {
		System.out.println("Sub value is " + k);
		int l = i + j + k;
		System.out.println("Sub value is " + (i + j) + k);
		System.out.println("Sub value is " + l);
	}

	private void das(int i, int j) {
		int k = i + j;
		System.out.println("value is " + k);
		System.out.println("value is " + i + j);
	}

	private void das(int i, int j, int k) {
		int l = i + j + k;
		System.out.println("value is " + l);
		System.out.println("value is " + i + j + k);
	}

}
