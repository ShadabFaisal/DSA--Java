package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode451_SortCharactersByFrequency {

	public static void main(String[] args) {
		 String s = "tree";
		 System.out.println(frequencySort(s));

	}

	public static String frequencySort(String s) {
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		List<Character> sortedChars = new ArrayList<>(map.keySet());
		sortedChars.sort((a, b) -> map.get(b) - map.get(a));

		for (char c : sortedChars) {
			int count = map.get(c);
			for (int i = 0; i < count; i++) {
				sb.append(c);
			}
		}

		return sb.toString();
	}

}
