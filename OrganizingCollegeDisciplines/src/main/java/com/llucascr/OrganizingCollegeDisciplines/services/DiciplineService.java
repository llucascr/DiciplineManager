package com.llucascr.OrganizingCollegeDisciplines.services;

import com.llucascr.OrganizingCollegeDisciplines.dto.DiciplineDTO;
import com.llucascr.OrganizingCollegeDisciplines.dto.DiciplineIdStudentIdDTO;
import com.llucascr.OrganizingCollegeDisciplines.entities.Dicipline;
import com.llucascr.OrganizingCollegeDisciplines.repositories.DiciplineRepository;
import com.llucascr.OrganizingCollegeDisciplines.repositories.RegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DiciplineService {

    @Autowired
    private DiciplineRepository diciplineRepository;

    @Autowired
    private RegistryRepository recordRepository;

    @Transactional(readOnly = true)
    public List<DiciplineDTO> findAll() {
        List<Dicipline> result = diciplineRepository.findAll();
        return result.stream().map(x -> new DiciplineDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public DiciplineDTO findById(Long diciplineId) {
        Dicipline result = diciplineRepository.findById(diciplineId).get();
        return new DiciplineDTO(result);
    }

    @Transactional(readOnly = true)
    public DiciplineIdStudentIdDTO insertDicipline(Dicipline dicipline, Long studentId) {
        Dicipline result = diciplineRepository.save(dicipline);
        recordRepository.registry(dicipline.getId(), studentId);
        return new DiciplineIdStudentIdDTO(result, studentId);
    }

}
