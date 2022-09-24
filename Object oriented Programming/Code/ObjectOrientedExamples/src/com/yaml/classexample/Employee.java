package com.yaml.classexample;

/*
 * class names must follow - each word or abbreviation begins with a capital letter
 * object, variable, method names must follow - first word with a lower case letter, rest all with capital
 */
public class Employee {
	// static/class variable - all objects get shared copy
	static String companyName = "YetAnotherMasteryLearning";
	
	// instance variable - each object get individual copy
	String name;
	int birthYear;
	
	/*
	 * constructor is a specialized method to initialize instance variables
	 * constructor name must match with class name and no return type
	 */
	// default constructor - set instance variables to default values
	public Employee() {
		
	}
	
	//parameter constructor - set instance variables to passed values
	public Employee(String n, int y) {
		name = n;
		birthYear = y;
	}
	
	// instance method
	protected int getAge() {
		// local variable - accessible with in the method
		int currentYear = 2022;
		int age = currentYear - birthYear;
		return age;
	}
	
	// instance method
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("BirthYear : "+birthYear);
		System.out.println("Age : "+getAge());
	}
	
	// static/class method - can't access instance data
	static void getCompanyName() {
		//System.out.println("Name : "+name);
		System.out.println("companyName : "+companyName);
	}
}