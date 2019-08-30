package com.mihir;

public class Abc extends Employee {
	private String sal;
	private String dept;
	public Abc(String sal, String dept) {
		super();
		this.sal = sal;
		this.dept = dept;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Abc [sal=");
		builder.append(sal);
		builder.append(", dept=");
		builder.append(dept);
		builder.append("]");
		return builder.toString();
	}
	
	

}
