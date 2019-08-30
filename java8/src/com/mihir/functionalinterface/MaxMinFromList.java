package com.mihir.functionalinterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxMinFromList {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(13);
		list.add(23);
		list.add(35);
		list.add(1);
		list.add(8);
		list.add(22);
		list.add(14);
		Long number= list.stream().count();
		System.out.println("Element is availbe :"+number);
		
		System.out.println("after sorted :"+list);
		

	}

}
