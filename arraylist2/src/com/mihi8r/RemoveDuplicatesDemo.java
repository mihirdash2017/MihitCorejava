package com.mihi8r;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesDemo {

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<>();
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Bangalore");
        cityList.add("Chennai");
        cityList.add("Kolkata");
        cityList.add("Kolkata");
        cityList.add("Mumbai");
        //duplicate removing
        List<String> newList = new ArrayList<>();
        for (String string : cityList) {
        	if(!newList.contains(string)) {
        		newList.add(string);
        	}
			
		}
        System.out.println("duplicate removing using list :"+newList);
        
        HashSet<String>set=new HashSet<>(cityList);
        System.out.println("duplicate removing using set :"+set);
        
        cityList=cityList.stream().distinct().collect(Collectors.toList());
        
        System.out.println("duplicate removing using java8 :"+cityList);
        
        		

	}

}
