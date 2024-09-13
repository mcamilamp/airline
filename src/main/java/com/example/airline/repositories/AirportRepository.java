package com.example.airline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airline.models.Airport;

public interface AirportRepository extends JpaRepository<Airport, Long>{

    List<Airport> findAirportByName(String name);
    
}
