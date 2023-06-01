package com.yaml.examples;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeQueExample {

	public static void main(String[] args) {
		ArrayDeque<Integer> arrayDequq = new ArrayDeque<Integer>();
		arrayDequq.addLast(123); // first element (first or last)
		arrayDequq.addFirst(2);
		arrayDequq.addLast(124);
		arrayDequq.add(122);
		
		Iterator<Integer> iterator = arrayDequq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
