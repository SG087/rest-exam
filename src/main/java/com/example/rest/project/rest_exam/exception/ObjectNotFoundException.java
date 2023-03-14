package com.example.rest.project.rest_exam.exception;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

    public ObjectNotFoundException() {
    }
}
