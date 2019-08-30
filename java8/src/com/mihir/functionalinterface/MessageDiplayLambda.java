package com.mihir.functionalinterface;

public class MessageDiplayLambda {

	public static void main(String[] args) {
		FirstFunctionaIInterface fi=(x)->{return x;};
		String s=fi.firstWork("Hello brother");
		System.out.println(s);
	}

}
