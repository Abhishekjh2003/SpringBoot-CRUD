package com.example.SpringCRUD.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringCRUD.Repository.EmployeeRepo;
import com.example.SpringCRUD.entity.Employee;

@Service
public class EmployeeServ {
	
	@Autowired
	EmployeeRepo repo;
	
	public Employee insertEmp(Employee e)
	{
		return repo.save(e);
	}

}
