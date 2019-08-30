package com.mihir;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingMap {
	public static void main(String a[]) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");
        
        //java8
        hmap.entrySet().stream()
        .sorted(Map.Entry.<Integer,String>comparingByKey()).forEach(e->{
        	System.out.print(e.getKey()+":"+ e.getValue());
        	System.out.print(" ");
        });
        
        
        System.out.println("Before sorting the map is");
        Set set= hmap.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()) {
        	Map.Entry entry=(Entry) itr.next();
        	System.out.print(entry.getKey()+":"+entry.getValue());
        }

	}

}
