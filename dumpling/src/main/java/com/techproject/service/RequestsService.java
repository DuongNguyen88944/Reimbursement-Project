package com.techproject.service;

import com.techproject.entity.Request;
import com.techproject.repository.RequestDAOInterface;
import com.techproject.utils.BusinessRules;

public class RequestsService implements RequestsServiceInterface {
    
    private RequestDAOInterface requestDao;
    private BusinessRules businessRules;
    public RequestsService(RequestDAOInterface requestDao){
        this.requestDao = requestDao;
    }

  

    @Override
    public Request serviceUpdateRequest(Request updatedRequest) {
       businessRules =new BusinessRules();
        if(this.businessRules.lessThanFiveHundred(updatedRequest)){
        return this.requestDao.updateRequest(updatedRequest);
    } else {
        
    }
}

  









}
