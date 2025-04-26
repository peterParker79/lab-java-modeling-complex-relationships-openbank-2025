package com.ironhack.complex.repositories;

import com.ironhack.complex.models.Conference;
import com.ironhack.complex.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository <Event, Integer>{
}
