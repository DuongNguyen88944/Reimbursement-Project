package com.techproject.repository;

import java.util.List;

import com.techproject.entity.Request;
import com.techproject.utils.HibernateUtil;

public class RequestDAO implements RequestDAOInterface {

    @Override
    public List<Request> viewRequest() {
        HibernateUtil.beginTransaction();
        List<Request> requestList = HibernateUtil.getSession().createQuery("from Request",Request.class).getResultList();
        HibernateUtil.endTransaction();
        return requestList;
    }

    @Override
    public Request createRequest(Request newRequest) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().save(newRequest);
        HibernateUtil.endTransaction();
        return newRequest;
    }

    @Override
    public Request updateRequest(Request updatedRequest) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().update(updatedRequest);
        HibernateUtil.endTransaction();
        return updatedRequest;
    }
    
}
