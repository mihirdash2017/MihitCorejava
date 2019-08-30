package com.mihi8r;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<>();
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Bangalore");
        cityList.add("Chennai");
        cityList.add("Kolkata");
       
        Collections.sort(cityList);
        System.out.println("sorted list is :"+cityList);
        
        //java8
        cityList=cityList.stream().sorted().collect(Collectors.toList());
        
        System.out.println("sorted list is using java8 :"+cityList);
        
        
        

	}

}
