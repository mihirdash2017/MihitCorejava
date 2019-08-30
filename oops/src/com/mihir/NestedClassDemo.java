package com.mihir;

public class NestedClassDemo {
	
	int num = 10;
	 public static class Nested{
		 NestedClassDemo nd = new NestedClassDemo();
	  private int num = 15;
	  void msg(){
	   System.out.println("data is "+ num * num);
	  }
	 }
	 
	 
	 public static void main(String[] args) {
		 NestedClassDemo.Nested nested = new NestedClassDemo.Nested();
	  nested.msg();
	 }

}
