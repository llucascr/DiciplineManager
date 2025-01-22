package com.llucascr.OrganizingCollegeDisciplines.dto;

import com.llucascr.OrganizingCollegeDisciplines.entities.Student;

public class StudentDTO {

    private Long id;
    private String name;
    private String birthdayDate;
    private String email;
    private String course;

    public StudentDTO() {
    }

    public StudentDTO(Student student) {
        id = student.getId();
        name = student.getName();
        birthdayDate = student.getBirthdayDate();
        email = student.getEmail();
        course = student.getCourse();
    }

    public Long getId() {
        return id;
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

    public String getCourse() {
        return course;
    }
}
