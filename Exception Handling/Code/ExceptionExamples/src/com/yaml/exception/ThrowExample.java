package com.yaml.exception;

public class ThrowExample {

	static void validate(int age){
		if(age<18) {
			throw new ArithmeticException("not valid age for voting");  	
		}
		else {
			System.out.println("welcome to vote");
		}
	}
	
	public static void main(String args[]){
		try{
			validate(23);
		} catch(ArithmeticException e) {
			//System.out.println("error :"+e);
			e.printStackTrace();
		}
		System.out.println("rest of the code...");
  	}


}
