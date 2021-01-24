package com.example.webday10.dto;

import java.util.Set;

public class FacultyDTO {

    private String facultyName;
    private Set<StudentDTO> students;

    public String getFacultyName(){
        return facultyName;
    }

    public void setFacultyName(String facultyName){
        this.facultyName = facultyName;
    }

    public Set<StudentDTO> getStudents() {
        return students;
    }

    public void setStudents(Set<StudentDTO> students) {
        this.students = students;
    }
}
