package com.yaml.model;

public class Employee {
	
	private String name;

	public Employee() {
		super();
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Employee [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
