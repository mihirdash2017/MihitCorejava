package com.mihir;


public class AdditionNumberFromAlphanumString {

	public static void main(String[] args) {
		String a="1524sjhsdgs@$# 545";
		int sum = 0;
		 for (char c : a.replaceAll("\\D", "").toCharArray()) {
		     int digit = c - '0';
		     sum += digit;
		 }
		 System.out.println(sum);
		
	}
}
