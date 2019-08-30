package com.mihir;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapOnBasisOfIntegerKey {

	public static void main(String[] args) {
		 Map<Integer, String> unsortedMap = new HashMap<Integer, String>();
	        unsortedMap.put(5, "asd");
	        unsortedMap.put(1, "cfd");
	        unsortedMap.put(7, "gdf");
	        unsortedMap.put(55, "qwe");
	        unsortedMap.put(66, "weq");
	        unsortedMap.put(3, "wer");
	        unsortedMap.put(8, "yes");
	        unsortedMap.put(93, "nsa");
	        unsortedMap.put(50, "tes");
	        unsortedMap.put(12, "mds");
	        unsortedMap.put(43, "fsa");

	      //Print the Elements of the Map before Sorting
	        System.out.println("Elements of the HashMap before Sorting");
	        System.out.println(unsortedMap);
	        Map<Integer,String>sorted=new TreeMap<Integer, String>(new Comparator<Integer>() {

				@Override
				public int compare(Integer i1, Integer i2) {
					
					return i1.compareTo(i2);
				}
	        	
			});
	        sorted.putAll(unsortedMap);
	        System.out.println("After sorting");
	        System.out.println(sorted);
	        
		
	}

}
