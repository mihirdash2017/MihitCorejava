package com.mihir;

public class StringSplitDemo {
	public static void main(String a[]) {
		String str="mihir.dash@gmail.com";
		String[] split = str.split("@");
		System.out.println(split[0]);
		 String[] split2 = split[0].split("\\.");
		System.out.println(split2[0]);
		System.out.println(split2[1]);
	}

}
