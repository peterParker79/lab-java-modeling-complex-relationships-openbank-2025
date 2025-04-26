package com.ironhack.complex.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="speaker")
public class Speaker {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String name;
    private int presentationDuration; //minutes duration

    @ManyToMany (mappedBy = "speakers")
    private List<Conference> conferences;

}
