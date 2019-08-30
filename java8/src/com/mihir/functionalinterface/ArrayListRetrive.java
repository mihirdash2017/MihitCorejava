package com.mihir.functionalinterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRetrive {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("mihir");
		list.add("Vamsi");
		list.add("Mahesh");
		list.forEach(name ->{
			System.out.println("list value is :"+name);
		});

	}

}
