package com.mahesh.exceptionHandelling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Exceptions {
	public static void main(String args[]) throws IOException {
		String content = "This is the content to write into file";
		FileInputStream fis = null;
		/*
		 * This constructor FileInputStream(File filename) throws
		 * FileNotFoundException which is a checked exception
		 */
		int k;
		fis = new FileInputStream("C:/Softgen/mahesh.txt");
		File file = new File("C:/Softgen/mahesh.txt");
		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();

		System.out.println("Done");
		/*
		 * Method read() of FileInputStream class also throws a checked
		 * exception: IOException
		 */
		while ((k = fis.read()) != -1) {
			System.out.print((char) k);
		}

		/*
		 * The method close() closes the file input stream It throws IOException
		 */
		fis.close();
	}
}
