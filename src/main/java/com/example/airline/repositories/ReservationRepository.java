package com.example.airline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airline.models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{
    
}
