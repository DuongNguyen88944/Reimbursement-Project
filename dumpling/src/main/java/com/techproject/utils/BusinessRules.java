package com.techproject.utils;

import com.techproject.entity.Request;

public class BusinessRules {
    public boolean lessThanFiveHundred(Request request) {
        if (request.getRequest_desc().length() <= 500) {
            return true;
        } else {
            return false;

        }
    }
}
