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

    // GETTERS AND SETTERS

    public Long getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(Long idFlight) {
        this.idFlight = idFlight;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Airport getOrigin() {
        return origin;
    }

    public void setOrigin(Airport origin) {
        this.origin = origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
}
