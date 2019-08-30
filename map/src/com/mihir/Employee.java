package com.mihir;

public class Employee {
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		
		return 101;
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	

}
