package com.yaml.multilevelinheritanceexample;

public class MultiLevelInheritanceExample {

	public static void main(String[] args) {
		System.out.println("Grand child object operations:");
		GrandChild grandChild = new GrandChild();
		grandChild.setName("Akash Ambani"); // name data and method from parent
		grandChild.setAge(30); // age data and method from child class
		grandChild.setSalary(2000);
		grandChild.displayParent(); // method extended from parent class
		grandChild.displayChild(); // method extended from child class
		grandChild.displayGrandChild(); // method extended from grand child class
		grandChild.display();
		
		System.out.println("child object operations:");
		Child child = new Child();
		child.setName("Mukesh Ambani"); // name data and method from parent
		child.setAge(65);
		child.displayParent(); // method extended from parent
		child.displayChild();
		child.display();
		
		System.out.println("parent object operations:");
		Parent parent = new Parent();
		parent.setName("Dhirubhai Ambani");
		parent.displayParent();
		//parent.displayChild(); // extends works in one way (Parent to child class)
	}

}

class Parent {
	private String name;

	public Parent() {
	}
	
	public Parent(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
	
	public void displayParent() {
		System.out.println("Inside parent class method.");
		System.out.println(" Name :"+name);
		System.out.println();
	}
	
	protected void display() {
		System.out.println("Inside parent class display method.");
	}
}

class Child extends Parent { // child get properties and methods from parent 
	private int age;

	public Child() {
	}

	public Child(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}
	
	public void displayChild() {
		System.out.println("Inside child class method.");
		//System.out.println(" Name :"+name); name not accessible as it's a private 
		System.out.println(" Name :"+getName());
		System.out.println(" Age :"+age);
		System.out.println();
	}
}

class GrandChild extends Child { // grand child get properties and methods from parent(here - child class is parent)
	private int salary;

	public GrandChild() {
	}

	public GrandChild(int s) {
		salary = s;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int s) {
		salary = s;
	}
	
	public void displayGrandChild() {
		System.out.println("Inside grand child class method.");
		//System.out.println(" Name :"+name); name not accessible as it's a private 
		System.out.println(" Name :"+getName());
		System.out.println(" Age :"+getAge());
		System.out.println(" Salary :"+getSalary());
		System.out.println();
	}
}