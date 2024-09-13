package com.example.airline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.airline.models.Reservation;

@Service

public interface ReservationService {
    List<Reservation> findAll();
    Optional<Reservation> findReservationById(Long id);
    Reservation createReservation(Reservation reservation);
    Optional<Reservation> updateReservation(Long id, Reservation newReservation);
    void deleteReservation(Long id);
}
