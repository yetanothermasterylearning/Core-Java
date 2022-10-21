package com.yaml.examples;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		//12 -> "Ravi", 23 -> "Sushmi", 56 -> "Jhon", 43 -> "Rama", 23 -> "Priya"
		hashTable.put(12, "Ravi");
		hashTable.put(23, "Sushmi");
		hashTable.put(56, "Jhon");
		hashTable.put(43, "Rama");
		hashTable.put(23, "Priya");
		//hashTable.put(null, "Ravana");
		
		Set<Entry<Integer, String>> entrySet = hashTable.entrySet();
		for(Map.Entry<Integer, String> m : entrySet){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
	}

}
