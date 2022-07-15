package com.techproject.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techproject.entity.Request;


public class RepTest {

    public static RequestDAOInterface requestDao;
    public static EmployeeDAOInterface employeeDao;
    
    
    @BeforeClass
    public static void setup(){

        requestDao = new RequestDAO();
        employeeDao = new EmployeeDAO();


    }

    @Test
    public void getRequestPositiveTest(){
    List<Request> requestList = requestDao.viewRequest();
    Assert.assertTrue(requestList.size() > 0);
}



}
