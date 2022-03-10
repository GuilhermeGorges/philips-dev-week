package com.guilhermephilipsdevweek.cancerdemamaapp.repository;

import com.guilhermephilipsdevweek.cancerdemamaapp.entity.Occurrence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccurrenceRepository extends JpaRepository<Occurrence, Long> {
}
