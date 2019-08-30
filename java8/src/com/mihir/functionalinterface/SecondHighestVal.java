package com.mihir.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SecondHighestVal {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(2,5,3,8,1,9,11);
		OptionalInt min = list.stream()
				.sorted((s,a)->a.compareTo(s)).limit(2).mapToInt(e->e).min();
		System.out.println(min.getAsInt());
		
	}

}
