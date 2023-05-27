package com.yaml.examples;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(40);
		
		for (int i : linkedList) {
			System.out.println(i);
		}
	}

}
