package com.mahesh.stringHandelling;

public class ConcatenationExample {
	public static void main(String args[]) {
		// One way of doing concatenation
		String str1 = "Welcome";
		str1 = str1.concat(" to ");
		str1 = str1.concat(" String handling ");
		System.out.println(str1);

		// Other way of doing concatenation in one line
		String str2 = "This";
		str2 = str2.concat(" is").concat(" just a").concat(" String");
		System.out.println(str2);
	}
}
