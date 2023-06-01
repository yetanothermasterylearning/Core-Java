package com.yaml.comparator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, 56, "Rama");
		Student student2 = new Student(2, 23, "Ravana");
		Student student4 = new Student(4, 24, "Sita");
		Student student3 = new Student(3, 30, "Laxman");
		
		Set<Student> studentSetWithIdOrder = new TreeSet<Student>(new StudentIdSortComparator()); // ?? id based sorting
		studentSetWithIdOrder.add(student1); 
		studentSetWithIdOrder.add(student2);
		studentSetWithIdOrder.add(student4);
		studentSetWithIdOrder.add(student3);
		
		Iterator<Student> iterator = studentSetWithIdOrder.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		Set<Student> studentSetWithAgeOrder = new TreeSet<Student>(new StudentAgeSortComparator()); // ?? age based sorting
		studentSetWithAgeOrder.add(student1);
		studentSetWithAgeOrder.add(student2);
		studentSetWithAgeOrder.add(student4);
		studentSetWithAgeOrder.add(student3);
		
		iterator = studentSetWithAgeOrder.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
