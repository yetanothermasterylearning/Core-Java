package com.yaml.stringexample;

public class StringCompareExample {

	public static void main(String[] args) {
		String name1 = "Java";
		String name2 = "Java";
		String name3= new String("Java");
		String name4= new String("Java");
		System.out.println("Equals method check");
		if (name1.equals(name2)) {
			System.out.println("name1 data is equals to name2");
		}
		if (name2.equals(name3)) {
			System.out.println("name2 data is equals to name3");
		}
		if (name3.equals(name4)) {
			System.out.println("name3 data is equals to name4");
		}
		if (name4.equals(name1)) {
			System.out.println("name4 data is equals to name5");
		}
		
		System.out.println("== check");
		if (name1 == name2) {
			System.out.println("name1 refrence is equals to name2");
		}
		if (name2 == name3) {
			System.out.println("name2 refrence is equals to name3");
		}
		if (name3 == name4) {
			System.out.println("name3 refrence is equals to name4");
		}
		if (name4 == name1) {
			System.out.println("name4 refrence is equals to name1");
		}
		
		
	}

}
