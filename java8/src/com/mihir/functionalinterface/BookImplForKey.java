package com.mihir.functionalinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class BookImplForKey {
	

	public static void main(String[] args) {
		Map<Map<String,String>,String>map = new HashMap<>();
		
		Map<String,String> map1 = new HashMap<>();
		map1.put("Mihir", "22");
		map.put(map1, "Pune");
		 
		 Iterator itr=map.entrySet().iterator();
		 while(itr.hasNext()) {
			Map.Entry<String,String>entry=(Entry<String, String>) itr.next();
			System.out.println(entry.getKey());
		 }
	}
}
