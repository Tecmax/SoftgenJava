package com.mahesh.abstraction;

abstract class AbstractDemo {
	public void myMethod() {
		System.out.println("Hello");
	}
	public abstract int anotherMethod(int a);
	public void anotherMethod() {

	}
}

public class ConcerteMethod extends AbstractDemo {
	public void anotherMethod() {
		System.out.print("Abstract method");
	}

	public static void main(String args[]) {
		// Can't create object of abstract class - error!
		AbstractDemo obj = new ConcerteMethod();
		obj.anotherMethod();
	}

	@Override
	public int anotherMethod(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

}