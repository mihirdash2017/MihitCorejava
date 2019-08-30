package com.mihir.prog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class APP {

	public static void main(String[] args) {
		Date d=new Date("23/10/2019");
		Date d1=new Date("25/10/2019");
		Date d2=new Date("24/10/2019");
		Date d3=new Date("21/10/2019");
		List<Employee>list=new ArrayList();
		List<Employee>sortedList=new ArrayList();
		list.add(new Employee(101, "Mihir", d, "se"));
		list.add(new Employee(103, "Tarun", d, "sse"));
		list.add(new Employee(105, "Vamsi", d, "se"));
		list.add(new Employee(104, "Mahesh", d, "Ase"));
		
		sortedList=list.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
