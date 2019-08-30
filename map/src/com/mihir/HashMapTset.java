package com.mihir;

import java.util.HashMap;
import java.util.Map;

public class HashMapTset {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(new Abc("121", "bca"), "hi");
		map.put(new Abc("121", "bcb"), "by");
		System.out.println(map);
	}

}
