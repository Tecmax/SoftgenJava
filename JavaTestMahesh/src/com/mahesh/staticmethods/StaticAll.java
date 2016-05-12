package com.mahesh.staticmethods;

public class StaticAll {
	static int Var1 = 77; // Static integer variable
	String Var2;// non-static string variable

	public static void main(String args[]) {
		StaticAll ob1 = new StaticAll();
		StaticAll ob2 = new StaticAll();
		
		
		StaticAll.Var1 = 99;
		
		
		ob2.Var1 = 88;
//		ob1.Var2 = "I'm Object1";
//		ob2.Var2 = "I'm Object2";
		System.out.println("ob1 integer:" + ob1.Var1);
//		System.out.println("ob1 String:" + ob1.Var2);
		System.out.println("ob2 integer:" + ob2.Var1);
//		System.out.println("ob2 STring:" + ob2.Var2);
	}
}
