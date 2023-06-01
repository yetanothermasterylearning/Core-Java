package com.yaml.customizedequals;

public class StringSameHashCode {

	public static void main(String[] args) {
		String st1 = "Aa";
		String st2 = "BB";
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st1.equals(st2));
	}

}
