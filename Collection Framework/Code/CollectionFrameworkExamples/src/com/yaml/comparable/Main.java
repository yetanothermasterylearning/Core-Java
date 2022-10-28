package com.yaml.comparable;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Student> studentSet = new TreeSet<Student>(); //id, age
		studentSet.add(new Student(1, 56, "Rama")); 
		studentSet.add(new Student(2, 23, "Ravana"));
		studentSet.add(new Student(4, 24, "Sita"));
		studentSet.add(new Student(3, 30, "Laxman"));
		
		Iterator<Student> iterator = studentSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
