package com.llucascr.OrganizingCollegeDisciplines.dto;

import com.llucascr.OrganizingCollegeDisciplines.entities.Dicipline;

public class DiciplineDTO {

    private Long id;
    private String name;
    private String duration;
    private String status;

    public DiciplineDTO() {
    }

    public DiciplineDTO(Dicipline dicipline) {
        this.id = dicipline.getId();
        this.name = dicipline.getName();
        this.duration = dicipline.getDuration();
        this.status = dicipline.getStatus();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public String getStatus() {
        return status;
    }
}
