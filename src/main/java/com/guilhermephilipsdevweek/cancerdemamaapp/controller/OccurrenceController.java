package com.guilhermephilipsdevweek.cancerdemamaapp.controller;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.Occurrence;
import com.guilhermephilipsdevweek.cancerdemamaapp.service.OccurrenceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/occurrence")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class OccurrenceController {

    private final OccurrenceService occurrenceService;

    @GetMapping
    public ResponseEntity<List<Occurrence>> listAllOccurrence(){
        return occurrenceService.listAllOccurrence();
    }

    @GetMapping("{/id}")
    public ResponseEntity<Occurrence> getOccurrenceById(@PathVariable Long id){
        return occurrenceService.getOccurrenceById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Occurrence saveOccurrence(@RequestBody Occurrence occurrence){
        return  occurrenceService.saveOccurrence(occurrence);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteOccurrence(@PathVariable Long id){
        occurrenceService.deleteOccurrenceById(id);
    }


}
