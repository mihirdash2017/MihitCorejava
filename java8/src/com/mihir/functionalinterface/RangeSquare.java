package com.mihir.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeSquare {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(2,13);
		Predicate< Double> predicate= e->{
				if(Math.sqrt(e)<13&&Math.sqrt(e)>3)
				{	
					return true;
				}
			return false;
		};
		List<Integer>newList=list.stream().map(x->x*x).filter(s->s<13&&s>2).collect(Collectors.toList());
		IntStream.range(2, 13).map(x->x*x).filter(s->s<13&&s>=2).forEach(x->System.out.println(x+"range method"));
		//IntStream.range(2,13).filter(x->predicate.test((double) x)).forEach(x->System.out.println(x+" "));
		System.out.println(newList);
	}

}
