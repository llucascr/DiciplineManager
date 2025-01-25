package com.llucascr.OrganizingCollegeDisciplines.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class RegistryPK {

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "dicipline_id")
    private Dicipline dicipline;

    public RegistryPK() {
    }

    public RegistryPK(Student student, Dicipline dicipline) {
        this.student = student;
        this.dicipline = dicipline;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Dicipline getDicipline() {
        return dicipline;
    }

    public void setDicipline(Dicipline dicipline) {
        this.dicipline = dicipline;
    }
}
