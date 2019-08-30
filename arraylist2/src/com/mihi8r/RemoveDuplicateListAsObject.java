package com.mihi8r;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicateListAsObject {
	public static void main(String a[]) {
		List<Employee> list=new ArrayList<Employee>();
		Employee e=new Employee();
		e.setHeight(5.6);
		e.setWeight(75.0);
		e.setName("Amresh");
		Employee e1=new Employee();
		e1.setHeight(5.9);
		e1.setWeight(79.0);
		e1.setName("Mihir");
		Employee e2=new Employee();
		e2.setHeight(5.6);
		e2.setWeight(75.0);
		e2.setName("Amit");
		Employee e3=new Employee();
		e1.setHeight(5.9);
		e1.setWeight(79.0);
		e1.setName("Mahesh");
		
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		List<Employee>temp=list.stream().distinct().collect(Collectors.toList());
		System.out.println(temp);
	
	
	
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
