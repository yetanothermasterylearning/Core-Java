package com.yaml.examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		// random(hashcode) order
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		//12 -> "Ravi", 23 -> "Sushmi", 56 -> "Jhon", 43 -> "Rama", 23 -> "Priya"
		hashMap.put(12, "Ravi");
		hashMap.put(23, "Sushmi");
		hashMap.put(56, "Jhon");
		hashMap.put(43, "Rama");
		hashMap.put(23, "Priya");
		
		System.out.println("HashMap display:");
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for(Map.Entry<Integer, String> m : entrySet){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
		
		// User input order of key
		hashMap = new LinkedHashMap<Integer, String>();
		//12 -> "Ravi", 23 -> "Sushmi", 56 -> "Jhon", 43 -> "Rama", 23 -> "Priya"
		hashMap.put(12, "Ravi");
		hashMap.put(23, "Sushmi");
		hashMap.put(56, "Jhon");
		hashMap.put(43, "Rama");
		hashMap.put(23, "Priya");
		
		System.out.println("LinkedHashMap display:");
		entrySet = hashMap.entrySet();
		for(Map.Entry<Integer, String> m : entrySet){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
		
		// Sorted order
		hashMap = new TreeMap<Integer, String>();
		//12 -> "Ravi", 23 -> "Sushmi", 56 -> "Jhon", 43 -> "Rama", 23 -> "Priya"
		hashMap.put(12, "Ravi");
		hashMap.put(23, "Sushmi");
		hashMap.put(56, "Jhon");
		hashMap.put(43, "Rama");
		hashMap.put(23, "Priya");
		
		System.out.println("TreeMap display:");
		entrySet = hashMap.entrySet();
		for(Map.Entry<Integer, String> m : entrySet){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
		
	}

}
