package com.mihir.functionalinterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedList {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("Mihir");
		list.add("Vamsi");
		list.add("Mahesh");
		list.sort((e,e1)->e.compareTo(e1));
		list.forEach(System.out::println);
	}
	
	

}
