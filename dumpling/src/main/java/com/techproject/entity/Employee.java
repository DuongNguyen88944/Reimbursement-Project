package com.techproject.entity;

public class Employee {
    private int id;
    private String first_name;
    private String last_name;
    private String role;
    private String e_username;
    private String e_password;
    
    public Employee() {
    }
    
    
    public Employee(String e_username, String e_password) {
        this.e_username = e_username;
        this.e_password = e_password;
    }


    public Employee(String first_name, String last_name, String role, String e_username, String e_password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
        this.e_username = e_username;
        this.e_password = e_password;
    }

    public Employee(int id, String first_name, String last_name, String role, String e_username, String e_password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
        return "Employee [e_password=" + e_password + ", e_username=" + e_username + ", first_name=" + first_name
                + ", id=" + id + ", last_name=" + last_name + ", role=" + role + "]";
    }

    
   

}
