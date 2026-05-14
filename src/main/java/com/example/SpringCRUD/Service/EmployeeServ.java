package com.example.SpringCRUD.Service;

import java.util.List;
import java.util.Optional;

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
	
	public List<Employee> insertAll(List<Employee> e)
	{
		return repo.saveAll(e);
	}
	
    public Optional<Employee> getEmployeeById(Integer id) {
        return repo.findById(id);
    }

    
    public String deleteEmployee(Integer id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Employee deleted successfully";
        } else {
            return "Employee not found";
        }
    }

}
