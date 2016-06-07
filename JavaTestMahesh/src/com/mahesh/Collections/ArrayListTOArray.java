package com.mahesh.Collections;

import java.util.ArrayList;

public class ArrayListTOArray {
	public static void main(String[] args) {

		/* ArrayList declaration and initialization */
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("String1");
		arrlist.add("String2");
		arrlist.add("String3");
		arrlist.add("String4");

		/* ArrayList to Array Conversion */
		String array[] = new String[arrlist.size()];
		for (int j = 0; j < arrlist.size(); j++) {
			array[j] = arrlist.get(j);
		}

		/* Displaying Array elements */
		for (String k : array) {
			System.out.println(k);
		}
	}
}
