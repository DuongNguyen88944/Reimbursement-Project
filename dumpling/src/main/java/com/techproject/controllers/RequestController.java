package com.techproject.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.techproject.service.RequestsServiceInterface;
import com.techproject.exceptions.InvalidMessage;
import com.techproject.entity.Request;

import io.javalin.http.Handler;

public class RequestController {
    private RequestsServiceInterface requestService;
    private Gson gson;

    public RequestController(RequestsServiceInterface requestService) {
        this.requestService = requestService;
        this.gson = new GsonBuilder().serializeNulls().create();
    }

    public Handler viewRequest = ctx -> {
        List<Request> requests = this.requestService.serviceViewRequest();
        String requestsJSON = this.gson.toJson(requests);
        ctx.result(requestsJSON);
        ctx.status(200);
    };

    public Handler viewRequestWithBusinessRules = ctx -> {
        String employeeName = ctx.pathParam("name");
        List<Request> requests = this.requestService.serviceViewRequestByName(employeeName);
        String requestsJSON = this.gson.toJson(requests);
        ctx.result(requestsJSON);
        ctx.status(200);
    };
    
    public Handler createRequest = ctx -> {
        try {
            String json = ctx.body();
            Request newRequest = this.gson.fromJson(json, Request.class);
            Request result = this.requestService.serviceCreateRequest(newRequest);
            String resultJson = this.gson.toJson(result);
            ctx.result(resultJson);
            ctx.status(200);
        } catch (InvalidMessage e) {
            Map<String, String> message = new HashMap<>();
            message.put("message", e.getMessage());
            String messageJson = this.gson.toJson(message);
            ctx.result(messageJson);
            ctx.status(400);
        }
    };

    public Handler updateRequest = ctx -> {
        try {
            String Json = ctx.body();
            Request updatedRequest = this.gson.fromJson(Json, Request.class);
            updatedRequest.setTicket_number(Integer.parseInt(ctx.pathParam("id")));
            Request result = this.requestService.serviceUpdateRequest(updatedRequest);
            String resultJson = this.gson.toJson(result);
            ctx.result(resultJson);
            ctx.status(200);
        } catch (InvalidMessage e) {
            Map<String, String> message = new HashMap<>();
            message.put("message", "Invalid Reason");
            String messageJson = this.gson.toJson(message);
            ctx.result(messageJson);
            ctx.status(400);

        }
    };

    public Handler viewRequestBaseOnId = ctx -> {
        int idInput = Integer.parseInt(ctx.pathParam("id"));
        List<Request> requests = this.requestService.serviceViewRequestById(idInput);
        String requestsJSON = this.gson.toJson(requests);
        ctx.result(requestsJSON);
        ctx.status(200);
    };
}
