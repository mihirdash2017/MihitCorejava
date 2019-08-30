package com.mihir;

import java.io.Serializable;

public class Authore implements Serializable,Comparable<Authore>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 public String firstName; 
	 public String bookName;
	 public int auAge; 
	 
	public int getAuAge() {
		return auAge;
	}
	public void setAuAge(int auAge) {
		this.auAge = auAge;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Authore [firstName=");
		builder.append(firstName);
		builder.append(", bookName=");
		builder.append(bookName);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Authore authore) {
		
		return this.firstName.compareTo(authore.firstName);
	} 
	 

}
