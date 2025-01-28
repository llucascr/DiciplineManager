package com.llucascr.OrganizingCollegeDisciplines.repositories;

import com.llucascr.OrganizingCollegeDisciplines.entities.Dicipline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DiciplineRepository extends JpaRepository<Dicipline, Long> {
    @Modifying
    @Query(nativeQuery = true,  value = """
            DELETE FROM tb_record
            WHERE (dicipline_id, student_id) IN (
                SELECT d.id, r.student_id
                FROM tb_dicipline d
                INNER JOIN tb_record r ON d.id = r.dicipline_id
                WHERE d.name = :diciplineName AND r.student_id = :studentId
            );
            """)
    void deleteDicipline(String diciplineName, Long studentId);
}
