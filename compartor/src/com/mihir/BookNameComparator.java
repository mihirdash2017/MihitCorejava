package com.mihir;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BookNameComparator implements Comparator<Authore> {

	@Override
	public int compare(Authore auth1, Authore auth2) {
		return auth1.firstName.compareTo(auth2.bookName);
	}

	
}
