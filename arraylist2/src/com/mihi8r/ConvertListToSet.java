package com.mihi8r;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {

	public static void main(String[] args) {
		List list      = new ArrayList();
	
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 3");
		list.add(3);
		Collections.sort(list);
		Set set = new HashSet();
		set.addAll(list);
		System.out.println(list);
		System.out.println(set);
		System.out.println(10>>1);
	}

}
