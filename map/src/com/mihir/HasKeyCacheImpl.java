package com.mihir;

import java.util.HashMap;

public class HasKeyCacheImpl implements HasKey<Object> {
	private static volatile HashMap<Object,Object> map;
	public long lastAccessed = System.currentTimeMillis();
    public String value;
	
	@Override
	public String key(Object  t) {
		String key;
		
		
		 synchronized (HasKeyCacheImpl.class) {
	            key=(String) map.get(t);
	            
	            if (key == null)
	                return null;
	            else {
	                lastAccessed = System.currentTimeMillis();
	                return key ;
	            }
	        }
		
		
		
	}

}
