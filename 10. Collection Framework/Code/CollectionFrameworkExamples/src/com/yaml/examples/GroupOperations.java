package com.yaml.examples;

import java.util.*;

public class GroupOperations {

	public static void main(String[] args) {
		ArrayList<Integer> intArrayList1 = new ArrayList<Integer>();
		ArrayList<Integer> intArrayList2 = new ArrayList<Integer>();
		intArrayList1.add(1);
		intArrayList1.add(2);
		intArrayList1.add(3);
		intArrayList1.add(4);
		
		intArrayList2.add(3);
		intArrayList2.add(4);
		intArrayList2.add(5);
		intArrayList2.add(6);
		
		// {1,2,3,4} {3,4,5,6} => add all (Union) => {1,2,3,4,3,4,5,6} 
		// {1,2,3,4} {3,4,5,6} => retain all(intersection) => {3,4} 
		// {1,2,3,4} {3,4,5,6} => remove all(subtraction) => {1,2}  
		
		//intArrayList1.addAll(intArrayList2);
		//intArrayList1.retainAll(intArrayList2);
		//intArrayList1.removeAll(intArrayList2);
		for (int i=0;i<intArrayList1.size();i++) {
			System.out.println(intArrayList1.get(i));
		}
	}

}
