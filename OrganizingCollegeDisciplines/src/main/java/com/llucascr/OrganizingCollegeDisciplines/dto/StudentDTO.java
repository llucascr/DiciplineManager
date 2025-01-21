package com.llucascr.OrganizingCollegeDisciplines.dto;

import com.llucascr.OrganizingCollegeDisciplines.entities.Student;

public class StudentDTO {

    private String name;
    private String birthdayDate;
    private String email;

    public StudentDTO() {
    }

    public StudentDTO(Student student) {
        name = student.getName();
        birthdayDate = student.getBirthdayDate();
        email = student.getEmail();
    }

    public String getName() {
        return name;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public String getEmail() {
        return email;
    }
}
