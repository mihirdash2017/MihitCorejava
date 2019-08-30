package com.mihir.dev;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8MapEmpObjSortedExample {

	public static void main(String[] args) {
		Map<Employee,String> map=new HashMap<>();
		map.put(new Employee(101, "mihir"), "hi");
		map.put(new Employee(103, "tarun"), "hello");
		map.put(new Employee(104, "vamsi"), "bye");
		map.put(new Employee(102, "Amresh"), "welcome");
		
		Map<Employee,String> resultMap=map.entrySet()
			.stream()
				.sorted(Map.Entry.comparingByValue())
					.collect(Collectors
							.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		
		System.out.println(map);
		

	}

}
