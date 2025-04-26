package com.ironhack.complex.models;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name="chapter")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String district;

    private Member president;


   //TODO relación de Chapter members
    private List<Member> members;
}
