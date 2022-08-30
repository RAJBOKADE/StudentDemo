package com.example.StudentDemo.controller;

import com.example.StudentDemo.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping(path = "/students/{studentId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> getStudent(@PathVariable long studentId) {

        Student s = new Student("Vedant", "Kamulkar", "Thane", 400123);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
}
