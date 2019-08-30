package com.mihi8r;

import java.util.ArrayList;
import java.util.List;

public class IteratingAList {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList();
		list.add("mihir");
		list.add("Vamsi");
		list.add("Mahesh");
		//java 7
		for(String name:list){
			System.out.println(name);
		}
		//java8
		list.forEach(p->{
			System.out.println("from java 8 "+p);
			
		});
	}

}
