package com.guilhermephilipsdevweek.cancerdemamaapp.repository;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
}
