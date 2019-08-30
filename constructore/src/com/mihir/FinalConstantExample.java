package com.mihir;

public class FinalConstantExample {
	final int x;
	{
		x=10;
	}
public void sms() {
	System.out.println(x);
}
	public static void main(String[] args) {
	
		FinalConstantExample exmp=new  FinalConstantExample();
		exmp.sms();
	}

}
