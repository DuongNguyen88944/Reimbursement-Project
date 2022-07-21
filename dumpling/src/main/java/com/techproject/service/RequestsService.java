package com.techproject.service;

import java.util.List;

import com.techproject.entity.Request;

import com.techproject.exceptions.InvalidMessage;
import com.techproject.repository.RequestDAO;

import com.techproject.repository.RequestDAOInterface;
import com.techproject.utils.BusinessRules;

public class RequestsService implements RequestsServiceInterface {
    
    

    private RequestDAOInterface requestDao ;
    private BusinessRules businessRule ;

    public RequestsService(RequestDAOInterface requestDao, BusinessRules businessRule){
        this.requestDao = requestDao;
        this.businessRule = businessRule;
    }

    @Override
    public Request serviceCreateRequest(Request newRequest) {
     
        if (this.businessRule.reimbursmentLessThousand(newRequest) && this.businessRule.lessThanFiveHundred(newRequest)){

            return this.requestDao.createRequest(newRequest);
        }
        else{
            throw new InvalidMessage("invalid request");        }
         
     }

    @Override
    public List<Request> serviceViewRequest() {
        List<Request> requestList = requestDao.viewRequest();
        List<Request> result = businessRule.viewOwnRequest(requestList, "Duong Nguyen");
        return result;
    }

    @Override
    public Request serviceUpdateRequest(Request updatedRequest) {
        businessRule = new BusinessRules();
        if(this.businessRule.lessThanFiveHundred(updatedRequest)){
            return this.requestDao.updateRequest(updatedRequest);
        }else{
            throw new InvalidMessage("request cannot be more than 500 characters");
        }
      
    }










}
