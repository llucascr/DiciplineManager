package com.llucascr.OrganizingCollegeDisciplines.dto;

import com.llucascr.OrganizingCollegeDisciplines.entities.Dicipline;

public class DiciplineMinDTO {

    private String name;
    private String duration;
    private String status;

    public DiciplineMinDTO() {
    }

    public DiciplineMinDTO(Dicipline dicipline) {
        name = dicipline.getName();
        duration = dicipline.getDuration();
        status = dicipline.getStatus();
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
