package com.mihir.java8list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LIstDemo {

	public static void main(String[] args) {
		 List<Book> list1 = new ArrayList<>();
	        List<Book> list2 = new ArrayList<>();
	        
		 list1.add(new Book("Core Java", 200));
         list1.add(new Book("Spring MVC", 300));
         list1.add(new Book("Learning Freemarker", 150));  
         
         list2.add(new Book("Core Java", 200));
         list2.add(new Book("Spring MVC", 300));
         list2.add(new Book("Learning Hibernate", 400));
         System.out.println("################ with duplicate###########################");
         List<Book> book=Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
         book.forEach(b->System.out.println(b.getName()+" :"+b.getPrice()));
         System.out.println("################# without duplicate#########################");
         book=Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
         book.forEach(b->System.out.println(b.getName()+" :"+b.getPrice()));
         
	}

}
