package com.mahesh.staticmethods;

public class StaticEr {

	// Static class
	static class X {
		static String str = "Inside Class X";
		int num = 99;

		int methsd() {
			System.out.println("examole");
			return 0;
		}
	}

	public static void main(String args[]) {
		X obj = new X();
		obj.methsd();
		System.out.println("Value of num=" + X.str);
	}
}
