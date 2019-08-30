package com.mihir.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedListUsingJava8 {
	public static void main(String a[]) {
		List<String>list=Arrays.asList("Mihir","Paralay","Malay","Praful");
		List<String>sortedList=list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted list is :"+sortedList);
		List<String>mList=list.stream().filter(s->s.startsWith("M")).sorted().collect(Collectors.toList());
		System.out.println("Sorted list only for M letter:"+mList);
		
		list.stream().filter(s->s.startsWith("M")).sorted().forEach(y->{System.out.println("last line exe: "+y);});
	
		
		String s1="abc";
		String s2="abc";
		System.out.println("equals is "+s1==s2); 
		System.out.println("equals is "+s1.equals(s2));
	
	
	}

}
