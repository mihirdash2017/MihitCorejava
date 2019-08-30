package com.mihir;

import java.util.Hashtable;
import java.util.Map;

public class ExceptionDemo {
	public void test() throws ArithmeticException{
		/*int a=0;
		int b=5;
		int res=b/a;*/
	}
	public void test2() {
		test();
	}

	public static void main(String[] args) {
		ExceptionDemo demo=new ExceptionDemo();
		demo.test2();
		
		Hashtable<String, String> t = new Hashtable<>();
		t.put(null, "fghf");
	}

}
