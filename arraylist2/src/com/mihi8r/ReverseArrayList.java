package com.mihi8r;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
	public static List<String>getReverseList(List<String> list){
		List<String> newList=new ArrayList();
		for(int i=list.size()-1;i>=0;i--) {
			newList.add(list.get(i));
		}
		return  newList;
	}

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println("before revrse the list is :"+list);
		List<String> list1=getReverseList(list);
		System.out.println("after revrse the list is :"+list1);
	    Collections.reverse(list);
	    System.out.println("using collections class :"+list);

	}

}
