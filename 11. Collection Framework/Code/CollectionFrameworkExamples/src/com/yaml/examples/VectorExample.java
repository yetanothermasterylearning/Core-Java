package com.yaml.examples;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Integer> vector = new Vector<Integer>();
		vector.add(100);
		vector.add(200);
		vector.add(300);
		vector.add(40);
		
		for (int i : vector) {
			System.out.println(i);
		}
	}

}
