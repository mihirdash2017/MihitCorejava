package com.mihir.dev;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8ListStringSortedExample {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("mihir","tarun","vamsi","mahesh");
		List sortedList=list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
	}

}
