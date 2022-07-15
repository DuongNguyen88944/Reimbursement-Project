package com.techproject.repository;

import org.junit.BeforeClass;

public class Test {

    public static RequestDAOInterface requestDao;
    public static EmployeeDAOInterface employeeDao;
    
    
    @BeforeClass
    public static void setup(){

        requestDao = new RequestDAO();
        employeeDao = new EmployeeDAO();


    }




}
