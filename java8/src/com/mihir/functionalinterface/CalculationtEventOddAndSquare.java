package com.mihir.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalculationtEventOddAndSquare {

	public static void main(String[] args) {
	List<Integer>list=Arrays.asList(2,3,4,5,6,8,9);
	List<Integer>newList=list.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
	System.out.println(newList);
	}

}
