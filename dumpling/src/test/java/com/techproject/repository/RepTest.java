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
    public static void setup() {

        requestDao = new RequestDAO();
        employeeDao = new EmployeeDAO();
    }

    @Test
    public void getRequestPositiveTest() {
        List<Request> requestList = requestDao.viewRequest();
        Assert.assertTrue(requestList.size() > 0);
    }

    @Test
    public void createPositiveRequests() {
        Request testRequest = new Request("Testing fees", 400, "Pending", "N/A");
        Request result = requestDao.createRequest(testRequest);
        Assert.assertNotNull(result.getTicket_number());
    }

    @Test
    public void updateBookPositiveTest() {
        Request updatedRequest = new Request(1, "mile fees", 1000, "updated", "don't want to");
        Request result = requestDao.updateRequest(updatedRequest);
        Assert.assertEquals("updated", result.getStatus());
    }

}
