package com.techproject;

import com.techproject.controllers.RequestController;
import com.techproject.repository.RequestDAO;
import com.techproject.repository.RequestDAOInterface;
import com.techproject.service.RequestsServiceInterface;
import com.techproject.service.RequestsService;
import com.techproject.utils.BusinessRules;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
            config.enableDevLogging();
        });

        RequestDAOInterface requestDao = new RequestDAO();
        BusinessRules businessRules = new BusinessRules();
        RequestsServiceInterface requestService = new RequestsService(requestDao, businessRules);
        RequestController requestController = new RequestController(requestService);

        app.get("/request", requestController.viewRequest);

        app.post("/request", requestController.createRequest);

        app.patch("/request/{id}", requestController.updateRequest);

       

        app.start();
    }
}
