package com.mihir.springboot.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


import com.mihir.springboot.model.Employee;

@Service

public class EmployeeXmlService {
	EmployeeXmlService(){
		System.out.println("i am from service class for singleton obj");
	}
	
	public Employee getInfo(Employee emp) {
		emp.setName("Mihir Dash");
		emp.setCname("Accenture");
		emp.setAge(28);
		return emp;
	}

}
