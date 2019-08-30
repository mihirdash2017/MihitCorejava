package com.mihir;

import java.util.HashMap;
import java.util.Map;

public class MapPutMethodTest {

	public static void main(String[] args) {
		Map<String, String> testMap = new HashMap<String, String>();

		System.out.println(testMap.put("key1", "val1"));
		System.out.println(testMap.put("key1", "val2"));
		System.out.println(testMap.put("key1", null));
	}

}
