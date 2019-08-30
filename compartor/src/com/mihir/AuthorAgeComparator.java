package com.mihir;

import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<Authore>{

	@Override
	public int compare(Authore auth1, Authore auth2) {
		if(auth1.auAge==auth2.auAge)
				return 0;
		else if(auth1.auAge>auth2.auAge)
			return 1;
		else
			return -1;
		
	}

}
