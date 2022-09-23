package com.yaml.encapsulationexample;

public class EncapsulationExample {

	public static void main(String[] args) {
		System.out.println("Employee 1 details:");
		Employee employee1 = new Employee();
		employee1.setName("Rama"); // secure the data access using private and public getters and setters
		employee1.setBirthYear(1990);
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

/*
 * class names must follow - each word or abbreviation begins with a capital letter
 * object, variable, method names must follow - first word with a lower case letter, rest all with capital
 */
class Employee {
	// static/class variable - all objects get shared copy
	static String companyName = "YetAnotherMasteryLearning";
	
	// instance variable - each object get individual copy
	private String name;
	private int birthYear;
	
	/*
	 * constructor is a specialized method to initialize instance variables
	 * constructor name must match with class name and no return type
	 */
	// default constructor - set instance variables to default values
	Employee() {
		
	}
	
	//parameter constructor - set instance variables to passed values
	Employee(String n, int y) {
		name = n;
		birthYear = y;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	// instance method
	int getAge() {
		// local variable - accessible with in the method
		int currentYear = 2022;
		int age = currentYear - birthYear;
		return age;
	}
	
	// instance method
	void display() {
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