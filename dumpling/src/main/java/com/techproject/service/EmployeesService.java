package com.techproject.service;

import com.techproject.repository.EmployeeDAOInterface;

public class EmployeesService implements EmployeesServiceInterface{
    private EmployeeDAOInterface employeeDao;

    public EmployeesService(EmployeeDAOInterface employeeDao){
        this.employeeDao = employeeDao;
    }
}
