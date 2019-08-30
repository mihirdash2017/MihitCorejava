package com.mihir;

import java.io.FileNotFoundException;
import java.util.Date;

public class MyApp {

	public static void main(String[] args) {
		ImmutableDemo im = ImmutableDemo.getNewImmutableDemoInstance(100,"test", new Date());
        System.out.println(im);
        tryModification(im.getAge(),im.getName(),im.getDate());
        System.out.println(im);
        

	}

	private static void tryModification(int age, String name, Date date)  {
		age = 10000;
        name = "test changed";
        date.setDate(10);
		
	}

}
