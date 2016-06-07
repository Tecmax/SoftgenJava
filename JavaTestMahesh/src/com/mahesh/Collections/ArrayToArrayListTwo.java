package com.mahesh.Collections;

import java.util.ArrayList;

public class ArrayToArrayListTwo {
	public static void main(String[] args) {

		/* ArrayList declaration */
		ArrayList<String> arraylist = new ArrayList<String>();

		/* Initialized Array */
		String array[] = { "Text1", "Text2", "Text3", "Text4" };

		/*
		 * array.length returns the current number of elements present in array
		 */
		for (int i = 0; i < array.length; i++) {

			/* We are adding each array's element to the ArrayList */
			arraylist.add(array[i]);
		}

		/* ArrayList content */
		for (String str : arraylist) {
			System.out.println(str);
		}
	}
}
