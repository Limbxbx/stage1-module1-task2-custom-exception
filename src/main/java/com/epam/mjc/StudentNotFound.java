package com.epam.mjc;

public class StudentNotFound extends IllegalArgumentException{
    public StudentNotFound(String message){
        super(message);
    }
}
