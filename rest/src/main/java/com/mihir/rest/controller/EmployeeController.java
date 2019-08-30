package com.mihir.rest.controller;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mihir.rest.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping(value="/ccb",method=RequestMethod.GET)
	public ResponseEntity<Employee> getEmpDetails(){
		Employee e=new Employee();
		e.setId(11);
		e.setName("Mihir Dash");
		return new ResponseEntity<Employee>(e, HttpStatus.OK);
	}

}
