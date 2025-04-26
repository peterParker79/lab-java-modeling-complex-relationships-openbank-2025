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

    @OneToOne
    @JoinColumn (name="president_id", referencedColumnName = "id") //crea un campo AQUI EN CHAPTER referenciando a member
    private Member president;

   //relación de Chapter 1 - * Members de momento unidireccional
    @OneToMany(mappedBy = "chapter")
    //@OneToMany(cascade=CascadeType.ALL)
    //@JoinColumn(name="chapter_id") Esto crea foreign key EN MEMBER

    private List<Member> members;
}
