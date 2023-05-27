package com.yaml.exception;

import java.io.IOException;

public class ThrowExample3 {

	static void validate(int age) throws IOException {
		if(age<18) {
			throw new IOException("not valid age for voting");  	
		}
		else {
			System.out.println("welcome to vote");
		}
	}
	
	public static void main(String args[]){
		try {
			validate(13);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code...");
  	}


}
