package com.llucascr.OrganizingCollegeDisciplines.dto;

import com.llucascr.OrganizingCollegeDisciplines.projections.StudentMinProjection;
import org.springframework.beans.BeanUtils;

public class StudentAndDiciplineDTO {

////    private String name;
////    private String birthdayDate;
////    private String email;
//    private String course;
    private String diciplineName;
    private String status;
    private Double workGrade;
    private Double testGrade;
    private Double noteWeight;
    private Double finalGrade;

    public StudentAndDiciplineDTO() {
    }

    public StudentAndDiciplineDTO(StudentMinProjection projection) {
        BeanUtils.copyProperties(projection, this);
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getBirthdayDate() {
//        return birthdayDate;
//    }
//
//    public void setBirthdayDate(String birthdayDate) {
//        this.birthdayDate = birthdayDate;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

//    public String getCourse() {
//        return course;
//    }
//
//    public void setCourse(String course) {
//        this.course = course;
//    }

    public String getDiciplineName() {
        return diciplineName;
    }

    public void setDiciplineName(String diciplineName) {
        this.diciplineName = diciplineName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
