package com.yaml.polymorphismexample;

public class PolymorphismExample {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.display();
		Child child = new Child();
		child.display();
	}

}

class Parent {
	public void display() {
		System.out.println("Inside Parent display method");
	}
	public void displayParent() {
		System.out.println("Inside displayParent method");
	}
}
class Child extends Parent {
	public void display() {
		System.out.println("Inside Child display method");
	}
	//displayParent -> 24
	public void displayChild() {
		System.out.println("Inside displayChild method");
	}
}