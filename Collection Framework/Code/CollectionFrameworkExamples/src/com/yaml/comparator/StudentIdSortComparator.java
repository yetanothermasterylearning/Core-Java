package com.yaml.comparator;

import java.util.Comparator;

public class StudentIdSortComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getId() < student2.getId()) { // lesser
			return -1;
		} else if (student1.getId() > student2.getId()) { // greater
			return 1;
		}
		return 0;//equal
	}

}
