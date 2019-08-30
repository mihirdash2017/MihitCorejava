package com.mihir.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortCustomerByName {
	public static void main(String a[]) {
		
		List<Customer> clist=new ArrayList();
		Customer c1=new Customer();
		c1.setId(101);
		c1.setName("Tarun");
		Customer c2=new Customer();
		c2.setId(103);
		c2.setName("Mihir");
		Customer c3=new Customer();
		c3.setId(102);
		c3.setName("Amit");
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		
		//java8
		System.out.println("before sorting :"+clist);
		List sortedListByName=clist.stream().sorted(Comparator.comparing(Customer::getName)).collect(Collectors.toList());
		System.out.println("After sorting by name :"+sortedListByName);
		List sortedById=clist.stream().sorted(Comparator.comparing(Customer::getId)).collect(Collectors.toList());
		System.out.println("After sortng bi id :"+sortedById);
		
		//java7
		Collections.sort(clist,new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("After sorting by java7 :"+clist);
		
		
		
	}

}
