package com.mihir;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondHihgest {
	public static void main(String a[]) {
		 int[] numbers = {67,87,2, 3, 5, 7, 11, 13};
		    IntStream intStream1 = Arrays.stream(numbers);
		    IntStream intStream2 = Arrays.stream(numbers);
		  //  int outx=intStream1.sorted().boxed().collect(Collectors.toList()).get(numbers.length-2);
		   // System.out.println("second highest value"+":"+outx);
		    List<Integer>list=intStream2.sorted().boxed().map(y->y*y).filter(x->x%2==0).collect(Collectors.toList());
		    System.out.println(list);
	}
}
