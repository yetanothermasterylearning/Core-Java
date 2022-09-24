package com.yaml.polymorphismexample;

public class PolymorphismOverLoadingExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.sum(2.0, 3.0));
	}

}

class Calculator {
	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	public int sum(double a, double b) {
		int c = (int)(a+b);
		return c;
	}
}
