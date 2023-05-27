package com.yaml.exception;

import java.io.*;

public class ThrowsExample {

	public static void main(String[] args) throws IOException {
		// Accept a string 
		String str = "File Handling in Java using FileWriter and FileReader";		

		// attach a file to FileWriter 
		FileWriter fw=new FileWriter("output.txt");

		// read character wise from string and write 
		// into FileWriter 
		for (int i = 0; i < str.length(); i++) {
			fw.write(str.charAt(i));
		}

		System.out.println("Writing successful");
		fw.close();

		// variable declaration
		int ch;

		// check if File exists or not
		FileReader fr = new FileReader("output.txts");

		// read from FileReader till the end of file
		while ((ch=fr.read())!=-1) {
			System.out.print((char)ch);
		}

		// close the file
		fr.close();

	}

}
