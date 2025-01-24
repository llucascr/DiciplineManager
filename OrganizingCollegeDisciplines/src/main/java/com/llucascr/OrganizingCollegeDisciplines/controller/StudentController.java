package com.llucascr.OrganizingCollegeDisciplines.controller;

import com.llucascr.OrganizingCollegeDisciplines.dto.StudentAndDiciplineDTO;
import com.llucascr.OrganizingCollegeDisciplines.dto.StudentDTO;
import com.llucascr.OrganizingCollegeDisciplines.dto.StudentMinDTO;
import com.llucascr.OrganizingCollegeDisciplines.entities.Student;
import com.llucascr.OrganizingCollegeDisciplines.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/{id}")
    public StudentMinDTO findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @GetMapping(value = "/{studentId}/diciplines")
    public List<StudentAndDiciplineDTO> findStudentDiciplines(@PathVariable Long studentId) {
        return studentService.findStudentDiciplines(studentId);
    }

    @PostMapping
    public StudentMinDTO insertStudent(@RequestBody Student student) {
        return studentService.insertStudent(student);
    }

}
