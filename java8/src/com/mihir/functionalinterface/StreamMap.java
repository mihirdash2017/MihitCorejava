package com.mihir.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StreamMap {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4);
		list=list.stream().map(x->x*x).filter(k->k%2==0).collect(Collectors.toList());
		System.out.println(list);
		
	}

}
