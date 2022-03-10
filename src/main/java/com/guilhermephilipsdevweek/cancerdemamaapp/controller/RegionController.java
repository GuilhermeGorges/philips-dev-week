package com.guilhermephilipsdevweek.cancerdemamaapp.controller;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.Region;
import com.guilhermephilipsdevweek.cancerdemamaapp.service.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Region saveRegion(@RequestBody Region region){
        return  regionService.save(region);
    }

    @DeleteMapping("/{id}")
    public void deleteRegion(@PathVariable Long id){
        regionService.deleteById(id);
    }

}
