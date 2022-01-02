package com.cts.oup.usermanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.oup.model.Employee;

@RestController
public class UserManagement {

	
	@RequestMapping(value="/getAllemployee") 
	public List<Employee> getAllEmployee(){
		List<Employee> list = new ArrayList<Employee>() ;  
		list.add(new Employee(1222l, "abcd", "associate", "cts_pla_resolver", "developer")) ;
		list.add(new Employee(1223l, "abcde", "associate", "cts_pla_resolver", "developer")) ;
		return  list ; 
	}
}
