package com.ironhack.complex.models;

import jakarta.persistence.Embeddable;

@Embeddable
public enum MemberStatus {
    ACTIVE,
    LAPSED
}
