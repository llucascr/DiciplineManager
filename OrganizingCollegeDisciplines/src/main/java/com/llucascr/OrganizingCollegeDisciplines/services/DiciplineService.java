package com.llucascr.OrganizingCollegeDisciplines.services;

import com.llucascr.OrganizingCollegeDisciplines.dto.DiciplineDTO;
import com.llucascr.OrganizingCollegeDisciplines.entities.Dicipline;
import com.llucascr.OrganizingCollegeDisciplines.repositories.DiciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DiciplineService {

    @Autowired
    private DiciplineRepository diciplineRepository;

    @Transactional(readOnly = true)
    public List<DiciplineDTO> findAll() {
        List<Dicipline> result = diciplineRepository.findAll();
        return result.stream().map(x -> new DiciplineDTO(x)).toList();
    }

}
