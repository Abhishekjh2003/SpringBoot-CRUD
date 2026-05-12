package com.example.SpringCRUD.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@PostMapping("/all")
	public List<Employee> insertAl(@RequestBody List<Employee> e)
	{
		return serv.insertAll(e);
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> findEmployee(@PathVariable Integer id)
	{
		return serv.getEmployeeById(id);
	}
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        return serv.deleteEmployee(id);
    }

}
