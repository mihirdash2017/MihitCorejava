package com.mihir.accenture;

import java.util.concurrent.ConcurrentHashMap;

public class MissingValue {

	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5,6,8,9};
	       int n = arr.length;
	       int total = ((n + 1) * (n + 2)) / 2;
	       for (int j = 0; j < arr.length; j++) {
	           total = total - arr[j];
	       }
	       System.out.println(total);
	      
	}

}
