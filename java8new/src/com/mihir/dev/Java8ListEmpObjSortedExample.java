package com.mihir.dev;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8ListEmpObjSortedExample {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101, "Mihir"));
		list.add(new Employee(104,"Traun"));
		list.add(new Employee(103,"Vamsi"));
		list.add(new Employee(100,"Mahesh"));
		List<Employee> list1=list.stream().sorted().collect(Collectors.toList());
		System.out.println("only by using sorted() :"+list1);
		List<Employee> list2=list.stream().sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList());
		System.out.println(list2);
	}

}
