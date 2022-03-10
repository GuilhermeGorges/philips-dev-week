package com.guilhermephilipsdevweek.cancerdemamaapp.service;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.AgeRange;
import com.guilhermephilipsdevweek.cancerdemamaapp.entity.Region;
import com.guilhermephilipsdevweek.cancerdemamaapp.repository.RegionRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RegionService {

    private final RegionRepository regionRepository;

    public ResponseEntity<List<Region>> listAllRegion() {
        try {
            List<Region> regionList = regionRepository.findAll();
            return new ResponseEntity<>(regionList, HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Region> findRegionById(Long id) {
        try{

        Optional<Region> regionOptional = regionRepository.findById(id);

        if(regionOptional.isPresent()) {
            Region region = regionOptional.get();
            return new ResponseEntity<>(region, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    public Region saveRegion(Region region) {
        return regionRepository.save(region);
    }

    public void deleteRegionById(Long id) {
        regionRepository.deleteById(id);
    }
}
