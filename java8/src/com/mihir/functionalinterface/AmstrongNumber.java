package com.mihir.functionalinterface;

import java.util.stream.IntStream;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		 IntStream.range(10, 10_00).filter((n) -> {
             int c = 0, temp = n;
             while (temp > 0) {
                 c += Math.pow(temp % 10, Integer.toString(n).length());
                 temp /= 10;
             }
             return c == n;
         }).forEach(System.out::println);
	}

}
