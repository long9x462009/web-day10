package com.example.webday10.controller;

import com.example.webday10.dto.FacultyDTO;
import com.example.webday10.dto.StudentDTO;
import com.example.webday10.entity.Faculty;
import com.example.webday10.entity.Passport;
import com.example.webday10.entity.Student;
import com.example.webday10.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    private FacultyService facultyService;

    @Autowired
    public FacultyController(FacultyService facultyService) {this.facultyService = facultyService;}

    @PostMapping
    public ResponseEntity<HttpStatus> insert(@RequestBody FacultyDTO body ){
        Faculty faculty = apply(body);
        facultyService.insert(faculty);

        return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
    }

    private Faculty apply(FacultyDTO body) {
        Faculty f = new Faculty();
        f.setName(body.getFacultyName());
        Set<Student> students = new HashSet<>();
        Set<StudentDTO> studentsDTOs = body.getStudents();
        for (StudentDTO sDTO : studentsDTOs) {
            Student s = new Student();
            s.setName(sDTO.getStudentName());
            Passport p = new Passport();
            p.setNumber(sDTO.getPassportNumber());
            s.setPassport(p);
            s.setFaculty(f);
            students.add(s);
        }
        f.setStudents(students);
        return f;
    }
}
