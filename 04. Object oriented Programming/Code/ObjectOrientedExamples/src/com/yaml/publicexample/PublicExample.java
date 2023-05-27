package com.yaml.publicexample;

import com.yaml.classexample.Employee;

public class PublicExample {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.display();
		//employee.getAge(); // not able to access
	}
}
