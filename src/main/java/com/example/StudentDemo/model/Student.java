package com.example.StudentDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Student {

    private String firstName, lastName, address;
    private int zipcode;

}
