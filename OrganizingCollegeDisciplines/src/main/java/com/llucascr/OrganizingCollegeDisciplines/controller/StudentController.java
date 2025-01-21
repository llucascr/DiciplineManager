package com.llucascr.OrganizingCollegeDisciplines.controller;

import com.llucascr.OrganizingCollegeDisciplines.dto.StudentDTO;
import com.llucascr.OrganizingCollegeDisciplines.entities.Student;
import com.llucascr.OrganizingCollegeDisciplines.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentDTO> findAll() {
        return studentService.findAll();
    }

}
