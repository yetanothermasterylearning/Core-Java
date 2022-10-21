package com.yaml.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Integer> intHashset = new HashSet<Integer>();
		//12, 23, 56, 43, 32, 56
		intHashset.add(12);
		intHashset.add(23);
		intHashset.add(56);
		intHashset.add(43);
		intHashset.add(32);
		intHashset.add(56);
		intHashset.add(25);
		intHashset.add(35);
		
		Iterator<Integer> iterator = intHashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
