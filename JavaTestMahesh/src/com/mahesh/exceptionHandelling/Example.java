package com.mahesh.exceptionHandelling;

public class Example {

	private static String message = null;
	private static String subMessage = null;

	public Example(String message) {
		Example.message = message;
	}

	static {
		/* Store the first 10 characters of the input message. */
		subMessage = message.substring(0, 10);
	}

	public String getSubMessage() {
		return subMessage;
	}
	public long get(){
		return 0;
	}
	public static void main(String[] args) {
		Example exampleClass = new Example("Test");
		System.out.println(exampleClass.getSubMessage());
	}
}
