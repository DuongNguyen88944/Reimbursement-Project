package com.techproject.utils;



import com.techproject.entity.Employee;
import com.techproject.entity.Request;
import com.techproject.repository.EmployeeDAO;
import com.techproject.repository.EmployeeDAOInterface;

import java.util.ArrayList;
import java.util.List;

//import com.techproject.entity.Employee;

public class BusinessRules  {

    public static EmployeeDAOInterface employeeDao  = new EmployeeDAO();

    
    // Check for unique Employee
    public boolean checkUniqueEmployee(Employee employee){
        
        List<Employee> employeeList = employeeDao.CheckLogin("Manager","password");
        if(employeeList.size() == 1){
            return true;
        }else{
            return false;
        }
    
    }

    //Request amount less than $1000
    public boolean reimbursmentLessThanThousand(Request request){
        if (request.getRequest_amount() <= 1000){
            return true;
        }
        else{
            return false;
        }
    } 

    //Request description less than 500 words
    public boolean requestLessThanFiveHundred(Request request) {
        if (request.getRequest_desc().length() <= 500 ) {
            return true;
        } else {
            return false;

        }
    }

    // Manager Reason Less Than 500 words
    public boolean reasonLessThanFiveHundred(Request request) {
        if (request.getManager_reason().length() <= 500 ) {
            return true;
        } else {
            return false;

        }
    }
    
    //View Request Base On Name
    public List<Request> viewOwnRequestByName(List<Request> initialList, String name){
        List<Request> filterList = new ArrayList<>();
        for(Request request : initialList){
          if(request.getEmployee_name().equals(name)){
             filterList.add(request);
          } 
        } 
        return filterList;
    }

    //View Request Base On Name
    public List<Request> viewOwnRequestById(List<Request> initialList, int idInput){
        List<Request> filterList = new ArrayList<>();
        for(Request request : initialList){
          if(request.getTicket_number() == idInput){
             filterList.add(request);
          } 
        } 
        return filterList;
    }
}
