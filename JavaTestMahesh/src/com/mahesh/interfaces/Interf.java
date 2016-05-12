package com.mahesh.interfaces;

interface MyInterface {
	public void method1();

	public void method2();
}

interface MyInterface1 {
	public void method3();

	public void method4();
}

class Interf implements MyInterface,MyInterface1 {
	public void method1() {
		System.out.println("implementation of method1");
	}

	public void method2() {
		System.out.println("implementation of method2");
	}

	public static void main(String arg[]) {
		MyInterface obj = new Interf();
		obj.method1();
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}
}