package com.mihi8r;

import java.util.ArrayList;
import java.util.List;

public class REatinedList {
	
	public static void main(String[] args) {
		List list      = new ArrayList();
		List otherList = new ArrayList();

		String element1 = "element 1";
		String element2 = "element 2";
		String element3 = "element 3";
		String element4 = "element 4";

		list.add(element1);
		list.add(element2);
		list.add(element3);

		otherList.add(element1);
		otherList.add(element3);
		otherList.add(element4);

		list.retainAll(otherList);
		System.out.println(list);
	}

}
