package com.llucascr.OrganizingCollegeDisciplines.services;

import com.llucascr.OrganizingCollegeDisciplines.dto.StudentDTO;
import com.llucascr.OrganizingCollegeDisciplines.dto.StudentMinDTO;
import com.llucascr.OrganizingCollegeDisciplines.entities.Student;
import com.llucascr.OrganizingCollegeDisciplines.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentDTO> findAll() {
        List<Student> result = studentRepository.findAll();
        return result.stream().map(x -> new StudentDTO(x)).toList();
    }

    public StudentMinDTO findById(Long id){
        Student result = studentRepository.findById(id).get();
        return new StudentMinDTO(result);
    }
}
