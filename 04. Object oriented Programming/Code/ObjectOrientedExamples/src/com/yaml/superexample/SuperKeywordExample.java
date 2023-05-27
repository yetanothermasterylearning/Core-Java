package com.yaml.superexample;

public class SuperKeywordExample {

	public static void main(String[] args) {
		System.out.println("child object operations:");
		Child child = new Child("Mukesh Ambani", 65); // name data and method from parent
		child.displayParent(); // method extended from parent
		child.displayChild();
	}

}

class Parent {
	private String name;

	public Parent() {
	}
	
	public Parent(String name) {
		this.name = name;
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
class Child extends Parent { // child get properties and methods from parent 
	private int age;

	public Child() {
	}

	public Child(int age) {
		this.age = age;
	}
	
	public Child(String name, int age) {
		super(name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayChild() {
		System.out.println("Inside child class method.");
		//System.out.println(" Name :"+name); name not accessible as it's a private 
		System.out.println(" Name :"+getName());
		System.out.println(" Age :"+age);
		System.out.println();
	}
}