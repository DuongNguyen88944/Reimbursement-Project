package com.techproject.repository;

import java.util.List;

import org.junit.BeforeClass;

import com.techproject.entity.Employee;

//import junit.framework.Assert;

import org.junit.Assert;
//import org.junit.BeforeClass;
import org.junit.Test;


public class RepTest {

    public static RequestDAOInterface requestDao;
    public static EmployeeDAOInterface employeeDao;
    
    
    @BeforeClass
    public static void setup(){

        requestDao = new RequestDAO();
        employeeDao = new EmployeeDAO();


    }

     @Test
    public void CheckLoginExist(){
        List<Employee> employeeList = employeeDao.CheckLogin();
        System.out.println("CheckLogin method EmployyeDao :"+employeeList.size());

        Assert.assertTrue(employeeList.size() == 1);
    } 

    // @Test // Make sure to add this @Test annotation
    // public void createBookPositiveTest(){ // This is a positive test, so I note it in the test name
    //     Employee testEmployee = new Employee("viet","nguyen","employee","viet","viet");
    //     Employee result = employeeDao.CreateEmployee(testEmployee);
    //     Assert.assertNotNull(result.getId());
    // }

}
