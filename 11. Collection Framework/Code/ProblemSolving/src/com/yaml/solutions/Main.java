package com.yaml.solutions;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		System.out.println(firstRepeatedCharacter("apple"));
		System.out.println(firstRepeatedCharacter("aple"));
		System.out.println(firstRepeatedCharacter("aaapplle"));
		System.out.println(firstRepeatedCharacter("apleee"));
	}
	
	/*
	 * 2. Find first repeated character in a give string
	 * Input: apple
	 * output: p
	 * Input: dodge
	 * output: d
	 */
	public static Character firstRepeatedCharacter(String input) {
		char[] charArray = input.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : charArray) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				int previousCount = map.get(c);
				map.put(c, previousCount+1);
			}
		}

		for (char c : charArray) {
			int occurences = map.get(c);
			if (occurences > 1) {
				return c;
			}
		}
		return null;
	}
}
