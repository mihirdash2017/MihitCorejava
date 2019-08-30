package com.mihir.functionalinterface;

import java.util.Arrays;

public class StringExtention {

	public static void main(String[] args) {
		
			String s=                   "abc.mp3 100b\n"
										+ "xyz.aa.mp3 210b\n"
										+ "qwerty.mp4 142b\n"
										+ "ggd.jpg 3b\n"
										+"dfd.jpg 56b\n"; 
						 int mp3 = Arrays.stream(s.split("\n"))
						 		.filter(e->e.contains(".mp3"))
						 		.flatMap(e->Arrays.stream(e.split(" "))).filter(e1->e1.endsWith("b"))
						 		.mapToInt(b->Integer.parseInt(b.substring(0,b.length()-1))).sum();
						 int mp4 = Arrays.stream(s.split("\n"))
							 		.filter(e->e.contains(".mp4"))
							 		.flatMap(e->Arrays.stream(e.split(" "))).filter(e1->e1.endsWith("b"))
							 		.mapToInt(b->Integer.parseInt(b.substring(0,b.length()-1))).sum();
 
						 int jpg = Arrays.stream(s.split("\n"))
							 		.filter(e->e.contains(".jpg"))
							 		.flatMap(e->Arrays.stream(e.split(" "))).filter(e1->e1.endsWith("b"))
							.mapToInt(b->Integer.parseInt(b.substring(0,b.length()-1))).sum();
						 
						 System.out.println("mp3  :::"+mp3);
						 System.out.println("mp4  :::"+mp4);
						 System.out.println(".jpg  :::"+jpg); 
			 


	}

}
