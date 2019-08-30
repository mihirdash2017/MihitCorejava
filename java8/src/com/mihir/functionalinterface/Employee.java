package com.mihir.functionalinterface;

public class Employee {
	public int id;
	public String namr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamr() {
		return namr;
	}
	public void setNamr(String namr) {
		this.namr = namr;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((namr == null) ? 0 : namr.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (namr == null) {
			if (other.namr != null)
				return false;
		} else if (!namr.equals(other.namr))
			return false;
		return true;
	}
	public Employee(int id, String namr) {
		super();
		this.id = id;
		this.namr = namr;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", namr=");
		builder.append(namr);
		builder.append("]");
		return builder.toString();
	}
	

}
