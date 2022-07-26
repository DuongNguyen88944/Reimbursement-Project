package com.techproject.controllers;

import io.javalin.http.Handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.techproject.entity.Employee;
import com.techproject.repository.EmployeeDAOInterface;

public class LoginController {
    
    private Gson gson;
    private EmployeeDAOInterface  employee;


    

    public LoginController(EmployeeDAOInterface LoginEmployee) {
        this.employee = LoginEmployee;
        gson= new Gson();
    }


    public Handler Login = ctx -> {
        String json = ctx.body();
        // we then use Gson to convert the json string into the java class we are working with
        Employee employeeLogin = this.gson.fromJson(json, Employee.class);
        //employee = new EmployeeDAO();
        List<Employee> employeeList = this.employee.CheckLogin(employeeLogin.getE_username(), employeeLogin.getE_password());
        if(employeeList.size() == 1){
            
            String resultJson = this.gson.toJson(employeeList);
            ctx.result(resultJson);
            ctx.status(200);
            
            
            
            
            //Map<String, String> message = new HashMap<>();
            //message.put("message", "Sucessfully Log in ");
            // once the map is made we convert it into a json
            //String messageJson = this.gson.toJson(message);
            // then we attach it to the response body and set the status code
            //ctx.result(messageJson);
            //ctx.status(200); // will need to double check status code at some point
        //    ctx.result("Hello World");
        //    ctx.status(200); // will need to double check status code at some point
        }else{
            // create a map to easily make key/value pair for json
            Map<String, String> message = new HashMap<>();
            // place the exception message into the map
            message.put("message", "User or Password not found");
            // convert the map into a json
            String messageJson = this.gson.toJson(message);
            // attach the json to the response body and set the status code
            ctx.result(messageJson);
            ctx.status(400);
        }
    };
 
}
