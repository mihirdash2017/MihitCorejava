package com.mihir.functionalinterface;

import java.util.ArrayList;

public class AddtionOfnumericfromAlpha2 {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList();
		int add = 0;
		String s = "as 12 3 rt5 67";
		s=s.replaceAll("[^A-Z ]", "") + " " + s.replaceAll("[^0-9 ]", "");
		System.out.println(s);

	}

}
