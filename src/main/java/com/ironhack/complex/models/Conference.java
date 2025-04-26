package com.ironhack.complex.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "conference")
public class Conference extends Event {




    // relacción tabla Conferences con speakers ONE TO MANY

    List<Speaker> speakers;
}
