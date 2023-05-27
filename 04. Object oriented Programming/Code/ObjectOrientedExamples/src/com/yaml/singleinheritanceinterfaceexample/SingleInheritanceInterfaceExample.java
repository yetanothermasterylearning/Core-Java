package com.yaml.singleinheritanceinterfaceexample;

public class SingleInheritanceInterfaceExample {
	public static void main(String[] args) {
		//ParentInterface parentInterface = new ParentInterface();
		Child child = new Child();
		child.display();
	}
}

// interface use for generic function representation
interface ParentInterface {
	public static final String data = "";
	public void display();
}

class Child implements ParentInterface {
	public void display() {
		System.out.println("Inside Child class");
	}
}