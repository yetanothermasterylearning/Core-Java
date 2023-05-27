package com.yaml.examples;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(1);
		intArrayList.add(2);
		intArrayList.add(3);
		intArrayList.add(4);
		intArrayList.add(5);
		intArrayList.add(6);
		intArrayList.add(7);
		intArrayList.add(8);
		intArrayList.add(9);
		intArrayList.add(10);
		intArrayList.add(11);
		intArrayList.add(12);
		intArrayList.add(13);
		intArrayList.add(14);
		intArrayList.add(15);
		intArrayList.add(16);
		
		Iterator<Integer> iterator = intArrayList.iterator();
		while (iterator.hasNext()) { //1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
			System.out.println(iterator.next());
		}
	}

}
