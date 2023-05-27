package com.yaml.comparator;

import java.util.Comparator;

public class StudentAgeSortComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getAge() > student2.getAge()) { // lesser
			return -1;
		} else if (student1.getAge() < student2.getAge()) { // greater
			return 1;
		}
		return 0;//equal
	}

}
