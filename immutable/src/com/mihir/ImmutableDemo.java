package com.mihir;

import java.util.Date;

public  final class ImmutableDemo {
	
	private final Integer age;
	private  final String name;
	private final Date date;
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		System.out.println(date.getTime());
		return new Date(date.getTime());
	}
	private ImmutableDemo(Integer age, String name, Date date) {
		super();
		this.age = age;
		this.name = name;
		this.date = new Date(date.getTime());
	}
	public static ImmutableDemo getNewImmutableDemoInstance(Integer age,String name,Date date) {
		return new ImmutableDemo(age, name, date);
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ImmutableDemo [age=");
		builder.append(age);
		builder.append(", name=");
		builder.append(name);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
