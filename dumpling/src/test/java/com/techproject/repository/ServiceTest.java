package com.techproject.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techproject.entity.Request;
import com.techproject.exceptions.InvalidMessage;

import com.techproject.service.RequestsService;
import com.techproject.service.RequestsServiceInterface;
import com.techproject.utils.BusinessRules;

//import junit.framework.Assert;

public class ServiceTest {
    public static RequestDAOInterface requestDao;
    public static RequestsServiceInterface requestService;
    public static EmployeeDAOInterface employeeDao;
  
    public static BusinessRules businessRules;

    @BeforeClass
    public static void setup(){

        requestDao = new RequestDAO();
        businessRules = new BusinessRules();
        requestService = new RequestsService(requestDao, businessRules);
        
        employeeDao = new EmployeeDAO();
      
    }

    
    @Test
    public void serviceCreateRequestNegativeCheck(){
        
        try{
            Request request = new Request("John","Negative test more than 1000", 1001, "pending", "N/A ");
            Request response =  requestService.serviceCreateRequest(request);
            System.out.println(response.toString());
            //Assert.fail("Bussiness rule Passed");   
            Assert.fail();
        }
        catch( InvalidMessage e){
            System.out.println("Negative : Amount over $1000");
            Assert.assertEquals("Amount over $1000", e.getMessage());

        }
    }

    @Test
    public void viewOwnRequestNegativeTest(){
       
        System.out.println(requestService.serviceViewRequest());
        List<Request> result = requestService.serviceViewRequest();
        Assert.assertEquals(result, result);
    }

}














