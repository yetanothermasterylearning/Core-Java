package com.yaml.wrapperexample;

public class WrapperExample {
	public static void main(String[] args) {
		int intPrimitive1 = 18;
		Integer intObject1 = new Integer(18);
		Integer intObject2 = 23; // auto converts primitive data types to object => AutoBoxing
		int intPrimitive2 = intObject2; // auto converts object to primitive data types => AutoUnBoxing
		System.out.println(intPrimitive1);
		System.out.println(intPrimitive2);
		System.out.println(intObject1.doubleValue());
		System.out.println(intObject2);
		String empId = "123";
		System.out.println(Integer.parseInt(empId));
	}
}
