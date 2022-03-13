package com.guilhermephilipsdevweek.cancerdemamaapp.controller;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.Region;
import com.guilhermephilipsdevweek.cancerdemamaapp.service.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/region")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RegionController {

    private final RegionService regionService;

    @GetMapping
    public ResponseEntity<List<Region>> getAllRegion(){
        return regionService.listAllRegion();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Region> getRegionById(@PathVariable Long id){
        return regionService.findRegionById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Region saveRegion(@RequestBody Region region){
        return  regionService.saveRegion(region);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteRegion(@PathVariable Long id){
        regionService.deleteRegionById(id);
    }

}
