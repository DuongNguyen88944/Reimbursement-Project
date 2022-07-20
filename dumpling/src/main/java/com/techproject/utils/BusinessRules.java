package com.techproject.utils;



import com.techproject.entity.Employee;
import com.techproject.entity.Request;
import com.techproject.repository.EmployeeDAO;
import com.techproject.repository.EmployeeDAOInterface;

import java.util.List;

//import com.techproject.entity.Employee;

public class BusinessRules  {

    public static EmployeeDAOInterface employeeDao  = new EmployeeDAO();

    

    public boolean checkUniqueEmployee(Employee employee){
        
        
//        List<Employee> employeeList = employeeDao.CheckLogin(employee.getE_username(),employee.getE_password());
        List<Employee> employeeList = employeeDao.CheckLogin("user","pwd");
        if(employeeList.size() == 1){
            return true;
        }else{
            return false;
        }
    
    }

    public boolean ReimbursmentLessThousand(Request request){
        if (request.getRequest_amount() <= 1000){
            return true;
        }
        else{
            return false;
        }



    } 

  public class BusinessRules {
    public boolean lessThanFiveHundred(Request request) {
        if (request.getRequest_desc().length() <= 500) {
            return true;
        } else {
            return false;

        }
    }



}
