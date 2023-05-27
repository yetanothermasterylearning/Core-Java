package com.yaml.classexample;

public class ClassExample {

	public static void main(String[] args) {
		System.out.println("Employee 1 details:");
		Employee employee1 = new Employee();
		employee1.name = "Rama";
		employee1.birthYear = 1990;
		employee1.getAge();
		employee1.display();
		System.out.println();
		System.out.println("Employee 2 details:");
		Employee employee2 = new Employee("sita", 1992);
		employee2.display();
		System.out.println();
		Employee.getCompanyName();
		System.out.println("Company name using class name:"+ Employee.companyName);
	}

}