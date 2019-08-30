package com.mihi8r;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ConvertSetToList {

	public static void main(String[] args) {
		// Creating HashSet Object    
	    HashSet<String> hashset = new HashSet<String>();
	    hashset.add("Mango");
	    hashset.add("Banana");
	    hashset.add("Pear");
	    hashset.add("Apple");
	    hashset.add("Orange");
	    
	    // Showing HashSet elements
	    System.out.println("HashSet contains : "+ hashset);
	    
	    // Converting HashSet to ArrayList
	    List<String> list = new ArrayList<String>(hashset);

	    // Showing ArrayList elements
	    System.out.println("ArrayList contains :"+list);
	     
	}

}
