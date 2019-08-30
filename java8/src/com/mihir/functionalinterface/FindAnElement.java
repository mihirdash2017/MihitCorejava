package com.mihir.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAnElement {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("Mihir","Paralay","Malay","Mihir","Praful");
		List<String>newList=list.stream().filter(x->x.contains("Mihir")).collect(Collectors.toList());
		Long count=list.stream().filter(x->x.contains("Mihir")).count();
		System.out.println(newList +"its occuarance is :"+count);
	}

}
