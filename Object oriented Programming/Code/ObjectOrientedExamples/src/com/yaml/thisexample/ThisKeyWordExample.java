package com.yaml.thisexample;

public class ThisKeyWordExample {

	public static void main(String[] args) {
		System.out.println("object operations:");
		// this points to current instance
		Parent parent = new Parent("Dhirubhai Ambani");
		parent.displayParent();
	}

}

class Parent {
	private String name;

	public Parent() {
		name = "DEFAULT";
	}
	
	public Parent(String name) {
		this(); // call constructor
		this.name = name; // this with dot operator used to access current instance variables
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayParent() {
		System.out.println("Inside parent class method.");
		System.out.println(" Name :"+name);
		System.out.println();
	}
}