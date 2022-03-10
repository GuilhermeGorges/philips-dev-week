package com.guilhermephilipsdevweek.cancerdemamaapp.repository;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.AgeRange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgeRangeRepository extends JpaRepository<AgeRange, Long> {
}
