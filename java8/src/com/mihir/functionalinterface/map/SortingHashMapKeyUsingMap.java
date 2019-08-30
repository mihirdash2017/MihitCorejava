package com.mihir.functionalinterface.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingHashMapKeyUsingMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(111, "Lalkrishna");
		map.put(154, "Atal");		
		map.put(30, "Narendra");
		map.put(200, "Amit");
		HashMap<Integer, String> collect = map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println(collect);
	}

}
