package com.yaml.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		//12 -> "Ravi", 23 -> "Sushmi", 56 -> "Jhon", 43 -> "Rama", 23 -> "Priya"
		hashMap.put(12, "Ravi");
		hashMap.put(23, "Sushmi");
		hashMap.put(56, "Jhon");
		hashMap.put(43, "Rama");
		hashMap.put(23, "Priya");
		hashMap.put(null, "Priya");
		hashMap.put(null, "Ravana");
		
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for(Map.Entry<Integer, String> m : entrySet){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
		
	}

}
