package com.yaml.finalexample;


public class FinalExample {
	public static void main(String[] args) {
		final int t = 23;
		// t = 34;
		System.out.println("Hello world");
	}
}

class Parent { // final class can't be extensible
	public void message() {
		System.out.println("Inside Parent class - message method");
	}
	public final void display() {
		System.out.println("Inside Parent class - display method");
	}
}
class Child extends Parent {
	public void message() {
		System.out.println("Inside Child class - message method");
	}
	/*
	public void display() {
		System.out.println("Inside Child class - display method");
	}
	*/
}
