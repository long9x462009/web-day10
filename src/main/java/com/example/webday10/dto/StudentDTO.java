package com.example.webday10.dto;

public class StudentDTO {
    private String studentName;
    private String passportNumber;

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getPassportNumber(){
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber){
        this.passportNumber = passportNumber;
    }
}
