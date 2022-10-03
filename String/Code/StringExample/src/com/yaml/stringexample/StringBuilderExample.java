package com.yaml.stringexample;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Java is object oriented programming");
		System.out.println(sb1);
		sb1.replace(0, 4, "C++");
		System.out.println(sb1);
	}

}
