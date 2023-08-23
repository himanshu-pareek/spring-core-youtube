package controllers;

import services.AuthorService;

public class AuthorController {

    private AuthorService service;

    AuthorController() {
        System.out.println("AuthorController::<Constructor>");
    }

    public void setService(AuthorService service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "AuthorController{" +
                "service=" + service +
                '}';
    }
}
