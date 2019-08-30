package com.mihir.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringElementFromList {
	public static void main(String a[]) {
		List<String>list=Arrays.asList("Mihir","Pralay","Malay","Praful");
		List<String>newList=list.stream().filter(s->s.startsWith("P")).collect(Collectors.toList());
		System.out.println("P letter words in list are :"+newList);
	}

}
