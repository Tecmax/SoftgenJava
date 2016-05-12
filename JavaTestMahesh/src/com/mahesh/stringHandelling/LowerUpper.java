package com.mahesh.stringHandelling;

import java.util.Locale;

public class LowerUpper {
	 public static void main(String args[]){
	       String str = new String("Hello How are You");
	       //Standard method of conversion
	       System.out.println(str.toLowerCase());

	       //By specifying Locale
	       System.out.println(str.toLowerCase(Locale.CANADA_FRENCH));
	       
	     //Standard method of conversion
	       System.out.println(str.toUpperCase());

	       //By specifying Locale
	       System.out.println(str.toUpperCase(Locale.CHINA));
	   }
}
