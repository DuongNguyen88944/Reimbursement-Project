package com.techproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "requests")
public class Request {
    @Id
    @GeneratedValue
    private int ticket_number;
    private String employee_name;
    private String request_desc;
    private int request_amount;
    private String status;
    private String manager_reason;
    
    public Request() {
    }

    public Request(String employee_name, String request_desc, int request_amount, String status,
            String manager_reason) {
        this.employee_name = employee_name;
        this.request_desc = request_desc;
        this.request_amount = request_amount;
        this.status = status;
        this.manager_reason = manager_reason;
    }

    public Request(int ticket_number, String employee_name, String request_desc, int request_amount, String status,
            String manager_reason) {
        this.ticket_number = ticket_number;
        this.employee_name = employee_name;
        this.request_desc = request_desc;
        this.request_amount = request_amount;
        this.status = status;
        this.manager_reason = manager_reason;
    }

    
    public Request(String request_desc, int request_amount, String status, String manager_reason) {
        this.request_desc = request_desc;
        this.request_amount = request_amount;
        this.status = status;
        this.manager_reason = manager_reason;
    }

    public int getTicket_number() {
        return ticket_number;
    }


    public void setTicket_number(int ticket_number) {
        this.ticket_number = ticket_number;
    }


    public String getEmployee_name() {
        return employee_name;
    }


    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }


    public String getRequest_desc() {
        return request_desc;
    }


    public void setRequest_desc(String request_desc) {
        this.request_desc = request_desc;
    }


    public int getRequest_amount() {
        return request_amount;
    }


    public void setRequest_amount(int request_amount) {
        this.request_amount = request_amount;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public String getManager_reason() {
        return manager_reason;
    }


    public void setManager_reason(String manager_reason) {
        this.manager_reason = manager_reason;
    }


    @Override
    public String toString() {
        return "Request [employee_name=" + employee_name + ", manager_reason=" + manager_reason + ", request_amount="
                + request_amount + ", request_desc=" + request_desc + ", status=" + status + ", ticket_number="
                + ticket_number + "]";
    }


    
    
    
    
}
