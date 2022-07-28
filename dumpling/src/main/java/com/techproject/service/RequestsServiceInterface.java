package com.techproject.service;

import java.util.List;

import com.techproject.entity.Request;

public interface RequestsServiceInterface {

    List<Request> serviceViewRequestByName(String name);

    Request serviceCreateRequest(Request newRequest);
    
    Request serviceUpdateRequest(Request updatedRequest); 

    List<Request> serviceViewRequest();

    List<Request> serviceViewRequestById(int idInput);
}
