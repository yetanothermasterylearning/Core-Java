package com.yaml.examples;

import java.util.*;

import com.yaml.model.Employee;

public class ForEachLoopExample2 {

	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee("employee-1"));
		arrayList.add(new Employee("employee-2"));
		arrayList.add(new Employee("employee-3"));
		arrayList.add(new Employee("employee-4"));
		
		for (Employee employee : arrayList) { // read only
			System.out.println(employee);
		}

	}

}
