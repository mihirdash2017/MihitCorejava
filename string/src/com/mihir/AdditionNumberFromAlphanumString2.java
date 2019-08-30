package com.mihir;

public class AdditionNumberFromAlphanumString2 {

	public static void main(String[] args) {
		String str="1524sjhsdgs@#$ 545";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				sum=sum+Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
	}

}
