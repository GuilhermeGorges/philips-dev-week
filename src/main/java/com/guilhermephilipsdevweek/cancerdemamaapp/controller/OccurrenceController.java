package com.guilhermephilipsdevweek.cancerdemamaapp.controller;

import com.guilhermephilipsdevweek.cancerdemamaapp.service.OccurrenceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/occurrence")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class OccurrenceController {

    private final OccurrenceService occurrenceService;
}
