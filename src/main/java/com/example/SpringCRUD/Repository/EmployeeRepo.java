package com.example.SpringCRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringCRUD.entity.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

}
