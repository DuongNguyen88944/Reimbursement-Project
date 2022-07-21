package com.techproject.repository;

import java.util.List;

import org.junit.BeforeClass;
import com.techproject.entity.Employee;
import com.techproject.entity.Request;

import org.junit.Assert;
import org.junit.Test;


public class RepTest {

    public static RequestDAOInterface requestDao;
    public static EmployeeDAOInterface employeeDao;
    
    @BeforeClass
    public static void setup(){

        requestDao = new RequestDAO();
        employeeDao = new EmployeeDAO();

        Request setupUpdateRequest = new Request(4,"Duong Nguyen", "request not updated", 500, "Pending", "N/A");
        requestDao.createRequest(setupUpdateRequest);

    }

     @Test
    public void CheckLoginExist(){
        List<Employee> employeeList = employeeDao.CheckLogin("user","pwd");
        System.out.println("CheckLogin method EmployyeDao :"+employeeList.size());

        Assert.assertTrue(employeeList.size() == 1);
    } 

    @Test
    public void getRequestPositiveTest() {
        List<Request> requestList = requestDao.viewRequest();
        Assert.assertTrue(requestList.size() > 0);
    }

    @Test
    public void createPositiveRequests() {
        Request testRequest = new Request("Duong Nguyen","Testing fees", 400, "Pending", "N/A");
        Request result = requestDao.createRequest(testRequest);
        Assert.assertNotNull(result.getTicket_number());
    }

    @Test
    public void updateBookPositiveTest() {
        Request updatedRequest = new Request(4,"Duong Nguyen", "mile fees", 400, "updated", "don't want to");
        Request result = requestDao.updateRequest(updatedRequest);
        Assert.assertEquals("updated", result.getStatus());
    }

}
