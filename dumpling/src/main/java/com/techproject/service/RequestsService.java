package com.techproject.service;

import com.techproject.repository.RequestDAOInterface;

public class RequestsService implements RequestsServiceInterface {
    
    private RequestDAOInterface requestDao;

    public RequestsService(RequestDAOInterface requestDao){
        this.requestDao = requestDao;
    }









}
