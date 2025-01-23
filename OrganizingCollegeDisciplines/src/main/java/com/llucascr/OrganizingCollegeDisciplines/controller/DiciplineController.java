package com.llucascr.OrganizingCollegeDisciplines.controller;

import com.llucascr.OrganizingCollegeDisciplines.dto.DiciplineDTO;
import com.llucascr.OrganizingCollegeDisciplines.services.DiciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/diciplines")
public class DiciplineController {

    @Autowired
    private DiciplineService diciplineService;

    @GetMapping
    public List<DiciplineDTO> findAll() {
        return diciplineService.findAll();
    }

    @GetMapping(value = "/{diciplineId}")
    public DiciplineDTO findById(@PathVariable Long diciplineId) {
        return diciplineService.findById(diciplineId);
    }
}
