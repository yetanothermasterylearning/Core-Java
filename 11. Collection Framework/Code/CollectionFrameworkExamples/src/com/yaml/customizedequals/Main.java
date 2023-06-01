package com.yaml.customizedequals;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, 56, "Rama");//&12345
		Student student2 = new Student(2, 23, "Ravana");
		Student student4 = new Student(4, 24, "Sita");
		Student student3 = new Student(3, 30, "Laxman");
		Student student5 = new Student(15, 35, "Rama");
		//Student student6 = student1; //&12345
		Student student7 = new Student(1, 56, "Rama");//&12345
		
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		studentSet.add(student4);
		studentSet.add(student5); //hashset is not comparing based on data, so it add Student5
		//studentSet.add(student6); //hashset looks into object reference, so it avoid inserting Student6
		
		Iterator<Student> iterator = studentSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
