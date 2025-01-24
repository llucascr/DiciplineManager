package com.llucascr.OrganizingCollegeDisciplines.entities;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "tb_student")
public class Student {

//    @Column(name = "ra")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String name;
    private String birthdayDate;
    private String email;
    private String course;

    // Constructor
    public Student() {
    }

    public Student(long id, String name, String birthdayDate, String email, String course) {
        this.Id = id;
        this.name = name;
        this.birthdayDate = birthdayDate;
        this.email = email;
        this.course = course;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Equals / HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Id == student.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }
}
