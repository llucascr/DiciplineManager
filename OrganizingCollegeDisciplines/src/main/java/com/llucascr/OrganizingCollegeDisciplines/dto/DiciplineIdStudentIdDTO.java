package com.llucascr.OrganizingCollegeDisciplines.dto;

import com.llucascr.OrganizingCollegeDisciplines.entities.Dicipline;
import com.llucascr.OrganizingCollegeDisciplines.projections.RegistryProjection;

public class DiciplineIdStudentIdDTO {

    private Long diciplineId;
    private Long studentId;
    private String diciplineName;

    public DiciplineIdStudentIdDTO() {
    }

    public DiciplineIdStudentIdDTO(Dicipline dicipline, Long studentId) {
        diciplineId = dicipline.getId();
        diciplineName = dicipline.getName();
        this.studentId = studentId;
    }

    public DiciplineIdStudentIdDTO(RegistryProjection projection) {
        diciplineId = projection.getDiciplineId();
        studentId = projection.getStudentId();
    }

    public Long getDiciplineId() {
        return diciplineId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getDiciplineName() {
        return diciplineName;
    }
}
