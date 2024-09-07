package com.example.airline.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Embeddable
    public static class ReservationKey implements Serializable {

        @Column(name = "id_customer")
        private Long customer;

        @Column(name = "id_flight")
        private Long flight;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ReservationKey that)) return false;
            return Objects.equals(customer, that.customer) && Objects.equals(flight, that.flight);
        }

        @Override
        public int hashCode() {
            return Objects.hash(customer, flight);
        }
    }

    @EmbeddedId
    private ReservationKey reservationKey;

    @ManyToOne
    @MapsId("customer")
    @JoinColumn(name = "id_customer", referencedColumnName = "id_customer")
    private Customer customer;

    @ManyToOne
    @MapsId("flight")
    @JoinColumn(name = "id_flight", referencedColumnName = "id_flight")
    private Flight flight;

    @Column(name = "reservation_date")
    private LocalDate reservationDate;

    @Column(name = "number_of_passengers")
    private int numberOfPassengers;

}
