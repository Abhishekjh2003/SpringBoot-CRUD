package com.example.SpringCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringCRUD.Service.EmployeeServ;
import com.example.SpringCRUD.entity.Employee;

@RestController
public class EmployeeContr {
	
	@Autowired
	EmployeeServ serv;
	
	
	@PostMapping("/insert")
	public String insert(@RequestBody  Employee e)
	{
		serv.insertEmp(e);
		return "data insered";
		
	}

}
