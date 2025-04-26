package com.ironhack.complex.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="event")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Event {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    // Me va a permitir discriminar para usar JOINED y tener
    //los diferentes eventos en tablas
    @Enumerated(EnumType.STRING)
    private EventType eventType;

    private LocalDate date;
    private int duration;
    private String location;
    private String title;


    //Un event tiene muchos invitados (OneToMany).
    // Solo Event conoce Guest
    //Guest no tiene por qué saber a que event pertenece pero,
    //TODO hacer que desde Guest se pueda saber a que event pertenece (Relación Bidireccional)
    //en la Clase Guest habrá por tanto @ManyToOne @JoinColumn(name="event_id") Event event
    @OneToMany(cascade =CascadeType.ALL)
    @JoinColumn(name="event_id") // Agrega la columna event_id en la tabla guest (foreign key)
    private List<Guest> list = new ArrayList<>();

    @Embedded
    @Enumerated(EnumType.STRING)
    EventType type;


    public Event() {}

    public Event(EventType eventType, LocalDate date,
                 int duration, String location, String title, List<Guest> list) {
        //this.id = id;
        this.eventType = eventType;
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Guest> getList() {
        return list;
    }

    public void setList(List<Guest> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", eventType=" + eventType +
                ", date=" + date +
                ", duration=" + duration +
                ", location='" + location + '\'' +
                ", title='" + title + '\'' +
                ", list=" + list +
                '}';
    }
}
