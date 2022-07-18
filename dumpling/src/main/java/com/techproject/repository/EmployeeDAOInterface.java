package com.techproject.repository;

import java.util.List;

import com.techproject.entity.Employee;

public interface EmployeeDAOInterface {
    
    List<Employee>  CheckLogin();

    //Employee CreateEmployee(Employee employee);
    
}
