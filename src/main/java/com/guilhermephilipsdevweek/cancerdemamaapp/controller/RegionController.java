package com.guilhermephilipsdevweek.cancerdemamaapp.controller;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.Region;
import com.guilhermephilipsdevweek.cancerdemamaapp.service.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RegionController {

    private final RegionService regionService;

    public List<Region> getAllRegion(){
        return regionService.listAll();
    }
}
