package com.example.airline.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;

@Entity 
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_flight")
    private Long idFlight;

    @ManyToOne
    @JoinColumn(name = "airline", referencedColumnName = "id_airline")
    private Airline airline;

    @ManyToOne
    @JoinColumn(name = "origin_id_airport", referencedColumnName = "id_airport")
    private Airport origin;

    @ManyToOne
    @JoinColumn(name = "destination_id_airport", referencedColumnName = "id_airport")
    private Airport destination;

    @Column(name = "departure_date")
    private LocalDate departureDate;

    @Column(name = "departure_time")
    private LocalTime departureTime;

    @Column(name = "duration")
    private Duration duration;

    @Column(name = "capacity")
    private int capacity;
}
