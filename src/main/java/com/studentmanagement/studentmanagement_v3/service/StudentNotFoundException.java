package com.studentmanagement.studentmanagement_v3.service;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String message) {
        super(message);
    }
}