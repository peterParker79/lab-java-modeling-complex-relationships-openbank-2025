package com.ironhack.complex.models;


import jakarta.persistence.*;

@Entity
@Table(name="speaker")
public class Speaker {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String name;
    private int presentationDuration; //minutes duration
}
