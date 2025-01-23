package com.llucascr.OrganizingCollegeDisciplines.dto;

import com.llucascr.OrganizingCollegeDisciplines.projections.StudentMinProjection;
import org.springframework.beans.BeanUtils;

public class StudentAndDiciplineDTO {

    private String name;
    private String birthdayDate;
    private String email;
    private String course;
    private String diciplineName;
    private Double workGrade;
    private Double testGrade;
    private Double noteWeight;
    private Double finalGrade;

//    public StudentAndDiciplineDTO(StudentMinProjection projection) {
//        this.name = projection.getName();
//        this.birthdayDate = projection.getBirthdayDate();
//        this.email = projection.getEmail();
//        this.course = projection.getCourse();
//        this.diciplineName = projection.getDiplineName();
//        this.workGrade = projection.getWorkGrade();
//        this.testGrade = projection.getTestGrade();
//        this.noteWeight = projection.getNoteWeight();
//        this.finalGrade = projection.getFinalGrade();
//    }

    public StudentAndDiciplineDTO(StudentMinProjection projection) {
        BeanUtils.copyProperties(projection, this);
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

    public String getDiciplineName() {
        return diciplineName;
    }

    public void setDiciplineName(String diciplineName) {
        this.diciplineName = diciplineName;
    }

    public Double getWorkGrade() {
        return workGrade;
    }

    public void setWorkGrade(Double workGrade) {
        this.workGrade = workGrade;
    }

    public Double getTestGrade() {
        return testGrade;
    }

    public void setTestGrade(Double testGrade) {
        this.testGrade = testGrade;
    }

    public Double getNoteWeight() {
        return noteWeight;
    }

    public void setNoteWeight(Double noteWeight) {
        this.noteWeight = noteWeight;
    }

    public Double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Double finalGrade) {
        this.finalGrade = finalGrade;
    }
}
