package com.mihir.functionalinterface;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddtionOfnumericfromAlpha {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList();
		int add = 0;
		String s = "as 12 3 rt5 @ # 67";
		Pattern p = Pattern.compile("(\\d+)");
		Matcher m = p.matcher(s);
		while (m.find()) {
			list.add(m.group());
			
		}
		for(int i=0;i<list.size();i++) {
			int temp=Integer.parseInt(list.get(i));
			add=add+temp;
		}
		System.out.println(add);

	}
}