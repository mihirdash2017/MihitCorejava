package com.mihir.restExample.service;

import org.jvnet.hk2.annotations.Service;

import com.mihir.restExample.model.Employee;

@Service
public class EmployeeService {
	public Employee getEmpDetails(String id) {
		Employee e=new Employee();
		e.setId(101);
		e.setName("Mihir Dash");
		return e;
	}

}
