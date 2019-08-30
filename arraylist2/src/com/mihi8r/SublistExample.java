package com.mihi8r;

import java.util.ArrayList;
import java.util.List;

public class SublistExample {

	public static void main(String[] args) {
		List list      = new ArrayList();

		list.add("mihir");
		list.add("tarun");
		list.add("amit");
		list.add("mahesh");

		List sublist = list.subList(1, 3);
		System.out.println(sublist);

	}

}
