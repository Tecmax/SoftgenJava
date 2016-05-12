package com.mahesh.overriding;

class MyBaseClass {
	protected void dispq() {
		System.out.println("Parent class method");
	}
}

class MyChildClass extends MyBaseClass {
	public void dispq() {
		System.out.println("Child class method");
	}

	public static void main(String args[]) {
		MyChildClass obj = new MyChildClass();
		obj.dispq();
	}
}