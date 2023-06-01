package com.yaml.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		//Random(hashcode) order
		Set<Integer> intHashset = new HashSet<Integer>();
		//12, 23, 56, 43,
		intHashset.add(12);
		intHashset.add(23);
		intHashset.add(56);
		intHashset.add(43);
		intHashset.add(23);
		
		System.out.println("HashSet display:");
		Iterator<Integer> iterator = intHashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Insertion order
		intHashset = new LinkedHashSet<Integer>();
		//12, 23, 56, 43,
		intHashset.add(12);
		intHashset.add(23);
		intHashset.add(56);
		intHashset.add(43);
		intHashset.add(23);
		
		System.out.println("LinkedHashSet display:");
		iterator = intHashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Sorting order
		intHashset = new TreeSet<Integer>();
		//12, 23, 56, 43,
		intHashset.add(12); //12
		intHashset.add(23);	//12,23
		intHashset.add(56); //12,23,56
		intHashset.add(43); //12,23,43,56
		intHashset.add(23); //12,23,43,56
		
		System.out.println("TreeSet display:");
		iterator = intHashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
