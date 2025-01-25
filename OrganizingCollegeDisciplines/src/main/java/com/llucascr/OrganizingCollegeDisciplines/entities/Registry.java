package com.llucascr.OrganizingCollegeDisciplines.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_record")
public class Registry {

    @EmbeddedId
    private RegistryPK id = new RegistryPK();

    @Column(columnDefinition = "DOUBLE DEFAULT 0.0")
    private Double testGrade;
    @Column(columnDefinition = "DOUBLE DEFAULT 0.0")
    private Double workGrade;
    @Column(columnDefinition = "DOUBLE DEFAULT 0.0")
    private Double finalGrade;
    @Column(columnDefinition = "DOUBLE DEFAULT 0.0")
    private Double noteWeight;

    public Registry() {
    }

    public Registry(Student student, Dicipline dicipline, Double testGrade, Double workGrade,
                    Double finalGrade, Double noteWeight) {
        id.setStudent(student);
        id.setDicipline(dicipline);
        this.testGrade = testGrade;
        this.workGrade = workGrade;
        this.finalGrade = finalGrade;
        this.noteWeight = noteWeight;
    }

    public RegistryPK getId() {
        return id;
    }

    public void setId(RegistryPK id) {
        this.id = id;
    }

    public Double getTestGrade() {
        return testGrade;
    }

    public void setTestGrade(Double testGrade) {
        this.testGrade = testGrade;
    }

    public Double getWorkGrade() {
        return workGrade;
    }

    public void setWorkGrade(Double workGrade) {
        this.workGrade = workGrade;
    }

    public Double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Double getNoteWeight() {
        return noteWeight;
    }

    public void setNoteWeight(Double noteWeight) {
        this.noteWeight = noteWeight;
    }

}
