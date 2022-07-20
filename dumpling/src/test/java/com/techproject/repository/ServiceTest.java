package com.techproject.repository;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techproject.entity.Request;
import com.techproject.exceptions.InvalidMessage;
import com.techproject.service.EmployeesService;
import com.techproject.service.EmployeesServiceInterface;
import com.techproject.service.RequestsService;
import com.techproject.service.RequestsServiceInterface;

//import junit.framework.Assert;

public class ServiceTest {
    public static RequestDAOInterface requestDao;
    public static RequestsServiceInterface requestService;
    public static EmployeeDAOInterface employeeDao;
    public static EmployeesServiceInterface employeeService;

    @BeforeClass
    public static void setup(){
        requestDao = new RequestDAO();
        requestService = new RequestsService(requestDao);
        employeeDao = new EmployeeDAO();
        employeeService = new EmployeesService(employeeDao);
    }

    
    @Test
    public void serviceCreateRequestNegativeCheck(){
        Request request = new Request("Negative test more than 1000", 100, "pending", " ");
        try{
            Request Response =  requestService.ServiceCreateRequest(request);
            System.out.println(Response.toString());
            //Assert.fail("Bussiness rule Passed");   
            Assert.fail("Amount less 1000");
        }
        catch( InvalidMessage e){
            System.out.println("Negative : Amount over $1000");
            Assert.assertEquals("Amount over $1000", e.getMessage());

        }

//        Assert.assertEquals("invalid book: please try again", e.getMessage());
//        if (Response == null){
//            System.out.println(" return null  more 1000");
//        }
//        else{
//            System.out.println(" return null less 1000");            
//        }
//        Assert.assertNotNull(Response);

        
    }















}
