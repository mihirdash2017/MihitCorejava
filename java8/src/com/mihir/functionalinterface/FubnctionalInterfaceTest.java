package com.mihir.functionalinterface;

@FunctionalInterface
public interface FubnctionalInterfaceTest {
	public int add(int x,int y);
	default void getsms() {
		System.out.println("i am from functional interface");
	}

}
