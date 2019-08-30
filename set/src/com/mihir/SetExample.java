package com.mihir;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		// Declare HashSet
		HashSet<String> hashset = new HashSet<String>();

		// Adding elements to the HashSet
		hashset.add("Apple");
		hashset.add("Pear");
		hashset.add("Mango");
		hashset.add("Papaya");
		hashset.add("Orange");
		// Addition of duplicate elements
		hashset.add("Apple");
		hashset.add("Mango");
		// Addition of null values
		hashset.add(null);
		hashset.add(null);

		// Displaying HashSet elements
		System.out.println(hashset);
	}

}
