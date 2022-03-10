package com.guilhermephilipsdevweek.cancerdemamaapp.controller;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.Region;
import com.guilhermephilipsdevweek.cancerdemamaapp.service.RegiaoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RegiaoController {

    private final RegiaoService regiaoService;

    public List<Region> getAllRegiao(){
        return regiaoService.listAll();
    }
}
