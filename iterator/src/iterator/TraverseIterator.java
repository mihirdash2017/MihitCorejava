package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraverseIterator {

	public static void main(String[] args) {
		List list=new ArrayList<>();
		list.add("mihir");
		list.add("vamsi");
		list.add("Traun");
		Iterator<String>i=list.iterator();
		while(i.hasNext()) {
			String val=i.next();
			if(val.equals("mihir")) {
				i.remove();
			}
		}
		System.out.println(list);
		
		
		

	}

}
