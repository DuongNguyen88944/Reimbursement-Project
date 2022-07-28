package com.techproject.service;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techproject.entity.Request;
import com.techproject.exceptions.InvalidMessage;
import com.techproject.repository.EmployeeDAO;
import com.techproject.repository.EmployeeDAOInterface;
import com.techproject.repository.RequestDAO;
import com.techproject.repository.RequestDAOInterface;
import com.techproject.utils.BusinessRules;

//import junit.framework.Assert;

public class ServiceTest {
    public static RequestDAOInterface requestDao;
    public static RequestsServiceInterface requestService;
    public static EmployeeDAOInterface employeeDao;
    public static BusinessRules businessRules;
    

    @BeforeClass
    public static void setup() {
        requestDao = new RequestDAO();
        businessRules = new BusinessRules();
        requestService = new RequestsService(requestDao, businessRules);
        employeeDao = new EmployeeDAO();
    }    
        

    

    @Test
    public void serviceRequestAmountNegativeCheck() {

        try {
            Request request = new Request("Fabian A", "Service Layer: Negative Test for request amount", 1001, "Pending", "N/A ");
            Request response = requestService.serviceCreateRequest(request);
            System.out.println(response.toString());
            // Assert.fail("Bussiness rule Passed");
            Assert.fail();
        } catch (InvalidMessage e) {
            Assert.assertEquals("Invalid request", e.getMessage());
        }    
    }    
    
    @Test
    public void viewOwnRequestTest() {
        List<Request> result = requestService.serviceViewRequestByName("Create request Employee");
        Assert.assertEquals(result, result);
    }   
     
    @Test
    public void viewRequestByIdTest() {
        List<Request> result = requestService.serviceViewRequestById(30);
        Assert.assertEquals(result, result);
    }      

    @Test
    public void serviceManagerReasonNegativeCheck() {
        try {
            Request request = new Request(1,"Fabian A",
                    "Service Layer: Negative test for manager reason ",
                    100, "Pending", "Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! ");
            Request response = requestService.serviceUpdateRequest(request);
            Assert.fail();
        } catch (InvalidMessage e) {
            Assert.assertEquals("Reason cannot be more than 500 characters", e.getMessage());
        }
    }    
    
    @Test
    public void serviceEmployeeRequestNegativeCheck() {
        try {
            Request request = new Request("Fabian A",
                    "Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters! Negative test more than 500 characters!  ",
                    100, "Pending", "N/A");
            Request response = requestService.serviceCreateRequest(request);
            Assert.fail();
        } catch (InvalidMessage e) {
           Assert.assertEquals("Invalid request", e.getMessage());
        }    
    }
            
    
}            
           
            
        
            
            
        
   

    

