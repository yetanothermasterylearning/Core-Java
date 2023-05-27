package com.yaml.polymorphismexample;

public class PolymorphismRunTimeExample {

	public static void main(String[] args) {
		// advance - Parent variable can point child
		Mother mother = new Kid(); // mother -> memory of Child
		mother.display();
		//mother.displayChild();
		mother.displayParent();
	}

}

class Mother {
	public void display() {
		System.out.println("Inside Parent display method");
	}
	public void displayParent() {
		System.out.println("Inside displayParent method");
	}
}
class Kid extends Mother {
	public void display() {
		System.out.println("Inside Child display method");
	}
	//displayParent -> 24
	public void displayChild() {
		System.out.println("Inside displayChild method");
	}
}