package com.mihir.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiedableList {

	public static void main(String[] args) {
		List<String> listOfString = new ArrayList<>();
		listOfString.add("Java");
		listOfString.add("Kotlin");
		listOfString.add("Groovy");
		listOfString.add("Scala");
		listOfString = Collections.unmodifiableList(listOfString);
		System.out.println("before adding elements :"+listOfString);
		System.out.println("before adding elements :"+listOfString.hashCode());
		listOfString.add("mihir");
		System.out.println("After modified list"+listOfString);
		System.out.println("After modified list"+listOfString.hashCode());


	}

}
