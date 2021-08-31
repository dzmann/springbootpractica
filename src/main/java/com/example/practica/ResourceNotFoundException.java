package com.example.practica;

public class ResourceNotFoundException extends RuntimeException {

    private String id;

    public ResourceNotFoundException(String id){
        super("Resource with id " + id + " not found.");
    }

}
