package com.mihir;

public class MessageSub extends DisplayMessageSuper{
	static String sms="hi";
	int x=10;
	
	
	MessageSub(){

		this(sms,9);
	}

	public MessageSub(String sms2, int i) {
		
		System.out.println(sms+": "+i+":"+super.x);
	}

	public static void main(String[] args) {
		MessageSub s=new MessageSub();
		System.out.println(s.getSms());

	}

}
