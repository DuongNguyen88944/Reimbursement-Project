package com.techproject.service;

import java.util.List;

import com.techproject.entity.Employee;

public interface EmployeesServiceInterface {
    List<Employee>  serviceCheckLogin(String u, String p);
}
