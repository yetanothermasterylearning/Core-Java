package com.yaml.stringexample;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Java is object oriented programming");
		System.out.println(sb1);
		sb1.replace(0, 4, "C++");
		System.out.println(sb1);
	}

}
