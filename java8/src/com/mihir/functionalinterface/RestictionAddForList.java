package com.mihir.functionalinterface;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RestictionAddForList extends AbstractList<Employee> {

	
	static List<Employee> asList = new ArrayList<>();
	@Override
	public Employee get(int index) {

		return  asList.get(index);
	}

	@Override
	public int size() {
		return asList.size();
	}

	public static void main(String[] args) {
		Predicate<Employee> emp=e->e.getId()==500;
		
		asList.add(new Employee(500,"Tarun"));
		asList.add(new Employee(4,"Amit"));
		asList.add(new Employee(5,"Vamsi"));
		asList.add(new Employee(1,"Mihir"));
		
		asList.removeIf(e->emp.test(e));
		System.out.println(asList);
		
		asList.remove(2);
		

	}

}
