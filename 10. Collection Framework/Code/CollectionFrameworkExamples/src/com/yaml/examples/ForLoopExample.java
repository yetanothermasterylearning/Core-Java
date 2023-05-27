package com.yaml.examples;

import java.util.*;

public class ForLoopExample {

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
		
		// read + write
		for (int i=0;i<intArrayList.size();i++) {
			if (i == 10) {
				intArrayList.add(17);
			}
			System.out.println(intArrayList.get(i));
		}
		
	}

}
