package com.mihir;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCharcter {

	public static void main(String[] args) {
		String s="Ram went to Ram temple to worship Ram";
		List<String>list=Arrays.asList(s.split(" "));
		Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
        System.out.println();
    }
		
	
}
