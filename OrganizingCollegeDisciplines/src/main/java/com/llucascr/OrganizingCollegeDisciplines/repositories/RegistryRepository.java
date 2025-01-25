package com.llucascr.OrganizingCollegeDisciplines.repositories;

import com.llucascr.OrganizingCollegeDisciplines.entities.Registry;
import com.llucascr.OrganizingCollegeDisciplines.entities.RegistryPK;
import com.llucascr.OrganizingCollegeDisciplines.projections.RegistryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface RegistryRepository extends JpaRepository<Registry, RegistryPK> {


    @Modifying
    @Query(nativeQuery = true, value = """
            INSERT INTO tb_record (dicipline_id, student_id) VALUES (:diciplineId, :studentId);
            """)
    void registry(Long diciplineId, Long studentId);
}
