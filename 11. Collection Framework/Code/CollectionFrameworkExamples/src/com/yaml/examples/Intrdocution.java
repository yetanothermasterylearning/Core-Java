package com.yaml.examples;

import java.util.*;

public class Intrdocution {

	public static void main(String[] args) {
		//int[] a = new int[10];
		// a[0] = 123
		ArrayList intArrayList = new ArrayList();
		intArrayList.add(1);
		intArrayList.add("Ravi");
		intArrayList.add(6000.34);
		for (int i=0;i<intArrayList.size();i++) {
			System.out.println(intArrayList.get(i));
		}
		
	}

}
