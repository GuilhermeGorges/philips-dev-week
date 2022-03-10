package com.guilhermephilipsdevweek.cancerdemamaapp.service;

import com.guilhermephilipsdevweek.cancerdemamaapp.controller.AgeRangeController;
import com.guilhermephilipsdevweek.cancerdemamaapp.entity.AgeRange;
import com.guilhermephilipsdevweek.cancerdemamaapp.repository.AgeRangeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public ResponseEntity<List<AgeRange>> listAllAgeRange() {
        try {
            List<AgeRange> ageRangeList = ageRangeRepository.findAll();
            return new ResponseEntity<>(ageRangeList, HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
