package com.techproject.repository;

import java.util.List;

import org.hibernate.query.Query;

import com.techproject.entity.Employee;
import com.techproject.utils.HibernateUtil;

public class EmployeeDAO implements EmployeeDAOInterface {

    @Override
    public List<Employee> CheckLogin() {
        HibernateUtil.beginTransaction();
        System.out.println("CheckLogin method EmployyeDao");
        String SQLReq = "From Employee where e_username=: P_user and e_password=:P_pwd";       
        Query query =  HibernateUtil.getSession().createQuery(SQLReq);   
        query.setParameter("P_user","user");
        query.setParameter("P_pwd","pwd");
        List<Employee> employeesList = query.getResultList(); 
        HibernateUtil.endTransaction();
        return employeesList;

    }

}
