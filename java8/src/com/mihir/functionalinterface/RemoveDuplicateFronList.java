package com.mihir.functionalinterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class RemoveDuplicateFronList {

	public static void main(String[] args) {
		 List<Book> list1 = new ArrayList<>();
	      
	           list1.add(new Book("Core Java", 200));
	           list1.add(new Book("Spring MVC", 300));
	           list1.add(new Book("Learning Freemarker", 150));  
	           list1.add(new Book("Core Java", 200));
	           list1.add(new Book("Spring MVC", 300));
	           list1.add(new Book("Learning Hibernate", 400));  
	           System.out.println("Before removing duplicate :"+list1);
	           
	         list1.stream().sorted(Comparator.comparing(Book::getName)).distinct().forEach(System.out::println);
	          
	          Consumer<Book> con = (e)->{
	        	  
	        	  System.out.println(Thread.currentThread().getName()+"  ::::  "+e);
	          };
	          
	          list1.parallelStream().forEachOrdered(con);
	          
	          
	}

}
