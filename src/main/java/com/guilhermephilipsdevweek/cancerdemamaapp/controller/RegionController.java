package com.guilhermephilipsdevweek.cancerdemamaapp.controller;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.Region;
import com.guilhermephilipsdevweek.cancerdemamaapp.service.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/region")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RegionController {

    private final RegionService regionService;

    @GetMapping
    public List<Region> getAllRegion(){
        return regionService.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Region> getRegionById(@PathVariable Long id){
        return regionService.findById(id);
    }

}
