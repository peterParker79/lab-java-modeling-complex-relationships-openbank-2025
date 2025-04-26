package com.ironhack.complex.models;

import jakarta.persistence.Embedded;

import java.util.List;

public class Conference extends Event {



    // TODO relacción tabla Conferences con speakers ONE TO MANY
    List<Speaker> speakers;
}
