package com.mahesh.overriding;

class Human {
	public void eat() {
		System.out.println("Human is eating");
	}
	public void walk() {
		System.out.println("Human is walking");
	}
}

class Boy extends Human {
	public void eat() {
		System.out.println("Boy is eating");
	}

	public void runa() {
		System.out.println("Boy is runing");
	}

	public static void main(String args[]) {
		Boy obj = new Boy();
		obj.eat();
		obj.runa();
	}
}