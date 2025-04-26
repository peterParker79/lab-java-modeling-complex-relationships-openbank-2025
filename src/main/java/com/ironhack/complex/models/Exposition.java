package com.ironhack.complex.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

// No está más especializada que la clase padre Event
@Entity
@Table(name="exposition")
public class Exposition extends Event{
    public Exposition() {
    }

    public Exposition(EventType eventType, LocalDate date, int duration,
                      String location, String title, List<Guest> list) {
        super(eventType, date, duration, location, title, list);
    }


    @Override
    public String toString() {
        return "Exposition{" +
                "type=" + type +
                '}';
    }
}
