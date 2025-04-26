package com.ironhack.complex.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name= "conference")
public class Conference extends Event {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    // relacción con tabla intermedia (JOIN__TABLE) ManyToMany. Tabla intermedia frgnKey+frgnKey=PK
    @ManyToMany
    @JoinTable(
            name ="conference_speaker",
            joinColumns = @JoinColumn(name = "conference_id"), // la columna de un extremo
            inverseJoinColumns = @JoinColumn(name = "speaker_id") //la otra columna de la relación
            )
    private List<Speaker> speakers;

    public Conference() {
    }

    public Conference(EventType eventType, LocalDate date,
                      int duration, String location, String title,
                      List<Guest> list,List<Speaker> speakers) {
        super(eventType, date, duration, location, title, list);
        this.speakers = speakers;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "type" + type +
                "speakers=" + speakers +
//                ", type=" + type +
                '}';
    }
}
