package com.mihir.dev;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8SetEmpObjSortedExample {

	public static void main(String[] args) {
	
		//using natural sorting
		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee(101, "mihir"));
		set.add(new Employee(104, "Tarun"));
		set.add(new Employee(100, "mahesh"));
		set.add(new Employee(98, "vamsi"));
		set.stream().sorted().forEach(b->System.out.println(b.getEmpid()+":"+b.getEmpName()));
	//using customizing soring
		System.out.println("customizing sorting");
		Set<Employee> set1 =set.stream().sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toSet());
		System.out.println(set1);
	}

}
