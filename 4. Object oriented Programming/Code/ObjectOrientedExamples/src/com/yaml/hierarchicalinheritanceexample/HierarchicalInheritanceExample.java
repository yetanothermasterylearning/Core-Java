package com.yaml.hierarchicalinheritanceexample;

public class HierarchicalInheritanceExample {

	public static void main(String[] args) {
		
		System.out.println("child-1 object operations:");
		Child1 child1 = new Child1();
		child1.setName("Mukesh Ambani"); // name data and method from parent
		child1.setAge(65);
		child1.displayParent(); // method extended from parent
		child1.displayChild1();
		
		System.out.println("child-2 object operations:");
		Child2 child2 = new Child2();
		child2.setName("Anil Ambani"); // name data and method from parent
		child2.setSalary(3000);
		child2.displayParent(); // method extended from parent
		child2.displayChild2();
		
		System.out.println("parent object operations:");
		Parent parent = new Parent();
		parent.setName("Dhirubhai Ambani");
		parent.displayParent();
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
}

class Child1 extends Parent { // child get properties and methods from parent 
	private int age;

	public Child1() {
	}

	public Child1(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}
	
	public void displayChild1() {
		System.out.println("Inside child-1 class method.");
		//System.out.println(" Name :"+name); name not accessible as it's a private 
		System.out.println(" Name :"+getName());
		System.out.println(" Age :"+age);
		System.out.println();
	}
}

class Child2 extends Parent { // child get properties and methods from parent 
	private int salary;

	public Child2() {
	}

	public Child2(int s) {
		salary = s;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int s) {
		salary = s;
	}
	
	public void displayChild2() {
		System.out.println("Inside child-2 class method.");
		//System.out.println(" Name :"+name); name not accessible as it's a private 
		System.out.println(" Name :"+getName());
		System.out.println(" Salary :"+salary);
		System.out.println();
	}
}