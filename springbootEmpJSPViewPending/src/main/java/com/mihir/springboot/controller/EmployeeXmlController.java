package com.mihir.springboot.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mihir.springboot.model.Employee;
import com.mihir.springboot.service.EmployeeXmlService;

@RestController
@RequestMapping(value="/xml")
public class EmployeeXmlController {
	
	@Autowired
	EmployeeXmlService employeeXmlService;
	
	@RequestMapping(value="/sms",method=RequestMethod.GET,produces=MediaType.APPLICATION_XML)
	public ResponseEntity<Employee>getInfo(){
		
		Employee emp=new Employee();
		employeeXmlService.getInfo(emp);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
	

}
