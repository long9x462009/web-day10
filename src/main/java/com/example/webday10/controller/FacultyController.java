package com.example.webday10.controller;

import com.example.webday10.entity.Student;
import com.example.webday10.service.FacultyService;
import com.example.webday10.transform.StudentTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    private FacultyService facultyService;

    @Autowired
    public StudentController(FacultyService facultyService) {this.facultyService = facultyService;}

    @PostMapping
    public ResponseEntity<HttpStatus> insert(RequestBody FacultyDTO body){
        StudentTransform transform = new StudentTransform();
        Student s = transform.apply(body);
        facultyService.insert(f);

        return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
    }
}
