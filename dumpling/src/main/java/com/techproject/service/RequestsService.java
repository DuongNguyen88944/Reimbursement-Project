package com.techproject.service;

import com.techproject.entity.Request;
import com.techproject.exceptions.InvalidMessage;
import com.techproject.repository.RequestDAO;
import com.techproject.repository.RequestDAOInterface;
import com.techproject.utils.BusinessRules;

public class RequestsService implements RequestsServiceInterface {
    
    private RequestDAOInterface requestDao = new RequestDAO();
    private BusinessRules businessRule ;//= new BusinessRules();

    public RequestsService(RequestDAOInterface requestDao){
        this.requestDao = requestDao;
    }

    @Override
    public Request ServiceCreateRequest(Request newRequest) {
        businessRule = new BusinessRules();
        if (this.businessRule.ReimbursmentLessThousand(newRequest) ){

            return this.requestDao.createRequest(newRequest);
        }
        else{
            throw new InvalidMessage("Amount over $1000");        }
         
     }









}
