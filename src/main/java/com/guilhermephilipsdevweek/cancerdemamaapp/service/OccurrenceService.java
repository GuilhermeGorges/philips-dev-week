package com.guilhermephilipsdevweek.cancerdemamaapp.service;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.Occurrence;
import com.guilhermephilipsdevweek.cancerdemamaapp.repository.OccurrenceRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class OccurrenceService {

    private final OccurrenceRepository occurrenceRepository;

    public ResponseEntity<List<Occurrence>> listAllOccurrence() {
        try {
            List<Occurrence> occurrenceList = occurrenceRepository.findAll();
            return new ResponseEntity<>(occurrenceList, HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Occurrence> getOccurrenceById(Long id) {
        try {

            Optional<Occurrence> occurrenceOptional = occurrenceRepository.findById(id);

            if(occurrenceOptional.isPresent()) {
                Occurrence occurrence = occurrenceOptional.get();
                return new ResponseEntity<>(occurrence, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public Occurrence saveOccurrence(Occurrence occurrence) {
        return occurrenceRepository.save(occurrence);
    }

    public void deleteOccurrenceById(Long id) {
        occurrenceRepository.deleteById(id);
    }
}
