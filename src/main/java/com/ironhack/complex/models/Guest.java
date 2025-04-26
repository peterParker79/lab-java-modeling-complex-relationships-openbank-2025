package com.ironhack.complex.models;

import jakarta.persistence.*;

@Entity
@Table(name="guest")
public class Guest {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    private String name;
    private GuestStatus status;



}
