package com.ironhack.complex.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;


    private String name;

    @Embedded
    private MemberStatus status;

    private LocalDate renewalDate;

    // Cada miembro pertenece a una sede. Se crea aqui en MEMBER la foreign key(lado muchos)
    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;


    public Member() {
    }

    public Member(String name, MemberStatus status, LocalDate renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberStatus getStatus() {
        return status;
    }

    public void setStatus(MemberStatus status) {
        this.status = status;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", renewalDate=" + renewalDate +
                '}';
    }
}
