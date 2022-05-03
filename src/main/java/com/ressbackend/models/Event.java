package com.ressbackend.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "restaurant_name")
    private String restaurant_name;

    @Column(name = "event_name")
    private String event_name;

    @Column(name = "date")
    private int date;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private Type type;
}
