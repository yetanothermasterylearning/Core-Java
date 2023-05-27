package com.yaml.multipleinheritanceexample;

public class MultipleInheritanceExample {

	public static void main(String[] args) {
		
		System.out.println("Child object operations:");
		Child child = new Child();
		child.setMotherName("Kokilaben Ambani"); // name data and method from parent
		child.setName("Mukesh Ambani");
		child.displayChild(); // method extended from parent
		child.displayFather();
		child.displayMother();
		
		System.out.println("Mother object operations:");
		Mother mother = new Mother();
		mother.setMotherName("Kokilaben Ambani");
		mother.displayMother();
		
		System.out.println("Father operations: Interface doesn't allow to create objects");
		//Father father = new Father(); // not allowed
		System.out.println(" FatherName :"+Father.FatherName);
	}

}

class Mother {
	private String motherName;

	public Mother() {
	}
	
	public Mother(String n) {
		motherName = n;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String n) {
		motherName = n;
	}
	
	public void displayMother() {
		System.out.println("Inside mother class method - displayMother.");
		System.out.println(" MotherName :"+motherName);
		System.out.println();
	}
}

interface Father {
	public static final String FatherName = "fatherName";
	public void displayFather(); // abstract method
}

class Child extends Mother implements Father { // child get properties and methods from mother and implements the Father 
	private String name;

	public Child() {
	}

	public Child(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
	
	public void displayChild() {
		System.out.println("Inside child class method - displayChild."); 
		System.out.println(" MotherName :"+getMotherName());
		System.out.println(" Name :"+name);
		System.out.println();
	}

	// implements the father methods 
	public void displayFather() {
		System.out.println("Inside child class overrided method - displayFather."); 
		System.out.println(" FatherName :"+FatherName);
		System.out.println(" Name :"+name);
		System.out.println();
	}
}