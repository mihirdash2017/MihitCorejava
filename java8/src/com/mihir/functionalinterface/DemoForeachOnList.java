package com.mihir.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class DemoForeachOnList {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("Mihir","Malay","Paralay","Praful");
		list.stream().sorted().forEach(y->{System.out.println(y);});

	}

}
