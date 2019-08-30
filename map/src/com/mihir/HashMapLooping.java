package com.mihir;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapLooping {

	public static void main(String[] args) {
		
		Map<String, String> cityMap = new HashMap<String, String>();
		  cityMap.put("91","New York City" );
		  cityMap.put("102", "Delhi");
		  cityMap.put("93", "Bhubaneswar");
		  cityMap.put("48", "Arabia");
		  
		  Set<Map.Entry<String, String>> keySet=cityMap.entrySet();
		 keySet.forEach((a)->System.out.println("key Is :"+a.getKey() +" value is :"+a.getValue()));
		
		  //sorting on the basis of key
		  Map<String,String> cityMap1=cityMap.entrySet().stream()
				  .sorted(Map.Entry.comparingByKey())
				  	.collect(Collectors
				  			.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		 
		  System.out.println("sorted by key :"+cityMap1);
	}

}
