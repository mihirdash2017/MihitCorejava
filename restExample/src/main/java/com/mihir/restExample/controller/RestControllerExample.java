package com.mihir.restExample.controller;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mihir.restExample.model.Employee;
import com.mihir.restExample.service.EmployeeService;


@RestController
public class RestControllerExample {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value="/emp",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON,consumes=MediaType.APPLICATION_JSON)
	public ResponseEntity<Employee>getEmpDetails(){
		String id="101";
		System.out.println("id is:"+id);
		Employee e=service.getEmpDetails(id);
		return new ResponseEntity<Employee>(e, HttpStatus.OK);
	}

}
