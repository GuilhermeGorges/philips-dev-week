package com.guilhermephilipsdevweek.cancerdemamaapp.controller;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.AgeRange;
import com.guilhermephilipsdevweek.cancerdemamaapp.service.AgeRangeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/age-range")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AgeRangeController {

    private final AgeRangeService ageRangeService;

    @GetMapping
    public ResponseEntity<List<AgeRange>> listAllAgeRange(){
        return ageRangeService.listAllAgeRange();
    }

    @PostMapping
    public AgeRange saveAgeRange(@RequestBody AgeRange ageRange){
        return  ageRangeService.save(ageRange);
    }

    @DeleteMapping("/{id}")
    public void deleteAgeRange(@PathVariable Long id){
        ageRangeService.deleteById(id);
    }


}
