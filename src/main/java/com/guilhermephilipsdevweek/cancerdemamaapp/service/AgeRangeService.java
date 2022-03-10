package com.guilhermephilipsdevweek.cancerdemamaapp.service;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.AgeRange;
import com.guilhermephilipsdevweek.cancerdemamaapp.repository.AgeRangeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AgeRangeService {

    private final AgeRangeRepository ageRangeRepository;


    public ResponseEntity<List<AgeRange>> listAllAgeRange() {
        try {
            List<AgeRange> ageRangeList = ageRangeRepository.findAll();
            return new ResponseEntity<>(ageRangeList, HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<AgeRange> getAgeRangeById(Long id) {
        try {

            Optional<AgeRange> ageRangeOptional = ageRangeRepository.findById(id);

            if(ageRangeOptional.isPresent()) {
                AgeRange ageRange = ageRangeOptional.get();
                return new ResponseEntity<>(ageRange, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public AgeRange save(AgeRange ageRange) {
        return ageRangeRepository.save(ageRange);
    }

    public void deleteById(Long id) {
        ageRangeRepository.getById(id);
    }
}
