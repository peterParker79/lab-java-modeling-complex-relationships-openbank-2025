package com.ironhack.complex.models;

import jakarta.persistence.Embedded;

import java.time.LocalDate;

public class Member {
    private String name;

    @Embedded
    private MemberStatus status;

    private LocalDate renewalDate;

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
