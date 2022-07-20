package com.techproject.repository;

import org.junit.BeforeClass;

import com.techproject.service.EmployeesService;
import com.techproject.service.EmployeesServiceInterface;
import com.techproject.service.RequestsServiceInterface;

public class ServiceTest {
    public static RequestDAOInterface requestDao;
    public static RequestsServiceInterface requestService;
    public static EmployeeDAOInterface employeeDao;
    public static EmployeesServiceInterface employeeService;

    @BeforeClass
    public static void setup(){
        //requestDao = new RequestsDAO();
       // requestService = new RequestsService(requestDao);
        employeeDao = new EmployeeDAO();
        employeeService = new EmployeesService(employeeDao);
    }















}
