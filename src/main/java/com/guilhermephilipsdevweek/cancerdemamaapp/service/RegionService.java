package com.guilhermephilipsdevweek.cancerdemamaapp.service;

import com.guilhermephilipsdevweek.cancerdemamaapp.repository.RegionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegiaoService {

    private final RegionRepository regiaoRepository;

}
