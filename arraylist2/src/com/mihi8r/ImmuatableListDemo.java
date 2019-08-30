package com.mihi8r;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmuatableListDemo {

	public static void main(String[] args) {
		List<String>list=new ArrayList();
		list.add("hi");
		list.add("hello");
		list.add("bye");
		list.add("mihir");
		System.out.println(list);
		list=Collections.unmodifiableList(list);
		list.add("Mahesh");
		System.out.println(list);
		
	}

}
