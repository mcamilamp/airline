package com.example.airline.models;

import java.io.Serializable;
import java.time.Duration;

import jakarta.persistence.*;

@Entity
@Table(name = "stopovers")
public class Stopover {
    @Embeddable
    public static class StopoverKey implements Serializable {
        @Column(name = "id_flight")
        private Long idFlight;

        @Column(name = "id_airport")
        private Long idAirport;
    }

    @EmbeddedId
    private StopoverKey stopoverKey;

    @ManyToOne
    @MapsId("idFlight")
    @JoinColumn(name = "id_flight", nullable = false)
    private Flight flight;

    @ManyToOne
    @MapsId("idAirport")
    @JoinColumn(name = "id_airport", nullable = false)
    private Airport airport;

    @Column(name = "stopover_time")
    private Duration stopoverTime;

    // Getters and setters
}
