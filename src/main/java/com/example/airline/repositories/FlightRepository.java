package com.example.airline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airline.models.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{
    
}
