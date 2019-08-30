package com.mihir.functionalinterface;

public class FinalValueAddition {
	int a;
	public int add(final int a,final int b) {
		//a=a+b;
		return a+b;
	}

	public static void main(String[] args) {
		FinalValueAddition val=new FinalValueAddition();
		int a=val.add(5,6);
		System.out.println(a);

	}

}
