package com.ironhack.complex;

import com.ironhack.complex.models.Event;
import com.ironhack.complex.models.EventType;
import jakarta.persistence.Embedded;

public class Expositions extends Event {
    @Embedded
    private EventType eventType;

}
