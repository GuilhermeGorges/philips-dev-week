package com.guilhermephilipsdevweek.cancerdemamaapp.service;

import com.guilhermephilipsdevweek.cancerdemamaapp.controller.AgeRangeController;
import com.guilhermephilipsdevweek.cancerdemamaapp.entity.AgeRange;
import com.guilhermephilipsdevweek.cancerdemamaapp.repository.AgeRangeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AgeRangeService {

    private final AgeRangeRepository ageRangeRepository;

    public AgeRange save(AgeRange ageRange) {
        return ageRangeRepository.save(ageRange);
    }

    public void deleteById(Long id) {
        ageRangeRepository.getById(id);
    }
}
