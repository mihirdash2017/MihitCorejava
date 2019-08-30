package com.mihir;

public class ThreadExamle {

	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println(t.currentThread());
		System.out.println(t.getName());
		t.setName("mihir");
		System.out.println(t.getName());


	}

}
