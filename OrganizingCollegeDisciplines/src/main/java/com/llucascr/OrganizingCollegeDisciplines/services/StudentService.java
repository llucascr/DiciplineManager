package com.llucascr.OrganizingCollegeDisciplines.services;

import com.llucascr.OrganizingCollegeDisciplines.dto.StudentAndDiciplineDTO;
import com.llucascr.OrganizingCollegeDisciplines.dto.StudentDTO;
import com.llucascr.OrganizingCollegeDisciplines.dto.StudentMinDTO;
import com.llucascr.OrganizingCollegeDisciplines.entities.Student;
import com.llucascr.OrganizingCollegeDisciplines.projections.StudentMinProjection;
import com.llucascr.OrganizingCollegeDisciplines.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional(readOnly = true)
    public List<StudentDTO> findAll() {
        List<Student> result = studentRepository.findAll();
        return result.stream().map(x -> new StudentDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public StudentMinDTO findById(Long id){
        Student result = studentRepository.findById(id).get();
        return new StudentMinDTO(result);
    }

    @Transactional(readOnly = true)
    public List<StudentAndDiciplineDTO> findStudentDiciplines(Long studentId) {
        List<StudentMinProjection> result = studentRepository.searchByDicipline(studentId);
        return result.stream().map(x -> new StudentAndDiciplineDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public StudentMinDTO insertStudent(Student student) {
        Student result = studentRepository.save(student);
        return new StudentMinDTO(result);
    }

    public void updateStudent(Long studentId, Student studentDetails) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("student id not found"));

        student.setName(studentDetails.getName());
        student.setBirthdayDate(studentDetails.getBirthdayDate());
        student.setEmail(studentDetails.getEmail());
        student.setCourse(studentDetails.getCourse());

        studentRepository.save(student);
    }
}
