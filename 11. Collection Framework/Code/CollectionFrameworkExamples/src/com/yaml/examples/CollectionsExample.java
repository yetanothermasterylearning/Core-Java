package com.yaml.examples;

import java.util.*;

public class CollectionsExample {

	public static void main(String[] args) {
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(12);
		intArrayList.add(32);
		intArrayList.add(11);
		intArrayList.add(14);
		intArrayList.add(56);
		intArrayList.add(62);
		intArrayList.add(23);
		
		for (int i=0;i<intArrayList.size();i++) {
			System.out.print(intArrayList.get(i) + " ");
		}
		System.out.println();
		int index = Collections.binarySearch(intArrayList, 56);
		System.out.println(index);
		System.out.println();
		Collections.sort(intArrayList);
		
		for (int i=0;i<intArrayList.size();i++) {
			System.out.print(intArrayList.get(i) + " ");
		}
		/*
		Set<Integer> data = new TreeSet<Integer>(intArrayList);
		Iterator<Integer> iterator = data.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		*/
	}

}
