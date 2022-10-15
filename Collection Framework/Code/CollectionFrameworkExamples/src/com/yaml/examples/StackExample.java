package com.yaml.examples;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(40);
		stack.push(40);
		stack.push(40);
		stack.push(40);
		stack.push(40);
		stack.push(40);
		stack.push(40);
		stack.push(40);
		stack.push(40);
		int peekedElement = stack.peek();
		System.out.println(peekedElement);
		int poppedElement = stack.pop();
		System.out.println(poppedElement);
		poppedElement = stack.pop();
		System.out.println(poppedElement);
	}

}
