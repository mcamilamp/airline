package com.example.airline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airline.models.Airport;

public interface AirportRepository extends JpaRepository<Airport, Long>{
    
}
