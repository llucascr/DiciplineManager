package com.llucascr.OrganizingCollegeDisciplines.repositories;

import com.llucascr.OrganizingCollegeDisciplines.entities.Student;
import com.llucascr.OrganizingCollegeDisciplines.projections.StudentMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(nativeQuery = true, value = """
            SELECT
                tb_student.id,
                tb_student.birthday_date AS birthdayDate,
                tb_student.course,
                tb_student.email,
                tb_student.name,
                tb_dicipline.name AS diciplineName,
                tb_dicipline.status as status,
                tb_record.work_grade AS workGrade,
                tb_record.test_grade AS testGrade,
                tb_record.note_weight AS noteWeight,
                tb_record.final_grade AS finalGrade
            FROM tb_record
            INNER JOIN tb_student ON tb_student.id = tb_record.student_id
            INNER JOIN tb_dicipline ON tb_dicipline.id = tb_record.dicipline_id
            WHERE tb_record.student_id = :studentId;
            """)
    List<StudentMinProjection> searchByDicipline(Long studentId);
}
