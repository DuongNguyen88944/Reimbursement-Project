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
      
    }
        

    @Test
    public void CheckLoginExist(){
        List<Employee> employeeList = employeeDao.CheckLogin("Manager","password");
        System.out.println("CheckLogin method EmployyeDao :" + employeeList.size());

        Assert.assertTrue(employeeList.size() > 0);
    } 

    @Test
    public void getRequestPositiveTest() {
        List<Request> requestList = requestDao.viewRequest();
        Assert.assertTrue(requestList.size() > 0);
    }

    @Test
    public void createRequestPositiveTest() {
        Request testRequest = new Request("Fabian","Create request repository layer", 600, "Pending", "N/A");
        Request result = requestDao.createRequest(testRequest);
        Assert.assertNotNull(result.getTicket_number());
    }

    @Test
    public void updateRequestPositiveTest() {
        Request updatedRequest = new Request(1,"Fabian", "Updated request repository layer", 500, "Accepted", "Acceptable Request");
        Request result = requestDao.updateRequest(updatedRequest);
        Assert.assertEquals("Accepted", result.getStatus());
    }

    

}
