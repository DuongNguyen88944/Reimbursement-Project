package com.techproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String first_name;
    private String last_name;
    private String e_role;
    private String e_username;
    private String e_password;
    
    public Employee() {
    }
    
    
    public Employee(String e_username, String e_password) {
        this.e_username = e_username;
        this.e_password = e_password;
    }


    

    public Employee(String first_name, String last_name, String e_role, String e_username, String e_password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.e_role = e_role;
        this.e_username = e_username;
        this.e_password = e_password;
    }

    

    public Employee(int id, String first_name, String last_name, String e_role, String e_username, String e_password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.e_role = e_role;
        this.e_username = e_username;
        this.e_password = e_password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getE_role() {
        return e_role;
    }


    public void setE_role(String e_role) {
        this.e_role = e_role;
    }

    public String getE_username() {
        return e_username;
    }

    public void setE_username(String e_username) {
        this.e_username = e_username;
    }

    public String getE_password() {
        return e_password;
    }

    public void setE_password(String e_password) {
        this.e_password = e_password;
    }


    @Override
    public String toString() {
        return "Employee [e_password=" + e_password + ", e_role=" + e_role + ", e_username=" + e_username
                + ", first_name=" + first_name + ", id=" + id + ", last_name=" + last_name + "]";
    }

    

    

    
   

}
