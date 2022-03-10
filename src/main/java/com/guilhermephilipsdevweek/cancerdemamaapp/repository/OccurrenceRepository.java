package com.guilhermephilipsdevweek.cancerdemamaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccurrenceRepository extends JpaRepository<OccurrenceRepository, Long> {
}
