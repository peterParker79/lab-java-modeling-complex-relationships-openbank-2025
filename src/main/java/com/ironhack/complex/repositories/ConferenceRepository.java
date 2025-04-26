package com.ironhack.complex.repositories;

import com.ironhack.complex.models.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Integer> {
}
