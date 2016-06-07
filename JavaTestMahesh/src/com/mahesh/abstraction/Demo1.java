package com.mahesh.abstraction;
abstract class Demo1 {
	public void disp1() {
		System.out.println("Concrete method of abstract class");
	}

	abstract public void disp2();
}

class Demo2 extends Demo1 {
	/*
	 * I have given the body to abstract method of Demo1 class It is must if you
	 * don't declare abstract method of super class compiler would throw an
	 * error
	 */
	

	public static void main(String args[]) {
		Demo2 obj = new Demo2();
		obj.disp1();
		obj.disp2();
	}

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void disp2() {
//		// TODO Auto-generated method stub
//		
//	}
}