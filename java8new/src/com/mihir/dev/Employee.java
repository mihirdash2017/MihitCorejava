package com.mihir.dev;

public class Employee implements Comparable<Employee> {
	int empid;
	String empName;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}
	   @Override
       public boolean equals(final Object obj) {
         if (obj == null) {
            return false;
         }
         final Employee std = (Employee) obj;
         if (this == std) {
            return true;
         } else {
            return (this.empName.equals(std.empName) && (this.empid == std.empid));
         }
       }
       @Override
       public int hashCode() {
         int hashno = 7;
         hashno = 13 * hashno + (empName == null ? 0 : empName.hashCode());
         return hashno;
       }
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empid=");
		builder.append(empid);
		builder.append(", empName=");
		builder.append(empName);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Employee emp) {
			if(this.empid==emp.empid)
				return 0;
			if(this.empid>emp.empid)
				return 1;
			else
				return -1;
		
	}

	

}
