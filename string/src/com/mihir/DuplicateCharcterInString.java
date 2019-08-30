package com.mihir;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharcterInString {

	public static void main(String[] args) {
		int count = 0;
		String str = "aa ba basb ajudba";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				if(ch!=' ')
				map.put(ch, 1);
			}
		}
System.out.println(map);
	}

}
