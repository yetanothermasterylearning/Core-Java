package com.yaml.exception;

import java.io.*;

public class FileOperations {

	public static void main(String[] args) {
		// Accept a string 
		String str = "File Handling in Java using FileWriter and FileReader";

		//User login
			//user, password => DB => nextpage
			//						=> New password page
			//						=> Error message
		//Display User profile
		//Add items to cart 
			// 1 
			// 2 
			// 3 ==> Exception
		//Checkout operation <- card details
		//Confirmation
		
		
		try {
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
		} catch (FileNotFoundException fex) {
			//Operation1
			System.out.println("Exception occured during file operation");
		} catch (IOException ex) {
			//Operation2
			System.out.println("Exception occured during file operation");
			ex.printStackTrace();
		} catch (Exception ex) {
			//Operation2
			System.out.println("Exception occured during file operation");
			ex.printStackTrace();
		}
		
	}

}
