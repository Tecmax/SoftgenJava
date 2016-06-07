package com.mahesh.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
	public static void main(String[] args) {

		/* Array Declaration and initialization */
		String citynames[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };

		/* Array to ArrayList conversion */
		ArrayList<String> citylist = new ArrayList<String>(
				Arrays.asList(citynames));

		/* Adding new elements to the converted List */
		citylist.add("New City2");
		citylist.add("New City3");

		/* Final ArrayList content display using for */
		for (String str : citylist) {
			System.out.println(str);
		}
	}
}
