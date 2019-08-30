package com.mihir;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReadHashMap {
	public static void main(String a[]) {
		  HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");

	      for (Map.Entry entry: hmap.entrySet()) {
			System.out.print(entry.getValue());
			System.out.print(" ");
		}
	      
	      Set set=hmap.entrySet();
	      Iterator iterator=set.iterator();
	     // hmap.remove(12);
	      while(iterator.hasNext()) {
	    	  Map.Entry entry=(Entry) iterator.next();
	    	  //iterator.remove();
	    	  System.out.println(" ");
	    	  System.out.print(entry.getKey());
	    	  System.out.print(entry.getValue());
	    	  
	      }
			
		
	}

}
