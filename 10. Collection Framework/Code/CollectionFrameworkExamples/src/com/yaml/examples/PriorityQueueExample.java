package com.yaml.examples;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.add(123);
		priorityQueue.add(2);
		priorityQueue.add(124);
		priorityQueue.add(122);
		
		Iterator<Integer> iterator = priorityQueue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		int firstElement = priorityQueue.poll();
		System.out.println(firstElement);
		
		firstElement = priorityQueue.poll();
		System.out.println(firstElement);
		
		firstElement = priorityQueue.poll();
		System.out.println(firstElement);
		
		firstElement = priorityQueue.remove();
		System.out.println(firstElement);
		
		// ----queue is empty--
		priorityQueue.poll(); // null
		
		priorityQueue.remove(); // Exception
	}

}
