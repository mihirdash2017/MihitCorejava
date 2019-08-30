package com.mihir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		String s = "Ram went to Ram temple to worship Ram";
		int count = 0;
		List<String> list = Arrays.asList(s.split(" "));
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("Ram")) {
				count++;
			}
		}
		System.out.println("count value is Ram :" + count);

	}

}
