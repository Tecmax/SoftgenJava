package com.mahesh.exceptionHandelling;

public class StackOverFlow {
	public static void recursivePrint(int num) {
		System.out.println("Number: " + num);

		if (num == 0)
			return;
		else
			recursivePrint(++num);
	}

	public static void main(String[] args) {
		try {
			StackOverFlow.recursivePrint(1);
		} catch (StackOverflowError e) {
			System.out.println("Unending Loop");
			e.printStackTrace();
		}
	}
}
