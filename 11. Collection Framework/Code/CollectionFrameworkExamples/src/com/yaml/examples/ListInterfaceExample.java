package com.yaml.examples;

import java.util.*;

public class ListInterfaceExample {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		display(arrayList);
		
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		display(linkedList);
	}
	
	public static void display(List<Integer> list) {
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	/*
	public static void display(ArrayList<Integer> arrayList) {
		for (int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
	}
	public static void display(LinkedList<Integer> linkedList) {
		for (int i=0;i<linkedList.size();i++) {
			System.out.println(linkedList.get(i));
		}
	}
	*/
}
