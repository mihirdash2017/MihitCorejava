package com.mihir.accenture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DistinctValue {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,4,5,6,7,7,8,8,4,4,2);
		for(int i=0;i<list.size();i++) {
			if(Collections.frequency(list, list.get(i))<2) {
				System.out.println(list.get(i));
			}
		}
	}

}
