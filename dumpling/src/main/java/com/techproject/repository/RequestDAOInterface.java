package com.techproject.repository;

import java.util.List;

import com.techproject.entity.Request;

public interface RequestDAOInterface {
    
    List<Request> viewRequest();

    Request createRequest(Request newRequest);

    Request updateRequest(Request updatedRequest); 
}
