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

    

    public boolean checkUniqueEmployee(Employee employee){
        
        List<Employee> employeeList = employeeDao.CheckLogin("user","pwd");
        if(employeeList.size() == 1){
            return true;
        }else{
            return false;
        }
    
    }

    public boolean reimbursmentLessThousand(Request request){
        if (request.getRequest_amount() <= 1000){
            return true;
        }
        else{
            return false;
        }
    } 

  
    public boolean lessThanFiveHundred(Request request) {
        if (request.getRequest_desc().length() <= 500) {
            return true;
        } else {
            return false;

        }
    }

    public List<Request> viewOwnRequest(List<Request> initialList, String name){
        List<Request> filterList = new ArrayList<>();
        for(Request request : initialList){
          if(request.getEmployee_name().equals(name)){
             filterList.add(request);
          } 
        } 
        return filterList;
    }


}
