package com.mihi8r;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateFromnList {
	public static List<String> removeDuplicate(List<String> list) {
		
		ArrayList<String>newList=new ArrayList<>();
		
		for(String str:list) {
			if(!newList.contains(str)) {
				newList.add(str);
			}
		}
		
		return newList;
		
	}
public static List<String> removeDuplicateJava8(List<String> list) {
		
		List<String> list2=list.stream().distinct().collect(Collectors.toList());
		return list2;
		
	}
	public static void main(String a[]) {
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("c");
		list.add("d");
		System.out.println("before removing the duplicate from list :"+list);
		
		HashSet<String> set=new HashSet<>(list);
		
		System.out.println("after removing duplicate by HashSet:"+set);
		List<String> lit2=removeDuplicate(list);
		System.out.println("removeing by method :"+lit2);
		
		List<String> lit3=removeDuplicateJava8(list);
		System.out.println("removing duplicates using java8"+lit3);
		
		
	}
	
	

}
