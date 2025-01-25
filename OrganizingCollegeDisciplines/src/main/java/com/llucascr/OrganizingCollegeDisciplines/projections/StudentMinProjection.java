package com.llucascr.OrganizingCollegeDisciplines.projections;

public interface StudentMinProjection {
    Long getId();
    String getBirthdayDate();
    String getCourse();
    String getEmail();
    String getName();
    String getDiciplineName();
    Double getWorkGrade();
    Double getTestGrade();
    Double getNoteWeight();
    Double getFinalGrade();
    String getStatus();

}
