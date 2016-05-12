package com.mahesh.overriding;

class ABC {
	public void mymethod() {
		System.out.println("Class ABC: mymethod()");
	}
}

class SuperKeyWord extends ABC {
	public void mymethod() {
		// This will call the mymethod() of parent class
		super.mymethod();
		System.out.println("Class Test: mymethod()");
	}

	public static void main(String args[]) {
		SuperKeyWord obj = new SuperKeyWord();
		obj.mymethod();
	}
}