package com.llucascr.OrganizingCollegeDisciplines.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_dicipline")
public class Dicipline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String duration;
    private String status;

    public Dicipline() {
    }

    public Dicipline(Long id, String name, String duration, String status) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dicipline dicipline = (Dicipline) o;
        return Objects.equals(id, dicipline.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
