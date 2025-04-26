package com.ironhack.complex.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Enumerated;

@Embeddable
public enum EventType {
    CONFERENCES,
    EXPOSITIONS
}
