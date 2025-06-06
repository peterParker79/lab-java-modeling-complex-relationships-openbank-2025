package com.ironhack.complex.repositories;

import com.ironhack.complex.models.Conference;
import com.ironhack.complex.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Integer> {
}
