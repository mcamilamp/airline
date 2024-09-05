package com.example.airline.models;

import java.time.Duration;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "stopover")
public class Stopover {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stopover")
    private Long idStopover;

    @ManyToOne
    @JoinColumn(name = "id_flight", nullable = false)
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "id_airport", nullable = false)
    private Airport airport;

    @Column(name = "stopover_time")
    private Duration stopoverTime;

    // Getters and setters
}
