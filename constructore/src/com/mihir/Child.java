package com.mihir;

public class Child extends Parent {
	


	Child(int z) {
		
		super(z);
		System.out.println("hello");
		
	}
	
	int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Child c=new Child(4);
		
	}

}
