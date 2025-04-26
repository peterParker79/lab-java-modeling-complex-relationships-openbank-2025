package com.ironhack.complex.models;

import jakarta.persistence.Embeddable;

@Embeddable
public enum GuestStatus {
    ATTENDING,
    NOT_ATTENDING,
    NO_RESPONSE

}
