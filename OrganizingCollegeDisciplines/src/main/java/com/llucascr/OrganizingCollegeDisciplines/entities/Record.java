package com.llucascr.OrganizingCollegeDisciplines.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_record")
public class Record {

    @EmbeddedId
    private RecordPK id = new RecordPK();

    private Double testGrade;
    private Double workGrade;
    private Double finalGrade;
    private Double noteWeight;

    public Record() {
    }

    public Record(Student student, Dicipline dicipline,Double testGrade, Double workGrade, Double finalGrade, Double noteWeight) {
        id.setStudent(student);
        id.setDicipline(dicipline);
        this.testGrade = testGrade;
        this.workGrade = workGrade;
        this.finalGrade = finalGrade;
        this.noteWeight = noteWeight;
    }

    public RecordPK getId() {
        return id;
    }

    public void setId(RecordPK id) {
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
