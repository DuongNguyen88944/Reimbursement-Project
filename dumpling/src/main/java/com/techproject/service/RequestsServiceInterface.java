package com.techproject.service;

import java.util.List;

import com.techproject.entity.Request;

public interface RequestsServiceInterface {

    List<Request> serviceViewRequest();

    Request serviceCreateRequest(Request newRequest);
    
    Request serviceUpdateRequest(Request updatedRequest); 


}
